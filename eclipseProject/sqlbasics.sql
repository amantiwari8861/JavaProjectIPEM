show databases;
create database ipem;
use ipem;
create table users(id int,name varchar(50),
phone varchar(15),dob date,address varchar(255));
describe users;
show tables;
select * from users;
 insert into users values(100,"AMan","9891062743",
 '1999-4-22','noida 62');
update users set name="Aman Tiwari" 
where name='AMan';
-- truncate users;
# comment 
/*
	multiple line comment
*/

insert into users values 
(100,"AMan","9891062743",'1999-4-22','noida 62'),
(101,"AMan 2","9891062743",'1999-4-22','noida 62'),
(102,"AMan 3","9891062743",'1999-4-22','noida 62'),
(103,"AMan 4","9891062743",'1999-4-22','noida 62');
select * from users;
select name,phone from users;
delete from users where id=101;
select * from users where id=103;
drop table users;
drop database ipem;

show databases;
use jdbc;
create table allusers(id int primary key auto_increment,name varchar(255),
salary float,phone varchar(15));

select * from allusers;

insert into allusers(name,salary,phone)
values ("Aman",50000,"9891062743");

insert into allusers
values (2,"Aman",50000,"9891062743");

alter table allusers modify column phone bigint;

describe allusers;

