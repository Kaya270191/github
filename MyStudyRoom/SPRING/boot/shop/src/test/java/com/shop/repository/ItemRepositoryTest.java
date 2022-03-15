package com.shop.repository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.shop.constant.ItemSellStatus;
import com.shop.entity.Item;
import com.shop.entity.QItem;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.test.context.TestPropertySource;
import org.thymeleaf.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest //통합 테스트 하는데 필요한 환경을 만들어줌
@TestPropertySource(locations = "classpath:application-test.properties") //위치를 우선순위를 정해 테스트를 함
class ItemRepositoryTest {

    @Autowired //빈 객체가 만들어짐
    ItemRepository itemRepository;

    @Test
    @DisplayName("상품 저장 테스트")
    public void createItemTest(){
        Item item = new Item();
        item.setItemNm("테스트상품");
        item.setPrice(10000);
        item.setItemDetail("테스트상품 상세 설명");
        item.setItemSellStatus(ItemSellStatus.SELL);
        item.setStockNumber(100);
        item.setRegTime(LocalDateTime.now());
        Item savedItem = itemRepository.save(item);

        System.out.println(savedItem.toString());
    }

    @Test
    public void createItemList(){
        for(int i=1; i<=10; i++){
            Item item = new Item();
            item.setItemNm("테스트상품" + i);
            item.setPrice(10000 + i );
            item.setItemDetail("테스트 상품 상세설명" + i);
            item.setItemSellStatus(ItemSellStatus.SELL);
            item.setStockNumber(100);
            item.setRegTime(LocalDateTime.now());
            Item savedItem = itemRepository.save(item); //itemRepository에 item 저장 
        }
    }

    @Test
    @DisplayName("상품명 조회 테스트")
    public void findByItemNmTest(){
        this.createItemTest();
        List<Item> itemList = itemRepository.findByItemNm("테스트 상품1");
        for(Item item : itemList){ //Item 타입의 item 변수가 itemList에 있는걸 반복문 돌 때마다 하나씩 꺼냄
            System.out.println(item.toString()); //객체 출력
        }
    }

    @Test
    @DisplayName("상품명 or 상품 상세설명 테스트")
    public void findByItemNmOrItemDetailTest(){
        this.createItemList();
        List<Item> itemList = itemRepository.findByItemNmOrItemDetail("테스트상품1","테스트 상품 상세 설명5");
        for(Item item : itemList){
            System.out.println(item.toString());
        }
    }

    @Test
    @DisplayName("가격 LessThan 테스트")
    public void findByPriceLessThanTest(){
        this.createItemList();
        List<Item> itemList = itemRepository.findByPriceLessThan(10005); //가격이 10005미만
        for (Item item : itemList){
            System.out.println(item.toString());
        }
    }

    @Test
    @DisplayName("가격 내림차순 조회 테스트")
    public void findByPriceLessThanOrderByPriceDesc(){
        this.createItemList();
        List<Item> itemList = itemRepository.findByPriceLessThanOrderByPriceDesc(10005); //가격10005 미만 내림차순
        for(Item item : itemList){
            System.out.println(item.toString());
        }
    }

    @Test
    @DisplayName("상품 디테일 조회 not 테스트")
    public void findByItemDetailNot(){
        this.createItemList();
        List<Item> itemList = itemRepository.findByItemDetailNot("테스트 상품 상세설명5"); //테스트 상품 상세설명5 만 빼고 조회
        for(Item item : itemList){
            System.out.println(item.toString());
        }
    }


    @Test
    @DisplayName("@Query를 이용한 상품 조회 테스트")
    public void findByItemDetailTest(){
        this.createItemList();
        List<Item> itemList = itemRepository.findByItemDetail("테스트 상품 상세 설명");
        for(Item item : itemList){
            System.out.println(item.toString());
        }
    }

    @Test
    @DisplayName("nativeQuery 속성을 이용한 상품 조회 테스트")
    public void findByItemDetailByNative(){
        this.createItemList();
        List<Item> itemList = itemRepository.findByItemDetailByNative("테스트 상품 상세 설명");
        for(Item item : itemList){
            System.out.println(item.toString());
        }
    }

    //JPAQueryFactory 이용
    @PersistenceContext
    EntityManager em;

    @Test
    @DisplayName("Querydsl 조회 테스트1")
    public void queryDslTest(){
        this.createItemList();
        JPAQueryFactory queryFactory = new JPAQueryFactory(em);
        QItem qItem = QItem.item;
        JPAQuery<Item> query = queryFactory.selectFrom(qItem)
                .where(qItem.itemSellStatus.eq(ItemSellStatus.SELL))
                .where(qItem.itemDetail.like("%" + "테스트 상품 상세 설명" + "%"))
                .orderBy(qItem.price.desc());

        List<Item> itemList = query.fetch(); //조회 결과 리스트 반환
        for(Item item : itemList){
            System.out.println(item.toString());
        }
    }


    public void createItemList2(){
        for(int i=1; i<=5; i++){
            Item item = new Item();
            item.setItemNm("테스트 상품" + i);
            item.setPrice(10000 + i);
            item.setItemDetail("테스트 상품 상세 설명" + i);
            item.setItemSellStatus(ItemSellStatus.SELL);
            item.setStockNumber(100);
            item.setRegTime(LocalDateTime.now());
            item.setUpdateTime(LocalDateTime.now());
            itemRepository.save(item);
        }
        for(int i=6; i<=10; i++){
            Item item = new Item();
            item.setItemNm("테스트 상품" + i);
            item.setPrice(10000 + i);
            item.setItemDetail("테스트 상품 상세 설명" + i);
            item.setItemSellStatus(ItemSellStatus.SOLD_OUT);
            item.setStockNumber(0);
            item.setRegTime(LocalDateTime.now());
            item.setUpdateTime(LocalDateTime.now());
            itemRepository.save(item);
        }
    }

    //QuerydslPredicateExecutor 이용한 상품조회
    @Test
    @DisplayName("상품 Querydsl 조회 테스트2")
    public void queryDslTest2(){

        this.createItemList2(); //객체 리스트 생성

        BooleanBuilder booleanBuilder = new BooleanBuilder(); //BooleanBuilder 객체 생성 
        QItem item = QItem.item; //QItem 객체 
        String itemDetail = "테스트 상품 상세 설명"; //QItem 객체의 조건
        int price = 10003;  //QItem 객체의 조건
        String itemSellStat = "SELL";   //QItem 객체의 조건

        booleanBuilder.and(item.itemDetail.like("%" + itemDetail + "%")); //boolean객체에 item조건을 붙이기
        booleanBuilder.and(item.price.gt(price)); //가격이 10003 이상

        //StringUtils:문자열 클래스
        //booleanBuilder : where 뒤에 조건을 생성해 주는 것
        if(StringUtils.equals(itemSellStat, ItemSellStatus.SELL)){ //변수와 ItemSellStatus 클래스의 멤버변수인SELL이 같으면
            booleanBuilder.and(item.itemSellStatus.eq(ItemSellStatus.SELL)); //
        }

        Pageable pageable = PageRequest.of(0,5);

        //조건에 맞는 페이지 데이터 반환 Page<T> findAll(Predicate, Pageable>
        Page<Item> itemPagingResult = itemRepository.findAll( booleanBuilder, pageable);
        System.out.println("total elements : " + itemPagingResult.getTotalElements());


        List<Item> resultItemList = itemPagingResult.getContent(); //조건에 맞는 item 을 리스트에 담기
        for(Item resultItem : resultItemList){ //출력
            System.out.println(resultItem.toString());
        }
    }
}