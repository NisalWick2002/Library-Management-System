create database LMS;

use LMS;
select * from book
select * from book where bookID='002' AND status='Unavailable'
 create table student (studentID varchar(10) primary key not null,
 studentName varchar(50)not null,
 guardianName varchar(5)not null,
 courseName varchar (20)not null,
 registrationYear int not null);
 
desc book
drop table issue
use LMS

select * from issue
CREATE TABLE issue (
    issueID varchar(10)PRIMARY KEY,
    bookID VARCHAR(10),
    studentID VARCHAR(10),
    issueDate DATE,
    dueDate DATE
);

ALTER TABLE book MODIFY status VARCHAR(50)


