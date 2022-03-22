package com.shop.repository;

import com.shop.dto.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import java.util.List;

//JpaRepository 를 상속받은 ItemRepository 인터페이스
//QuerydslPredicateExecutor<> 을 이용-> 상품 조회함
public interface ItemRepository extends JpaRepository<Item, Long>, QuerydslPredicateExecutor<Item> {
    //쿼리 메소드
    List<Item> findByItemNm(String itemNm); //쿼리메소드 findBy변수이름

    List<Item> findByItemNmOrItemDetail(String itemNm, String itemDetail);

    List<Item> findByPriceLessThan(Integer price);

    List<Item> findByPriceLessThanOrderByPriceDesc(Integer price);

    List<Item> findByItemDetailNot(String itemDetail);

    //쿼리 어노테이션 i 는 객체 자체를 가리킴
    @Query("select i from Item i where i.itemDetail like " +
            "%:itemDetail% order by i.price desc")
    List<Item> findByItemDetail(@Param("itemDetail") String itemDetail);//메서드 추가

    //쿼리 어노테이션 - nativeQuery
    @Query(value = "select * from item i where i.item_detail like %:itemDetail% order by i.price desc ", nativeQuery = true)
    List<Item> findByItemDetailByNative(@Param("itemDetail") String itemDetail);

}

