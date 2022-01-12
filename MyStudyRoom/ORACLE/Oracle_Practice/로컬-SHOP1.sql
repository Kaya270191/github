execute myprocedure;

set SERVEROUT on;

drop procedure myproc;



delete from memberTBL where membername = 'yuna';

create table deletedMemberTBL(
    memberid char(8),
    membername nChar(8),
    memberaddress nvarchar2(20),
    deletedData date
    );
    




select*from membertbl;
select*from deletedmembertbl;
delete from memberTBL where membername = 'yuna';


