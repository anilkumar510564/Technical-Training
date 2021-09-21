

create table regions(
   region_id int unsigned not null primary key, 
   region_name varchar(50)
);
drop table reg;
create table countries(
    country_id int unsigned not null primary key, 
    country_name varchar(50), 
    region_id int unsigned not null
);
create table locations(
    location_id int unsigned not null auto_increment primary key, 
    street_address varchar(100), 
    postal_code varchar(6), 
    city varchar(20) not null, 
    state_province varchar(20), 
    country_id int not null
);
alter table locations modify column country_id int unsigned not null;
create table departments(
    department_id int unsigned not null primary key, 
    department_name varchar(50) not null, 
    manager_id int unsigned, 
    location_id int unsigned
);
create table jobs(
	job_id varchar(5) not null primary key, 
    job_title varchar(50) not null, 
    min_salary decimal unsigned, 
    max_salary decimal unsigned
);
create table employees(
    employee_id int unsigned not null primary key, 
    first_name varchar(50) not null, 
    last_name varchar(50) not null, 
    email varchar(50) not null, 
    phone_number varchar(20), 
    hire_date varchar(10) not null, 
    job_id varchar(5) not null, 
    salary decimal not null, 
    commission_pct decimal, 
    manager_id int unsigned, 
	department_id int unsigned
);
create table job_history(
    employee_id int unsigned not null, 
    start_date date not null primary key, 
    end_date date not null, 
    job_id varchar(5) not null, 
    department_id int unsigned not null
);

alter table countries add foreign key(region_id) references regions(region_id);
desc countries;

alter table locations add foreign key(country_id) references countries(country_id);
desc locations;

alter table departments add foreign key(location_id) references locations(location_id);
desc departments;

alter table employees add foreign key(job_id) references jobs(job_id), add foreign key(department_id) references departments(department_id), add foreign key(manager_id) references employees(employee_id);
desc employees;

alter table departments add foreign key(manager_id) references employees(employee_id);
desc departments;

alter table job_history add foreign key(employee_id) references employees(employee_id), add foreign key(job_id) references jobs(job_id), add foreign key(department_id) references departments(department_id); 
desc job_history;

insert into regions(region_id, region_name) values(1, "Europe");
insert into regions(region_id, region_name) values(2, "Asia");
select * from regions;

insert into countries(country_id, country_name, region_id) values(1, "France", 1);
insert into countries(country_id, country_name, region_id) values(2, "Sweden", 1);
insert into countries(country_id, country_name, region_id) values(3, "Norway", 1);
insert into countries(country_id, country_name, region_id) values(4, "India", 2);
insert into countries(country_id, country_name, region_id) values(5, "Singapore", 2);

insert into locations(location_id, street_address, postal_code, city, state_province, country_id) values(1, "10th street, road 45, Paris", "61-21", "Paris", "Ile-de-France", 1);
insert into locations(location_id, street_address, postal_code, city, state_province, country_id) values(2, "45th street,", "71-31", "Stockholm", "Sodermanland", 2);
insert into locations(location_id, street_address, postal_code, city, state_province, country_id) values(3, "6th street, road 38", "510-1", "Oslo", "Oslo", 3);
insert into locations(location_id, street_address, postal_code, city, state_province, country_id) values(4, "1st street, road 55", "656", "Chennai", "Tamil Nadu", 4);
insert into locations(location_id, street_address, postal_code, city, state_province, country_id) values(5, "12th street, road 13", "5-071", "woodlands", "North West CDC", 5);

set foreign_key_checks=0;
insert into departments(department_id, department_name, manager_id, location_id) values(1, "R&D", 1, 1);
insert into departments(department_id, department_name, manager_id, location_id) values(2, "R&D", 2, 2);
insert into departments(department_id, department_name, manager_id, location_id) values(3, "QA", 3, 3);
insert into departments(department_id, department_name, manager_id, location_id) values(4, "QA", 4, 4);
insert into departments(department_id, department_name, manager_id, location_id) values(5, "BA", 5, 5);

insert into jobs(job_id, job_title, min_salary, max_salary) values(1, "Junior R&D", 50000, 80000);
insert into jobs(job_id, job_title, min_salary, max_salary) values(2, "Senior R&D", 80000, 100000);
insert into jobs(job_id, job_title, min_salary, max_salary) values(3, "Junior QA", 30000, 50000);
insert into jobs(job_id, job_title, min_salary, max_salary) values(4, "Senior QA", 40000, 60000);
insert into jobs(job_id, job_title, min_salary, max_salary) values(5, "Junior BA", 50000, 90000);

insert into employees(employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id) values(1, "Raghu", "Ram", "rr@gmail.com", "+91 1234567890", "01.01.2021", 1, 65000, 5000, 1, 1);
insert into employees(employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id) values(2, "Karthick", "Rajendran", "kr@gmail.com", "+91 3214567890", "01.02.2021", 2, 95000, 5000, 2, 2);
insert into employees(employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id) values(3, "Sethu", "Ram", "sr@gmail.com", "+91 3216547890", "01.03.2021", 3, 45000, 5000, 3, 3);
insert into employees(employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id) values(4, "Suresh", "Kumar", "sk@gmail.com", "+91 3215467890", "01.04.2021", 4, 55000, 5000, 4, 4);
insert into employees(employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id) values(5, "Birender", "Singh", "bs@gmail.com", "+91 3214567908", "01.05.2021", 5, 75000, 5000, 5, 5);

insert into job_history(employee_id, start_date, end_date, job_id, department_id) values(1, '2021/01/01', '2022/01/01', 1, 1);
insert into job_history(employee_id, start_date, end_date, job_id, department_id) values(2, '2021/02/01', '2022/02/01', 2, 2);
insert into job_history(employee_id, start_date, end_date, job_id, department_id) values(3, '2021/03/01', '2022/03/01', 3, 3);
insert into job_history(employee_id, start_date, end_date, job_id, department_id) values(4, '2021/04/01', '2022/04/01', 4, 4);
insert into job_history(employee_id, start_date, end_date, job_id, department_id) values(5, '2021/05/01', '2022/05/01', 5, 5);

select * from job_history;
desc job_history;

select * from employees;
desc employees;

select * from jobs;
desc jobs;

select * from locations;

select * from departments;
desc departments;

select * from countries;
desc countries;

select * from regions;
desc regions;
















