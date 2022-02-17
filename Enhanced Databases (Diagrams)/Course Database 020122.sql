create database Course_Records;
use Course_Records;
create table Course_Information (CourseID varchar(20), Course_Name varchar(50), Credit_Hours int);
describe Course_Information;
insert into Course_Information values('ENG-120','College Composition',3);
insert into Course_Information values('HUM-200','Applied Humanities',3);
insert into Course_Information values('MAT-140','Precalculus',3);
insert into Course_Information values('HIS-200','Applied History',3);
insert into Course_Information values('CS-405','Secure Coding',3);
insert into Course_Information values('CS-499','Computer Science Capstone',3);
insert into Course_Information values('IT-209','Intro to Robotics',3);
insert into Course_Information values('IT-270','Web Site Design',3);
insert into Course_Information values('CS-320','Software Test, Automation &QA',3);
insert into Course_Information values('IDS-403','Technology & Society',3);
describe Course_Information;
select * from Course_Information;
update Course_Information set Credit_Hours = 2 where Course_Name = 'Web Site Design';
select * from Course_Information;
update Course_Information set Credit_Hours = 2 where Course_Name = 'Web Site Design';
select * from Course_Information where Course_Name = 'Web Site Design';
select * from Course_Information order by Course_Name asc;