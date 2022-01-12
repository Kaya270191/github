create table TB_GRADE_2020( --2020�� ���� ���̺� 
    TEST_MONTH CHAR(2 BYTE) NOT NULL,
    TEST_CD CHAR(3 BYTE) NOT NULL,
    KOR NUMBER(3),
    ENG NUMBER(3),
    MAT NUMBER(3));

create unique index PK_TB_GRADE_2020 on TB_GRADE_2020 (TEST_MONTH);
alter table TB_GRADE_2020 add (CONSTRAINT PK_TB_GRADE_2020 PRIMARY KEY (TEST_MONTH));

create table TB_CLASS_INFO( --�� ���� ���̺� 
    CLASS_CD CHAR(1 BYTE) NOT NULL,
    CLASS_NM VARCHAR2(20 BYTE) NOT NULL
    );

create unique index PK_TB_CLASS_INFO on TB_CLASS_INFO (CLASS_CD, CLASS_NM);
alter table TB_CLASS_INFO add (CONSTRAINT PK_TB_CLASS_INFO PRIMARY KEY (CLASS_CD, CLASS_NM));

create table TB_SALES( --�Ǹ� ���̺� 
    SALES_DT CHAR(8 BYTE) NOT NULL,
    SEQ_NO NUMBER(5) NOT NULL,
    PRODUCT_NM VARCHAR2(20 BYTE),
    PRICE NUMBER(10),
    SALES_COUNT NUMBER(3)
    );

create unique index PK_TB_SALES ON TB_SALES (SALES_DT, SEQ_NO);
alter table TB_SALES add (CONSTRAINT PK_TB_SALES PRIMARY KEY (SALES_DT, SEQ_NO));

create table TB_SALES_09( --9�� �Ǹ� ���̺� 
    SEQ_NO NUMBER(10) not null,
    PRODUCT_NM VARCHAR2(20 BYTE),
    CUSTOMER_CD CHAR(7 BYTE),
    SALES_COUNT NUMBER(3)
    );
    
create unique index PK_TB_SALES_09 ON TB_SALES_09 (SEQ_NO);
alter table TB_SALES_09 ADD (CONSTRAINT PK_TB_SALES_09 PRIMARY KEY (SEQ_NO));

create table TB_TRAIN_TM( --���� �ð�ǥ ���̺� 
    TRAIN_NO CHAR(5 BYTE) NOT NULL,
    RUN_ORDR NUMBER(5) NOT NULL,
    STATION_NM VARCHAR(20 BYTE),
    ARV_TM CHAR(6 BYTE),
    DPT_TM CHAR(6 BYTE)
    );

create unique index PK_TB_TRAIN_TM on TB_TRAIN_TM (TRAIN_NO, RUN_ORDR);
alter table TB_TRAIN_TM add (CONSTRAINT PK_TB_TRAIN_TM PRIMARY KEY (TRAIN_NO, RUN_ORDR));

create table TB_POINT_INFO( --����Ʈ ���� ���̺� (��������, ���ν����� ���/����)
    YEAR CHAR(4 BYTE) NOT NULL,
    RANK NUMBER(10) NOT NULL,
    CUSTOMER_CD CHAR(7 BYTE) NOT NULL,
    POINT NUMBER(10),
    LAST_POINT_DT CHAR(8 BYTE)
    );
    
create unique index PK_TB_POINT_INFO ON TB_POINT_INFO(YEAR, RANK);
alter table TB_POINT_INFO add (CONSTRAINT PK_TB_POINT_INFO PRIMARY KEY (YEAR,RANK));


