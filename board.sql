create table nboard
(unq NUMBER PRIMARY KEY
,title VARCHAR2(100) not null
,pass VARCHAR2(100) not null
,name VARCHAR2(20) not null
,content VARCHAR2(4000) not null
,hits number
,rdate date
);

create sequence nboard_seq
INCREMENT by 1
START with 1
MAXVALUE 99999;

commit;

select * from nboard;