select employee_id, hire_date from employees order by hire_date asc;

--���� n���� ��� -> ���������� where rownum <=����
select *from (select employee_id, hire_date from employees order by hire_date asc) where rownum <=5;
--���̺� ������ 5�Ǹ� ��ȸ 
select employee_id, hire_date, first_name from employees where rownum <=5;
-- sample(�ۼ�Ʈ) ������ ������ ����  sample(n) ��ü �ڷ��� n% �̸��� �ڷᰡ �������� ���� 
select employee_id, hire_date from employees sample(5);