--�� ���̺�
create table tb_customer
(
    customer_cd char(7byte) not null, --���ڵ�
    customer_nm varchar2(10) not null, --����
    mw_flg char(1) not null, --��������
    birth_day char(8) not null, --����
    phone_number varchar2(16), --��ȭ��ȣ
    email varchar2(30),
    total_point number(10),--��������Ʈ
    reg_dttm char(14) --�����
);
create unique index pk_tb_customer on tb_customer(customer_cd);
alter table tb_customer add(constraint pk_tb_customer primary key(customer_cd));
--�߰� �� ���̺�
create table tb_add_customer
(
    customer_cd char(7) not null, --���ڵ�
    customer_nm varchar2(10) not null, --����
    mw_flg char(1) not null, --��������
    birth_day char(8) not null, --����
    phone_number varchar2(16) --��ȭ��ȣ
);
create UNIQUE INDEX pk_tb_add_customer ON tb_add_customer (customer_cd);
alter table tb_add_customer add (constraint pk_tb_add_customer primary key(customer_cd));

--����Ʈ ���̺�
create table tb_point
(
    customer_cd char(7) not null, --���ڵ�
    seq_no number(10) not null, --�Ϸù�ȣ
    point_memo varchar2(50), --����Ʈ����
    point number(10), --����Ʈ
    reg_dttm char(14) --�����
);
create unique index pk_tb_point on tp_point(customer_cd,seq_no);
alter table tb_point add (constraint pk_tb_point primary key(customer_cd,seq_no));

--2017�� ����Ʈ ���̺�
create table tb_point_2017
(
customer_cd char(7) not null, --���ڵ�
seq_no number(10) not null, --�Ϸù�ȣ
point_memo varchar2(50), --����Ʈ ����
point number(10), --����Ʈ
reg_dttm char(14) --�����
);
create unique index pk_tb_point_2017 on tb_point_2017(customer_cd,seq_no);
alter table tb_point_2017 add (constraint pk_tb_point_2017 primary key(customer_cd,seq_no));

--2018�� ����Ʈ ���̺�
create table tb_point_2018
(
customer_cd char(7) not null, --���ڵ�
seq_no number(10) not null, --�Ϸù�ȣ
point_memo varchar2(50), --����Ʈ ����
point number(10), --����Ʈ
reg_dttm char(14) --�����
);
create unique index pk_tb_point_2018 on tb_point_2018(customer_cd,seq_no);
alter table tb_point_2018 add (constraint pk_tb_point_2018 primary key(customer_cd,seq_no));

--2019�� ����Ʈ ���̺�
create table tb_point_2019
(
customer_cd char(7) not null, --���ڵ�
seq_no number(10) not null, --�Ϸù�ȣ
point_memo varchar2(50), --����Ʈ ����
point number(10), --����Ʈ
reg_dttm char(14) --�����
);
create unique index pk_tb_point_2019 on tb_point_2019(customer_cd,seq_no);
alter table tb_point_2019 add (constraint pk_tb_point_2019 primary key(customer_cd,seq_no));

--��Ÿ���� ���̺�
CREATE TABLE TB_ETC_INFO(
    CUSTOMER_CD CHAR(7) NOT NULL, --�� �ڵ�
    CUSTOMER_ENG_NM VARCHAR(20), --���� ����
    ITEM_LIST VARCHAR2(40) --���� ǰ��
);
CREATE UNIQUE INDEX PK_TB_INFO ON TB_ETC_INFO (CUSTOMER_CD);
ALTER TABLE TB_ETC_INFO ADD(CONSTRAINT PK_RB_ETC_INFO PRIMARY KEY (CUSTOMER_CD));


--ǰ������ ���̺�
CREATE TABLE TB_ITEM_INFO(
    ITEM_CD CHAR(7) NOT NULL, --���� ǰ�� �ڵ�
    ITEM_NM VARCHAR(20) --���� ǰ���
);
CREATE UNIQUE INDEX PK_TB_ITEM ON TB_ITEM_INFO (ITEM_CD);
ALTER TABLE TB_ITEM_INFO ADD (CONSTRAINT PK_TB_ITEM_INFO PRIMARY KEY (ITEM_CD));


