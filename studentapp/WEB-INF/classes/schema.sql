DROP TABLE IF EXISTS student;
CREATE TABLE IF NOT EXISTS student(
				id bigint primary key auto_increment,
				student_no varchar(30),
				first_name varchar(30),
				last_name varchar(30)
);


DROP TABLE IF EXISTS student_address;
CREATE TABLE IF NOT EXISTS student_address(
				id bigint primary key auto_increment,
				student_id bigint,
				address varchar(100),
				city varchar(30),
				state varchar(30),
				zip_code varchar(5)
);