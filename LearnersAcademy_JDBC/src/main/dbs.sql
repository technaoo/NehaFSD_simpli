
create database db5;
use db5;

Create Table Student(
id int PRIMARY KEY,
sname varchar(255),
sage int,
sclass int);
desc Student;
insert into Student values(1,"Neha",10,5);
insert into Student values(2,"Tina",8,3);
insert into Student values(3,"Riya",10,5);
insert into Student values(4,"Twishi",7,2);
insert into Student values(5,"Jia",6,1);
insert into Student values(6,"Hina",9,5);
insert into Student values(7,"Swati",10,4);
insert into Student values(8,"Priya",7,2);

Alter table Student add Key class_id (sclass);
select * from Student;
desc Student;

create Table Subjects(
id int primary key,
subname varchar(255));
desc Subjects;
insert into Subjects values(1,"MATH");
insert into Subjects values(2,"ENG");
insert into Subjects values(3,"SCI");
insert into Subjects values(4,"HINDI");

create table Teachers(
id int primary key,
name varchar(255),
age int);

insert into Teachers values(1, "Alex", 32);
insert into Teachers values(2, "Wake", 33);
insert into Teachers values(3, "Jill", 35);
insert into Teachers values(4, "Tim", 32);
insert into Teachers values(5, "Max", 31);
insert into Teachers values(6, "Mary", 30);
insert into Teachers values(7, "Twin", 40);
insert into Teachers values(8, "Forest", 38);

select * from Teachers;

create table Classes(
id int primary key,
section int,
teacher varchar(255) ,
subject varchar(255),
time varchar(255),
foreign key (section) references Student(sclass)
#foreign key (teacher_id) references Teachers(id),
#foreign key (subject_id) references Subjects(id)
);



insert into Classes values(1,1,"Alex","MATH",'9:00');
insert into Classes values(2,3,"Wake","SCI",'10:00');
insert into Classes values(3,3,"Tim","HINDI",'11:00');
insert into Classes values(4,4,"Max","ENG",'9:00');
insert into Classes values(5,2,"Jill","ENG",'10:00');
insert into Classes values(6,3,"Alex","MATH",'9:00');
insert into Classes values(7,2,"Alex","SCI",'11:00');
insert into Classes values(8,3,"Wake","HINDI",'10:00');

select * from Classes;

#Select * from Student right outer join Classes on Student.sclass=Classes.section;