--���� ���̺�
CREATE TABLE TB_GRADE(
    CLASS_CD CHAR(1) NOT NULL, --���ڵ�
    STUDENT_NO NUMBER(2) NOT NULL, -- �л���ȣ
    STUDENT_NM VARCHAR2(10) NOT NULL, --�л���
    KOR NUMBER(3), --����
    ENG NUMBER(3), --����
    MAT NUMBER(3), --����
    TOT NUMBER(3), --�հ�
    AVG NUMBER(5,1) --���
);
CREATE UNIQUE INDEX PK_TB_GRADE ON TB_GRADE (CLASS_CD, STUDENT_NO);
ALTER TABLE TB_GRADE ADD (CONSTRAINT PK_TB_GRADE PRIMARY KEY (CLASS_CD,STUDENT_NO));


--7�� ���� ���̺�
CREATE TABLE TB_GRADE_07(
    TEST_CD CHAR(3) NOT NULL, --�����ڵ�
    KOR NUMBER(3), --����
    ENG NUMBER(3), --����
    MAT NUMBER(3) --����
);
CREATE UNIQUE INDEX PK_TB_GRADE_07 ON TB_GRADE_07 (TEST_CD);
ALTER TABLE TB_GRADE_07 ADD (CONSTRAINT PK_TB_GRADE_07 PRIMARY KEY (TEST_CD));


--8�� ���� ���̺�
CREATE TABLE TB_GRADE_08(
    TEST_CD CHAR(3) NOT NULL, --�����ڵ�
    KOR NUMBER(3), --����
    ENG NUMBER(3), --����
    MAT NUMBER(3) --����
);
CREATE UNIQUE INDEX PK_TB_GRADE_08 ON TB_GRADE_08 (TEST_CD);
ALTER TABLE TB_GRADE_08 ADD (CONSTRAINT PK_TB_GRADE_08 PRIMARY KEY (TEST_CD));


--9�� ���� ���̺�
CREATE TABLE TB_GRADE_09(
    TEST_CD CHAR(3) NOT NULL, --�����ڵ�
    KOR NUMBER(3), --����
    ENG NUMBER(3), --����
    MAT NUMBER(3) --����
);
CREATE UNIQUE INDEX PK_TB_GRADE_09 ON TB_GRADE_09 (TEST_CD);
ALTER TABLE TB_GRADE_09 ADD (CONSTRAINT PK_TB_GRADE_09 PRIMARY KEY (TEST_CD));



DELETE FROM TB_ITEM_INFO; --��ǰ ���� ���̺� 
INSERT INTO TB_ITEM_INFO VALUES('S01', '�Ƿ�/��ȭ');
INSERT INTO TB_ITEM_INFO VALUES('S02', '��Ƽ');
INSERT INTO TB_ITEM_INFO VALUES('S03', '����/�ڵ���');
INSERT INTO TB_ITEM_INFO VALUES('S04', '��ǰ');
INSERT INTO TB_ITEM_INFO VALUES('S05', '��Ȱ/�ǰ�');
INSERT INTO TB_ITEM_INFO VALUES('S06', '����/���׸���');
INSERT INTO TB_ITEM_INFO VALUES('S07', '����');
INSERT INTO TB_ITEM_INFO VALUES('S08', '����/���');
INSERT INTO TB_ITEM_INFO VALUES('S09', '��ǻ��');
INSERT INTO TB_ITEM_INFO VALUES('S010', '�귣��');





DELETE FROM TB_GRADE;-- �������̺� 
INSERT INTO TB_GRADE VALUES('A',1,'������', 87,94,98,0,0);
INSERT INTO TB_GRADE VALUES('A',2,'�����', 68,86,78,0,0);
INSERT INTO TB_GRADE VALUES('B',1,'�ڽ´�', 90,92,86,0,0);
INSERT INTO TB_GRADE VALUES('B',2,'������', 96,100,92,0,0);
INSERT INTO TB_GRADE VALUES('B',3,'������', 98,86,78,0,0);
INSERT INTO TB_GRADE VALUES('C',1,'������', 95,77,95,0,0);
INSERT INTO TB_GRADE VALUES('C',2,'���ѱ�', 73,84,100,0,0);
INSERT INTO TB_GRADE VALUES('D',1,'���üҸ�', 56,68,78,0,0);
INSERT INTO TB_GRADE VALUES('D',2,'������', 94,68,68,0,0);
INSERT INTO TB_GRADE VALUES('D',3,'�̾Ƹ�', 100,87,95,0,0);


