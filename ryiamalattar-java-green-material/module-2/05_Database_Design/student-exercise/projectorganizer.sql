drop table if exists employee;
drop table if exists department;
drop table if exists project;
drop table if exists project_employee;

create table employee (
employee_number serial not null,
first_name varchar(64) not null,
last_name varchar(64) not null,
job_title varchar(64) not null,
gender varchar(32) not null,
date_of_birth date not null,
date_of_hire date not null,
department_number int not null,

constraint pk_employee_id primary key (employee_number),
constraint fk_department_id foreign key (department_number) references department(department_number)
);

insert into employee (first_name,last_name,job_title,gender,date_of_birth,date_of_hire,department_number)
values ('Gloria' , 'Jack' , 'project manager' , 'female' , '1980-01-13' , now() , 1);
insert into employee (first_name,last_name,job_title,gender,date_of_birth,date_of_hire,department_number)
values ('Sam' , 'Chris' , 'project engineer' , 'male' , '1988-07-05' , now() , 2);
insert into employee (first_name,last_name,job_title,gender,date_of_birth,date_of_hire,department_number)
values ('Tim' , 'Will' , 'design engineer' , 'male' , '1993-01-20' , '2019-09-10' , 2);
insert into employee (first_name,last_name,job_title,gender,date_of_birth,date_of_hire,department_number)
values ('Mat' , 'Nick' , 'project manager' , 'male' , '1970-12-01' , '2005-10-04' , 3);
insert into employee (first_name,last_name,job_title,gender,date_of_birth,date_of_hire,department_number)
values ('Lindsey' , 'Lohan' , 'site engineer' , 'female' , '1977-09-23' , '2012-03-12' , 1);
insert into employee (first_name,last_name,job_title,gender,date_of_birth,date_of_hire,department_number)
values ('Ann' , 'James' , 'site engineer' , 'female' , '1988-09-10' , '2012-03-12' , 3);


create table department (
department_number serial not null,
department_name varchar(32),
constraint pk_department_id primary key (department_number)

);

insert into department (department_name) values ('design');
insert into department (department_name) values ('project managment');
insert into department (department_name) values ('HR');


create table project (
project_number serial not null,
projuct_name varchar(32) not null,
start_date date not null,

constraint pk_project_id primary key (project_number)
);

insert into project (projuct_name , start_date) values ('FaceBook' , now());
insert into project (projuct_name , start_date) values ('6 town houses ' , '2018-12-01');
insert into project (projuct_name , start_date) values ('Amazon Warehouse ' , '2010-10-01');

create table project_employee (
employee_number int not null,
project_number int not null,

constraint pk_employee_project_id primary key (employee_number , project_number),
constraint fk_employee_id foreign key (employee_number) references employee(employee_number),
constraint fk_project_id foreign key (project_number) references project(project_number)
);

insert into project_employee(employee_number, project_number) values (1,1);
insert into project_employee(employee_number, project_number) values (2,1);
insert into project_employee(employee_number, project_number) values (2,3);
insert into project_employee(employee_number, project_number) values (5,2);