create or replace procedure userProc as v_bYear number;
begin 
select birthyear into v_byear from usertbl
where userid = 'SSK';
v_byear := v_byear +1;
DBMS_OUTPUT.PUT_LINE(v_byear);
end userProc;