DELETE FROM TB_GRADE_07; --7�� ���� ���̺� 
INSERT INTO TB_GRADE_07 VALUES('T01', 87, 94, 98);
INSERT INTO TB_GRADE_07 VALUES('T02', 68, 86, 78);
INSERT INTO TB_GRADE_07 VALUES('T03', 86, 94, 92);
INSERT INTO TB_GRADE_07 VALUES('T04', 96, 90, 86);
INSERT INTO TB_GRADE_07 VALUES('T05', 92, 92, 96);
INSERT INTO TB_GRADE_07 VALUES('T06', 86, 94, 86);
INSERT INTO TB_GRADE_07 VALUES('T07', 96, 100, 92);
INSERT INTO TB_GRADE_07 VALUES('T08', 92, 98, 86);
INSERT INTO TB_GRADE_07 VALUES('T09', 98, 86, 78);
INSERT INTO TB_GRADE_07 VALUES('T10', 94, 84, 86);


DELETE FROM TB_GRADE_08; --8�� ���� ���̺�
INSERT INTO TB_GRADE_08 VALUES('T01', 87, 94, 98);
INSERT INTO TB_GRADE_08 VALUES('T02', 68, 86, 78);
INSERT INTO TB_GRADE_08 VALUES('T04', 90, 92, 86);
INSERT INTO TB_GRADE_08 VALUES('T07', 96, 100, 92);
INSERT INTO TB_GRADE_08 VALUES('T09', 98, 86, 78);


DELETE FROM TB_ETC_INFO; --��Ÿ���� ���̺�
INSERT INTO TB_ETC_INFO VALUES ('2017042', 'Gang won gin', 'S01,S05,S06,S09');
INSERT INTO TB_ETC_INFO VALUES ('2017053', 'Na kyoung suk', 'S02,S03,S07');
INSERT INTO TB_ETC_INFO VALUES ('2017108', 'park seung dea', 'S05,S06,S08');
INSERT INTO TB_ETC_INFO VALUES ('2018087', 'seo you ri', 'S03,S06');
INSERT INTO TB_ETC_INFO VALUES ('2018254', 'lee hye ok', 'S08');
INSERT INTO TB_ETC_INFO VALUES ('2019001', 'kim jin suk', 'S01,S05,S07');
INSERT INTO TB_ETC_INFO VALUES ('2019069', 'KIM HAN KIL', 'S03,S06,S07');
INSERT INTO TB_ETC_INFO VALUES ('2019095', 'NAMKYUNG SOMANG', 'S02,S07,S09');
INSERT INTO TB_ETC_INFO VALUES ('2019167', 'han chan hee', 'S01,S07');
INSERT INTO TB_ETC_INFO VALUES ('2019281', 'lee a rum', 'S06');





--9�� ���� ���̺�
DELETE FROM TB_GRADE_09;
INSERT INTO TB_GRADE_09 VALUES ('T01', 95, 77, 95);
INSERT INTO TB_GRADE_09 VALUES ('T04', 73, 84, 100);
INSERT INTO TB_GRADE_09 VALUES ('T05', 56, 68, 78);
INSERT INTO TB_GRADE_09 VALUES ('T07', 94, 90, 68);
INSERT INTO TB_GRADE_09 VALUES ('T08', 100, 87, 95);


--�� ���� ���̺�
DELETE FROM TB_CLASS_INFO;
INSERT INTO TB_CLASS_INFO VALUES ('A','�����Խù�');
INSERT INTO TB_CLASS_INFO VALUES ('B','�ܰ���');
INSERT INTO TB_CLASS_INFO VALUES ('C','�������Թ�');
INSERT INTO TB_CLASS_INFO VALUES ('D','�Ϲ��ι�');


