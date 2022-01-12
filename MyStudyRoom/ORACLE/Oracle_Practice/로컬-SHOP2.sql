

update producttbl
    set
    productname = '건조기2',
    cost = 10
    where
    productname = '건조기';

delete from producttbl where productname ='건조기2';

insert into producttbl values ('건조기',10, '21/11/05', '삼성', 10);

select* from producttbl;
create sequence seq_product;

update *from producttbl 


    