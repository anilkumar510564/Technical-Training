use nigthbs;
create table carcompany(comp_id int unsigned not null primary key, comp_name varchar(20));
insert into carcompany(comp_id, comp_name) values(1, "Maruti Suzuki");
insert into carcompany(comp_id, comp_name) values(2, "Tata");
insert into carcompany(comp_id, comp_name) values(3, "Mahindra");
select * from carcompany;
desc carcompany;

create table car_model(model_id int unsigned not null primary key, model_name varchar(20), comp_id int unsigned not null);
insert into car_model(model_id, model_name, comp_id) values(101, "Swift", 1);
insert into car_model(model_id, model_name, comp_id) values(102, "Brezza", 1);
insert into car_model(model_id, model_name, comp_id) values(103, "Ertiga", 1);
insert into car_model(model_id, model_name, comp_id) values(104, "Tiago", 2);
insert into car_model(model_id, model_name, comp_id) values(105, "Nexon", 2);
insert into car_model(model_id, model_name, comp_id) values(106, "Harrier", 2);
alter table car_model add foreign key(comp_id) references carcompany(comp_id);
select * from car_model;
desc car_model;

select * from carcompany right join car_model on carcompany.comp_id=car_model.comp_id;
select * from carcompany left join car_model on carcompany.comp_id=car_model.comp_id; 
select * from carcompany right join car_model on carcompany.comp_id=car_model.comp_id 
union  
select * from carcompany left join car_model on carcompany.comp_id=car_model.comp_id; 

select carcompany.comp_name, car_model.model_name from carcompany left join car_model on carcompany.comp_id=car_model.comp_id;
select carcompany.comp_name, car_model.model_name from carcompany right join car_model on carcompany.comp_id=car_model.comp_id;
select carcompany.comp_name, car_model.model_name from carcompany left join car_model on carcompany.comp_id=car_model.comp_id
union
select carcompany.comp_name, car_model.model_name from carcompany right join car_model on carcompany.comp_id=car_model.comp_id;

select carcompany.comp_name, car_model.model_name from carcompany inner join car_model on carcompany.comp_id=car_model.comp_id;
select * from carcompany inner join car_model on carcompany.comp_id=car_model.comp_id; 