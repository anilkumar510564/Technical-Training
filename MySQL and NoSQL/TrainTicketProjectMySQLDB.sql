use trainticketreservationsystem;
create table Trains(TRAIN_NO int primary key,TRAIN_NAME varchar(50), SOURCE varchar(50), DESTINATION varchar(50), TICKET_PRICE int);
select * from Trains;
insert into Trains values(1001, 'Gatimaan Express', 'Chennai', 'Bangalore', 1500);
insert into Trains values(1002, 'Shatabdhi Express', 'Coimbatore', 'Chennai', 2000);
insert into Trains values(1003, 'Rajdhani Express', 'Kanyakumari', 'Mumbai', 4000);
insert into Trains values(1004, 'Vivek Express', 'Kanyakumari', 'New Delhi', 8000);