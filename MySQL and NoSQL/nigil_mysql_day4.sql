use program2;

/*Table STUDENT */
create table STUDENT(
     RegdNo int unsigned not null, 
     StdName varchar(50) not null, 
     Branch varchar(5) not null
);

insert into STUDENT(RegdNo, StdName, Branch) 
values
(0001, 'Ram', 'CSE'),
(0002, 'Hari', 'MECH'),
(0003, 'Pradeep', 'EEE'),
(0004, 'Deepak', 'ETC');
select * from STUDENT;
select RegdNo from STUDENT where StdName='Pradeep';
select StdName,Branch from STUDENT;
select count(RegdNo) as 'No of Rows' from STUDENT;
alter table STUDENT add Address varchar(100);


/* Table Employee */
create table Employee(
       EMPNO int unsigned not null, 
       ENAME varchar(50) not null, 
       JOB varchar(20) not null, 
       HIRE_DATE date not null, 
       MGR int unsigned,
       SAL int unsigned,
       COMM int unsigned,
       DEPTNO int unsigned
);
insert into Employee(EMPNO, ENAME, JOB, HIRE_DATE, MGR, SAL, COMM, DEPTNO)
values
(7369, 'SMITH', 'CLERK', STR_TO_DATE('17-DEC-80','%d-%b-%y'), 7902, 800, 0, 20);
insert into Employee(EMPNO, ENAME, JOB, HIRE_DATE, MGR, SAL, COMM, DEPTNO)
values
(7499, 'ALLEN', 'SALESMAN', STR_TO_DATE('20-FEB-81','%d-%b-%y'), 7698, 1600, 300, 30),
(7521, 'WARD', 'SALESMAN', STR_TO_DATE('22-FEB-81','%d-%b-%y'), 7698, 1250, 500, 30),
(7566, 'JONES', 'MANAGER', STR_TO_DATE('02-APR-81','%d-%b-%y'), 7839, 2975, 0, 20),
(7654, 'MARTIN', 'SALESMAN', STR_TO_DATE('28-SEP-81','%d-%b-%y'), 7698, 1250, 1400, 30),
(7698, 'BLAKE', 'MANAGER', STR_TO_DATE('01-MAY-81','%d-%b-%y'), 7839, 2850, 0, 30),
(7782, 'CLARK', 'MANAGER', STR_TO_DATE('09-JUN-81','%d-%b-%y'), 7839, 2450, 0, 10),
(7788, 'SCOTT', 'ANALYST', STR_TO_DATE('19-APR-87','%d-%b-%y'), 7566, 3000, 0, 20),
(7839, 'KING', 'PRESIDENT', STR_TO_DATE('17-NOV-81','%d-%b-%y'), NULL, 5000, 0, 10),
(7844, 'TURNER', 'SALESMAN', STR_TO_DATE('08-SEP-81','%d-%b-%y'), 7698, 1500, 0, 30),
(7876, 'ADAMS', 'CLERK', STR_TO_DATE('23-MAY-87','%d-%b-%y'), 7788, 1100, 0, 20),
(7900, 'JAMES', 'CLERK', STR_TO_DATE('03-DEC-81','%d-%b-%y'), 7698, 950, 0, 30),
(7902, 'FORD', 'ANALYST', STR_TO_DATE('03-DEC-81','%d-%b-%y'), 7566, 3000, 0, 20),
(7934, 'MILLER', 'CLERK', STR_TO_DATE('23-JAN-82','%d-%b-%y'), 7782, 1300, 0, 10);

select * from Employee;

select * from Employee where DEPTNO=30;

select EMPNO, ENAME, DEPTNO from Employee where JOB='CLERK';

select ENAME, DEPTNO from Employee where DEPTNO>20;

select * from Employee where COMM > SAL;

select * from Employee where COMM > (0.60*SAL);

select ENAME, JOB, SAL from Employee where DEPTNO=20 and (SAL > 2000);

select * from Employee where JOB='SALESMAN' AND DEPTNO=30 AND SAL > 1500;

select * from Employee where JOB='MANAGER' OR JOB='PRESIDENT';

select * from Employee where JOB='MANAGER' AND DEPTNO NOT IN(30);

select * from Employee where JOB in('MANAGER', 'CLERK') AND DEPTNO=10;

select * from Employee where JOB='MANAGER' OR (JOB='CLERK' AND DEPTNO=20);

select * from Employee where (JOB='MANAGER' AND DEPTNO=10) OR (JOB='CLERK' AND DEPTNO=20) OR (JOB NOT IN('MANAGER','CLERK') AND SAL>=2000);

select ENAME from Employee where DEPTNO=20 AND JOB NOT IN('MANAGER', 'CLERK');

select ENAME from Employee where SAL BETWEEN 1200 AND 1400;

select * from Employee where JOB IN('CLERK', 'ANALYST', 'SALESMAN');

select * from Employee where JOB NOT IN('CLERK', 'ANALYST', 'SALESMAN');

select * from Employee where COMM=0;

select JOB from Employee GROUP BY JOB HAVING SUM(COMM) > 0;

select * from Employee where COMM between 0 and 100;

select * , 
(
 CASE 
   WHEN COMM=0 THEN SAL+250
 END
) AS NET_EARNINGS FROM Employee;
);

select * from Employee where SAL > 2000;

select * from Employee where ENAME like 'M%' or '%M';

select * from Employee where ENAME like '%M%';

select * from Employee where char_length(ENAME)=15 OR ENAME LIKE '__R_%'; 

select * from Employee where MONTH(HIRE_DATE)=2;

select * from Employee where HIRE_DATE>NOW() - INTERVAL1;

select * from employee where HIRE_DATE=LAST_DAY(HIRE_DATE);

select * from Employee where YEAR(HIRE_DATE)=2003;

select ENAME,SPACE(10),JOB FROM Employee;

select lpad(ENAME,15,' ') AS ENAME from Employee;

select lpad(ENAME,15,'*') AS ENAME from Employee;  

select TRIM(LEADING'A' from ENAME) as ENAME FROM Employee;

select TRIM(TRAILING'R' from ENAME) as ENAME FROM Employee;

select substring(ENAME, 1, 3), substring(ENAME, length(ENAME)-2, length(ENAME)) from Employee;

select replace( ENAME, 'A', 'a') as ENAME from Employee;

select ENAME, POSITION("AR" IN ENAME) as POSITIONS FROM Employee;

select ENAME, ROUND(SAL, -3) as ROUND_SAL from Employee;

select * from Employee where SAL >= 1000;