--�Ǹ� ���̺�
DELETE FROM TB_SALES;
INSERT INTO TB_SALES VALUES ('20190801',1,'��Ʈ��',1045000, 4);
INSERT INTO TB_SALES VALUES ('20190801',2,'û�ұ�',545000, 2);
INSERT INTO TB_SALES VALUES ('20190801',3,'��Ʈ��',1021000, 6);
INSERT INTO TB_SALES VALUES ('20190802',1,'��ǳ��',70000, 21);
INSERT INTO TB_SALES VALUES ('20190802',2,'�����',1870000, 7);
INSERT INTO TB_SALES VALUES ('20190803',1,'��ǳ��',92000, 32);
INSERT INTO TB_SALES VALUES ('20190803',2,'�����',2012000, 3);
INSERT INTO TB_SALES VALUES ('20190803',3,'��ǳ��',70000, 15);
INSERT INTO TB_SALES VALUES ('20190803',4,'��ǳ��',92000, 24);
INSERT INTO TB_SALES VALUES ('20190804',1,'û�ұ�',980000, 5);


--�����ð�ǥ ���̺�
DELETE FROM TB_TRAIN_TM;
INSERT INTO TB_TRAIN_TM VALUES ('101',1,'����','092000', '092000');
INSERT INTO TB_TRAIN_TM VALUES ('101',2,'����','095400', '095600');
INSERT INTO TB_TRAIN_TM VALUES ('101',3,'����','103800', '104100');
INSERT INTO TB_TRAIN_TM VALUES ('101',4,'�뱸','112500', '112730');
INSERT INTO TB_TRAIN_TM VALUES ('101',5,'�λ�','130500', '130500');
INSERT INTO TB_TRAIN_TM VALUES ('103',1,'����','130800', '130800');
INSERT INTO TB_TRAIN_TM VALUES ('103',2,'����','142100', '142300');
INSERT INTO TB_TRAIN_TM VALUES ('103',3,'�뱸','151200', '151430');
INSERT INTO TB_TRAIN_TM VALUES ('103',4,'�λ�','160400', '160400');
INSERT INTO TB_TRAIN_TM VALUES ('106',1,'�λ�','083500', '083500');
INSERT INTO TB_TRAIN_TM VALUES ('106',2,'����','100200', '100530');
INSERT INTO TB_TRAIN_TM VALUES ('106',3,'����','112800', '112800');

--�����ͺ��̽��� �ݿ�
COMMIT;

--�� ���̺�
delete from tb_customer;
SELECT* FROM tb_customer;
insert into tb_customer values('2017042','������','M','19810603','002-8202-8790','wjgang@navi.com',280300,'20170123132432');
insert into tb_customer values('2017053','�����','W','19891225','002-4509-0043','ksna#boram.co.kr',4500,'20170210180930');
insert into tb_customer values('2017108','�ڽ´�','M','19711430','','sdpark@haso.com',23450,'20170508203450');
INSERT into TB_CUSTOMER VALUES ('2018087', '������', 'W', '19810925','003-1265-8372', 'urseo@epnt.co.kr',18700, '20180204160903');
INSERT INTO TB_CUSTOMER VALUES ('2018254','������','W', '19839012','003_1287_9734', 'hylee@hansoft.com',570, '20180619230805'); 
INSERT INTO TB_CUSTOMER VALUES ('2019001','������','W', '20010426','002-9842-0074','jskim$dreami.org', 12820, '20190101080518');
INSERT INTO TB_CUSTOMER VALUES ('2019069','���ѱ�', 'M','1992 315','','hkkim@ssoya.com',15320, '20190217110704');
INSERT INTO TB_CUSTOMER VALUES ('2019095', '���üҸ�', 'M','19620728','003-6273-8539','',890, '20190312124558');
INSERT INTO TB_CUSTOMER VALUES ('2019167', '������', 'M', '19711106','002=1202=5563','chhan@ecom.co.kr',6800, '20190508155600');
INSERT INTO TB_CUSTOMER VALUES ('2019281','�̾Ƹ�','W','19940513','003-2620-0723','aulee@hoki.com',35600,'20190709201308');

