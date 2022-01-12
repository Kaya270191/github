create table TestTBL(
    testID char(5) not null enable, 
    testName nchar(8) not null enable, 
    PRIMARY KEY (testID)
    );

select*from memberTBL;

insert into memberTBL (memberid, membername, memberaddress) 
values('jee', 'jiun', '서울 은평구 중산동');

insert into memberTBl (memberid, membername, memberaddress)
values('kaya', 'gayeong', '대구 동구 서호동');

select *from memberTBL;

select*from productTBl;
insert into productTBL  values ('에어컨', '7', '20/11/02', '삼성', '16');
select*from productTBL;
insert into productTBL values ('건조기', '8', '21/02/03', 'LG', '20');
select*from productTBL;

select productname, company from productTBL;
select * from memberTBL;

select*from memberTBL where membername = 'yuna';

select*from testTbl;
insert into testTBL values ('abc', 'test');
drop table testTBL;

create table shop.indexTBL2
as 
    select first_name, last_name, hire_date from HR.employees;
    
select *from indexTBL2;
select *from indexTBL2 where  first_name='Jack';

create index idx_indexTBL2_firstname ON indexTBL2(first_name);


create view memberView
as 
    select membername, memberaddress from memberTBL;

select* from memberView;
select * from memberTBL;

select count(*) from memberTBL;
select count(*) from productTBL;



execute myprocedure;

set SERVEROUT on;

drop procedure myprocs;






