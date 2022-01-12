--select
select* from TB_POINT; --테이블 전체 
select customer_cd, point_memo, point from tb_point; -- 테이블에서 customer_cd, point_memo 
select customer_cd as 고객코드, customer_nm as "고객명", phone_number as "전화번호" from tb_customer; --한글 별명으로 바꾸기

--where
select* from tb_customer where mw_flg = 'm';
select customer_cd, customer_nm, mw_flg, birth_day from tb_customer where customer_nm = '김한길';
select customer_cd, customer_nm, email, total_point from tb_customer where total_point<10000;

--and
select customer_cd, customer_nm, mw_flg from tb_customer where customer_cd >2019000 and mw_flg = 'W';
select * from tb_customer where birth_day < '19900101' and mw_flg='M';
select customer_cd, seq_no, point from tb_point where customer_cd= '2017053' and seq_no ='2';

--or
select birth_day, total_point from tb_customer where birth_day >= '19900101' or  total_point >= 20000;
select * from tb_customer where birth_day >= '19900101' or  total_point >= 20000;
select mw_flg, birth_day, total_point from tb_customer where mw_flg='M' and (birth_day <= '19700101' or total_point >20000);
select * from tb_grade where (class_cd = 'A' or class_cd ='B') or (kor >= 80 and mat >= 80 and eng >= 80); 

--between ..and
select * from tb_customer where mw_flg ='W' and total_point between  10000 and 20000;
select * from tb_customer where birth_day between '19800101' and '19891231';
select * from tb_customer where total_point not between '10000' and '30000';
select * from tb_point where (point between 10000 and 50000) and reg_dttm like ('2018%');
select * from tb_point where reg_dttm = 2018 and point between 10000 and 50000;
select * from tb_grade where kor not between 56 and 90;

-- 비교연산자
select * from tb_customer where total_point < 10000 or total_point >= 30000;
select * from tb_customer where not mw_flg ='W' and total_point <=10000;

select customer_cd, total_point, customer_nm, mw_flg, birth_day from tb_customer 
where total_point >=20000 and mw_flg ='M' and birth_day <='19891231' and birth_day >='19800101';

--like
select * from tb_customer where customer_cd like '2018%'; --2018로 시작하는 데이터
select * from tb_customer where phone_number not like '___-___-___'; --‘___-___-___’ 형식이 아닌 데이터를 검색

select * from tb_customer 
where (customer_cd like ('2017%') 
or customer_cd like ('2019%'))
and mw_flg='W';


select customer_cd, customer_nm, mw_flg, birth_day, total_point 
from tb_customer 
where mw_flg ='M' 
and (birth_day like '_____5__' or birth_day like '_____6__' or birth_day like '_____7__');

select * from tb_customer
where 
((customer_cd like '2017%') and mw_flg = 'M'
or (customer_cd like '2019%') and mw_flg = 'W')
and total_point <= 30000;

--in

select * from tb_customer
where customer_nm in('나경숙', '이혜옥','김한길','이아름');

select * from tb_customer
where customer_cd in ('2017108','2018254','2019167') and mw_flg ='M';

select * from tb_item_info
where item_cd in ('S01', 'S04', 'S06', 'S10');

select * from tb_point
where customer_cd in ('2017042', '2018087', '2019095') 
and point_memo like ('%구매%');