--�߰� �� ���̺�
delete from tb_add_customer;
insert into tb_add_customer values('2017108','�ڽ´�','M','19711430','002-2580-9919');
insert into tb_add_customer values('2019302','���̷�','W','19740812','002-8864-0232');

--����Ʈ���̺�
SELECT * FROM tb_point;
delete from tb_point;
INSERT INTO TB_POINT VALUES ('2017042',1,'û�ұ� ���� ����Ʈ ����',120700,'20181221160803');
INSERT INTO TB_POINT VALUES ('2017042',2,'�̺�Ʈ ����Ʈ ����',9500,'20190405121520');
INSERT INTO TB_POINT VALUES ('2017042',3,'����� ���� ����Ʈ ����',78560,'20190612220810'); 
INSERT INTO TB_POINT VALUES ('2017042',4,'������ ���� ����Ʈ ����',71540,'20190703140913');
INSERT INTO TB_POINT VALUES ('2017053',1,'��Ź�� ���� ����Ʈ ����',3500, '20170410201432');
INSERT INTO TB_POINT VALUES ('2017108',1��'û�ұ� ���� ����Ʈ ����',14065, '20180412205434');
INSERT INTO TB_POINT VALUES ('2017108' ,2,'�̺�Ʈ ����Ʈ ����',9385,'20180702232143');
INSERT INTO TB_POINT VALUES ('2018087',1��'�̺�Ʈ ����Ʈ ����',7800��'20180421161903');
INSERT INTO TB_POINT VALUES ('2018087' ��2��'����� ���� ����Ʈ ���� ' ,10900��'20181112161956');
INSERT INTO TB_POINT VALUES ('2018254' �� 1 ��'��� ����Ʈ ����'��500��'20180619230805');
INSERT INTO TB_POINT VALUES ('2018254' ��2��'�̺�Ʈ ����Ʈ ����'�� 70��'20180623170212');
INSERT INTO TB_POINT VALUES ('2019001' �� 1 ��'��� ����Ʈ ���� '��500��'20190102120720');
INSERT INTO TB_POINT VALUES ('2019001' �� 2��'�ͼ��� ���� ����Ʈ ����' ��4600��'20190405134554');
INSERT INTO TB_POINT VALUES ('2019001'�� 3��'����̱� ���� ����Ʈ ����' ��7820��'20190829071234');
INSERT INTO TB_POINT VALUES ('2019069' �� 1 ��'�̺�Ʈ ����Ʈ ����'�� 8900�� '20190219120712');
INSERT INTO TB_POINT VALUES ('2019069' �� 2��'�鵵�� ���� ����Ʈ ����' ��3200��'20190420090820');
INSERT INTO TB_POINT VALUES ( '2019069'�� 3��'������ ���� ����Ʈ ����'��3220��'20190620071230');
INSERT INTO TB_POINT VALUES ('2019095' �� 1 ��'��� ����Ʈ ����'��500��'2019031212456');
INSERT INTO TB_POINT VALUES ('2019095' �� 2��'�̺�Ʈ ����Ʈ ����'�� 390��'20190510072345');
INSERT INTO TB_POINT VALUES ( '2019167' �� 1 ��'����̱� ���� ����Ʈ ����' ��3200��'20190612042450');
INSERT INTO TB_POINT VALUES ('2019167'��2��'������ ���� ����Ʈ ����'��3600��'20190714133422');
INSERT INTO TB_POINT VALUES ('2019281'��1��'��� ����Ʈ ����'��500��'20190709201308');
INSERT INTO TB_POINT VALUES ('2019281'��2��'û�ұ� ���� ����Ʈ ����'��8950��'20190710200921');
INSERT INTO TB_POINT VALUES ('2019281'��3��'����� ���� ����Ʈ ����'��12200��'20190712082334');
INSERT INTO TB_POINT VALUES ('2019281'��4��'����̱� ���� ����Ʈ ����'��7600��'20190721134421');
INSERT INTO TB_POINT VALUES ('2019281'��5��'�ͼ��� ���� ����Ʈ ����'��6250��'20190724022430');




