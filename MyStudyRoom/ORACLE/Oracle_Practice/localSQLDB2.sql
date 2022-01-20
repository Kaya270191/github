create table userTBL(
userID char(8) not null primary key,
userName nvarchar2(10) not null,
birthYear number(4) not null,
addr nchar(2) not null,
mobile1 char(3),
mobile2 char(8),
height number(3),
mdate date);

create table buyTBL(
idnum number(8) not null primary key,
userID char(8) not null,
prodName nchar(6) not null,
groupname nchar(4),
price number(8) not null,
amount number(3) not null,
foreign key (userID) references userTBL(userID));


insert into userTBL values('LSG', '이승기' , 1987, '서울', '011', '11111111', 182, '2008-8-8');
insert into userTBL values('KBS', '김범수' , 1979, '경남', '011', '22222222', 173, '2012-4-4');
insert into userTBL values('KKH', '김경호' , 1971, '전남', '019', '33333333', 177, '2007-7-7');
insert into userTBL values('JYP', '조용필' , 1950, '경기', '011', '44444444', 166, '2009-4-4');
insert into userTBL values('SSK', '성시경' , 1979, '서울', NULL, NULL, 186, '2013-12-12');
insert into userTBL values('LJB', '임재범' , 1963, '서울', '016', '66666666', 182, '2009-9-9');
insert into userTBL values('YJS', '윤종신' , 1969, '경남', NULL, NULL, 170, '2005-5-5');
insert into userTBL values('EJW', '은지원' , 1972, '경북', '011', '88888888', 174, '2014-3-3');
insert into userTBL values('JKW', '조관우' , 1965, '경기', '018', '99999999', 172, '2010-10-10');
insert into userTBL values('BBK', '바비킴' , 1973, '서울', '010', '00000000', 176, '2013-5-5');


create sequence idSEQ; --순차 번호 입력을 위한 시퀀스 생성 
insert into buytbl values(idSEQ.nextval,'KBS','운동화',null,30,2);
insert into buytbl values(idSEQ.nextval,'KBS','노트북','전자',1000,1);
insert into buytbl values(idSEQ.nextval,'JYP','모니터','전자',200,1);
insert into buytbl values(idSEQ.nextval,'BBK','모니터','전자',200,5);
insert into buytbl values(idSEQ.nextval,'KBS','청바지','의류',50,3);
insert into buytbl values(idSEQ.nextval,'BBK','메모리','전자',80,10);
insert into buytbl values(idSEQ.nextval,'SSK','책','서적',15,5);
insert into buytbl values(idSEQ.nextval,'EJW','책','서적',15,2);
insert into buytbl values(idSEQ.nextval,'EJW','청바지','의류',50,1);
insert into buytbl values(idSEQ.nextval,'BBK','운동화',null,30,2);
insert into buytbl values(idSEQ.nextval,'EJW','책','서적',15,1);
insert into buytbl values(idSEQ.nextval,'BBK','운동화',null,30,2);

commit;

select* from userTBL;
select* from buyTBL;

select* from userTBL where username = '김경호';

select userid, username from userTBL where birthYear >=1970 and height >=182;

select userid, username from userTBL where birthYear >=1970 or height >=182;

select username, height from usertbl where height between 180 and 183;

select username, height, addr from usertbl where addr in ('경남', '전남', '경북');

select username, height, addr from usertbl where username like '김%';

select username, height from usertbl where username like '_종신';

select username, height from usertbl where height > 177;
--서브쿼리 
select username, height from usertbl where height > (select height from usertbl where username ='김경호');
--서브쿼리 값이 여러개이면 오류발생 -> any 는 서브쿼리의 여러 개의 결과 중 한가지만 만족해도 됨
select username, height, addr from usertbl where height >= any(select height from usertbl where addr ='경남');
--all은 서브쿼리의 여러 개의 결과를 모두 만족시켜야 함 
select username, height, addr from usertbl where height >= all(select height from usertbl where addr ='경남');
--any 다음의 서브쿼리의 결과와 동일한 값에 해당하는 사람만 출력 
select username, height, addr from usertbl where height = any(select height from usertbl where addr ='경남');

--order by 결과가 출력되는 순서 조절 
select username, mdate from usertbl order by mdate; --오름차순
select username, mdate from usertbl order by mdate desc; --내림차순 
--키 큰 순서(내림차순)으로 정렬하고 키가 동일하다면 이름 순으로 정렬 
select username, height from usertbl order by height desc, username;

--distinct 중복된 것은 하나만 남김
select distinct addr from usertbl;

--create table .. as select 테이블을 복사해서 사용할 경우- pk, fk는 복사가 안 됨 
create table buyTBL2 as (select * from buyTBL);
select * from buyTBL2;

create table buyTBL3 as (select userID, prodname from buyTBl);
select * from buyTBL3;

--group by 그룹을 묶어주는 역할
select userid, amount from buytbl order by userid;
--집계함수는 주로 group by 와 함께 쓰이며 데이터를 그룹화 해줌 
select userid, sum(amount) from buytbl group by userid;
select userid as "사용자아이디", sum(amount) as "총 구매 개수" from buytbl group by userid;
select userid as "사용자아이디", sum(amount) as "총 구매 개수", sum(amount * price) as "총 구매액" from buytbl group by userid;

select round(avg(amount),1)as "평균 구매 개수" from buyTBL;
--cast(숫자 as 치환할 형식) 
select cast(avg(amount) as number(5,3)) as "평균 구매 개수" from buyTBL;
select userid, cast(avg(amount) as number(5,3)) as "평균 구매 개수" from buytbl group by userid;

select username, max(height), min(height) from usertbl group by username;
--키가 최소나 최대인 사람 뽑기
select username, height from usertbl where height = (select max(height)from usertbl) or height = (select min(height) from usertbl);

--휴대폰이 있는 사람만 세기 
select count(mobile1) from usertbl ;

--having
select userid as "사용자", sum(price*amount) as "총 구매액" from buytbl group by userid having sum(price*amount) > 1000 ;

select userid as "사용자", sum(price*amount) as "총 구매액" from buytbl group by userid having sum(price*amount) >1000 order by sum(price*amount);


create or replace procedure userProc as v_bYear number;
begin 
select birthyear into v_byear from usertbl
where userid = 'SSK';
v_byear := v_byear +1;
DBMS_OUTPUT.PUT_LINE(v_byear);
end userProc;


