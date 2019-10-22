create database if not exists student_class;
use student_class;
drop table if exists students;
drop table if exists classes;

create table classes (
id int(10) not null auto_increment,
name varchar(20) not null,
primary key(id)
);
create table students (
id int(10) not null auto_increment,
first_name varchar(15) not null,
last_name varchar(20) not null,
class_id int(10) not null,
primary key(id),
foreign key(class_id) references classes(id)
);