use company;
create table Employee(employee_id int, emp_name varchar(30), designation varchar(30), salary decimal, year_of_joining int);
desc Employee;
select * from Employee;
delete from Employee where employee_id=101;
delete from Employee where employee_id=102;
delete from Employee where employee_id=103;
alter table Employee modify column employee_id int primary key;
delete from Employee;

create table Insurance(ins_name varchar(30),ins_id int primary key, sum int, ins_type varchar(30));
select * from Insurance;
delete from Insurance;
desc Insurance;