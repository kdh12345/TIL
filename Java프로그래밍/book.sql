
create table book(
	bookNo char(10) primary key,
    bookTitle varchar(30) not null,
    bookAuthor varchar(20),
    bookYear date,
	bookprice int,
    bookPublisher varchar(10)
);
insert into book values('B001','자바프로그래밍','홍길동',str_to_date('2020','%Y'),30000,'멀티출판사');
insert into book values('B002','MYSQL이해','나이해',str_to_date('2022','%Y'),25000,'캠퍼스출판사');
insert into book values('B003','SPRING 활용','김고수',str_to_date('2021','%Y'),45000,'디지털출판사');

select * from book;