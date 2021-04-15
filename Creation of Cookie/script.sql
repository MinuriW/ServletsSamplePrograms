begin
   execute immediate 'drop table seating_section';
exception
   when others then null;
end;
/

create table seating_section(id number(10) not null 
primary key,seating_type varchar2(255) not null,
ticket_cost binary_double not null,
number_of_seats number(10) not null);


insert into seating_section(id,seating_type,ticket_cost,number_of_seats)values(1,'Platinum',280,29);
insert into seating_section(id,seating_type,ticket_cost,number_of_seats)values(2,'Gold',230,40);
insert into seating_section(id,seating_type,ticket_cost,number_of_seats)values(3,'Silver',120,50);
