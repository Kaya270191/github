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


insert into userTBL values('LSG', '�̽±�' , 1987, '����', '011', '11111111', 182, '2008-8-8');
insert into userTBL values('KBS', '�����' , 1979, '�泲', '011', '22222222', 173, '2012-4-4');
insert into userTBL values('KKH', '���ȣ' , 1971, '����', '019', '33333333', 177, '2007-7-7');
insert into userTBL values('JYP', '������' , 1950, '���', '011', '44444444', 166, '2009-4-4');
insert into userTBL values('SSK', '���ð�' , 1979, '����', NULL, NULL, 186, '2013-12-12');
insert into userTBL values('LJB', '�����' , 1963, '����', '016', '66666666', 182, '2009-9-9');
insert into userTBL values('YJS', '������' , 1969, '�泲', NULL, NULL, 170, '2005-5-5');
insert into userTBL values('EJW', '������' , 1972, '���', '011', '88888888', 174, '2014-3-3');
insert into userTBL values('JKW', '������' , 1965, '���', '018', '99999999', 172, '2010-10-10');
insert into userTBL values('BBK', '�ٺ�Ŵ' , 1973, '����', '010', '00000000', 176, '2013-5-5');


create sequence idSEQ; --���� ��ȣ �Է��� ���� ������ ���� 
insert into buytbl values(idSEQ.nextval,'KBS','�ȭ',null,30,2);
insert into buytbl values(idSEQ.nextval,'KBS','��Ʈ��','����',1000,1);
insert into buytbl values(idSEQ.nextval,'JYP','�����','����',200,1);
insert into buytbl values(idSEQ.nextval,'BBK','�����','����',200,5);
insert into buytbl values(idSEQ.nextval,'KBS','û����','�Ƿ�',50,3);
insert into buytbl values(idSEQ.nextval,'BBK','�޸�','����',80,10);
insert into buytbl values(idSEQ.nextval,'SSK','å','����',15,5);
insert into buytbl values(idSEQ.nextval,'EJW','å','����',15,2);
insert into buytbl values(idSEQ.nextval,'EJW','û����','�Ƿ�',50,1);
insert into buytbl values(idSEQ.nextval,'BBK','�ȭ',null,30,2);
insert into buytbl values(idSEQ.nextval,'EJW','å','����',15,1);
insert into buytbl values(idSEQ.nextval,'BBK','�ȭ',null,30,2);

commit;

select* from userTBL;
select* from buyTBL;

select* from userTBL where username = '���ȣ';

select userid, username from userTBL where birthYear >=1970 and height >=182;

select userid, username from userTBL where birthYear >=1970 or height >=182;

select username, height from usertbl where height between 180 and 183;

select username, height, addr from usertbl where addr in ('�泲', '����', '���');

select username, height, addr from usertbl where username like '��%';

select username, height from usertbl where username like '_����';

select username, height from usertbl where height > 177;
--�������� 
select username, height from usertbl where height > (select height from usertbl where username ='���ȣ');
--�������� ���� �������̸� �����߻� -> any �� ���������� ���� ���� ��� �� �Ѱ����� �����ص� ��
select username, height, addr from usertbl where height >= any(select height from usertbl where addr ='�泲');
--all�� ���������� ���� ���� ����� ��� �������Ѿ� �� 
select username, height, addr from usertbl where height >= all(select height from usertbl where addr ='�泲');
--any ������ ���������� ����� ������ ���� �ش��ϴ� ����� ��� 
select username, height, addr from usertbl where height = any(select height from usertbl where addr ='�泲');

--order by ����� ��µǴ� ���� ���� 
select username, mdate from usertbl order by mdate; --��������
select username, mdate from usertbl order by mdate desc; --�������� 
--Ű ū ����(��������)���� �����ϰ� Ű�� �����ϴٸ� �̸� ������ ���� 
select username, height from usertbl order by height desc, username;

--distinct �ߺ��� ���� �ϳ��� ����
select distinct addr from usertbl;

--create table .. as select ���̺��� �����ؼ� ����� ���- pk, fk�� ���簡 �� �� 
create table buyTBL2 as (select * from buyTBL);
select * from buyTBL2;

create table buyTBL3 as (select userID, prodname from buyTBl);
select * from buyTBL3;

--group by �׷��� �����ִ� ����
select userid, amount from buytbl order by userid;
--�����Լ��� �ַ� group by �� �Բ� ���̸� �����͸� �׷�ȭ ���� 
select userid, sum(amount) from buytbl group by userid;
select userid as "����ھ��̵�", sum(amount) as "�� ���� ����" from buytbl group by userid;
select userid as "����ھ��̵�", sum(amount) as "�� ���� ����", sum(amount * price) as "�� ���ž�" from buytbl group by userid;

select round(avg(amount),1)as "��� ���� ����" from buyTBL;
--cast(���� as ġȯ�� ����) 
select cast(avg(amount) as number(5,3)) as "��� ���� ����" from buyTBL;
select userid, cast(avg(amount) as number(5,3)) as "��� ���� ����" from buytbl group by userid;

select username, max(height), min(height) from usertbl group by username;
--Ű�� �ּҳ� �ִ��� ��� �̱�
select username, height from usertbl where height = (select max(height)from usertbl) or height = (select min(height) from usertbl);

--�޴����� �ִ� ����� ���� 
select count(mobile1) from usertbl ;

--having
select userid as "�����", sum(price*amount) as "�� ���ž�" from buytbl group by userid having sum(price*amount) > 1000 ;

select userid as "�����", sum(price*amount) as "�� ���ž�" from buytbl group by userid having sum(price*amount) >1000 order by sum(price*amount);


create or replace procedure userProc as v_bYear number;
begin 
select birthyear into v_byear from usertbl
where userid = 'SSK';
v_byear := v_byear +1;
DBMS_OUTPUT.PUT_LINE(v_byear);
end userProc;


