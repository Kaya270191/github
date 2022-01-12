select employee_id, hire_date from employees order by hire_date asc;

--상위 n개만 출력 -> 서브쿼리와 where rownum <=개수
select *from (select employee_id, hire_date from employees order by hire_date asc) where rownum <=5;
--테이블 상위의 5건만 조회 
select employee_id, hire_date, first_name from employees where rownum <=5;
-- sample(퍼센트) 임의의 데이터 추출  sample(n) 전체 자료의 n% 미만의 자료가 랜덤으로 나옴 
select employee_id, hire_date from employees sample(5);

