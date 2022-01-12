--order by
select* from tb_customer order by mw_flg desc, customer_nm;

select* from tb_customer order by mw_flg desc, customer_nm asc;

select * from tb_customer where mw_flg= 'M' order by total_point desc;

--고객포인트 테이블에서 등록일이 '2019＇년이고 포인트내용에 '구매'가 포함된 데이터를
-- 포인트가 큰 순서대로 검색
select * from tb_point 
where reg_dttm like '2019%' 
and point_memo like '%구매%' 
order by point desc;

--성적 테이블에서 ‘B’반의 국어, 영어, 수학 점수의 합계가 높은 순으로 검색
select * from tb_grade where class_cd = 'B' order by kor + eng + mat desc;


--group by
select class_cd from tb_grade group by class_cd;
--round( ,소수점)
select class_cd, sum(kor), round(avg(kor),1), min(kor), max(kor),count(kor)
from tb_grade group by class_cd;

select class_cd, sum(kor), round(avg(kor),1), min(kor), max(kor),count(kor)
from tb_grade group by class_cd having avg(kor)>=80;


select class_cd, sum(eng), round(avg(eng)), min(eng), max(eng), count(eng) 
from tb_grade group by class_cd;

select class_cd, sum(kor) as "K합계", sum(eng) as "E합계", sum(mat) as "M합계",
round(avg(kor),1) as "K평균", round(avg(eng),1) as "E평균", round(avg(mat),1) as "M평균"
from tb_grade group by class_cd;

select class_cd, sum(kor) as "K합계", sum(eng) as "E합계", sum(mat) as "M합계",
round(avg(kor),1) as "K평균", round(avg(eng),1) as "E평균", round(avg(mat),1) as "M평균"
from tb_grade group by class_cd  having round(avg(kor),1)>=80;

select sales_dt, product_nm, sum(sales_count) from tb_sales 
where sales_dt in ('20190802','20190803') 
group by sales_dt, product_nm
order by sales_dt, product_nm;




--join
select* from tb_grade;
select* from tb_class_info;
select class_nm, student_no, student_nm, kor, eng, mat
from tb_grade A
join tb_class_info B
on A.class_cd = b.class_cd;


select class_nm, student_no, student_nm, kor, eng, mat
from tb_grade A
join tb_class_info B
where a.class_cd = b.class_cd;





