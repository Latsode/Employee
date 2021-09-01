CREATE TABLE employee
(
    id    SERIAL PRIMARY KEY,
    first_name    varchar(30)   NOT NULL,
    last_name     varchar(30)   NOT NULL,
    email         varchar(40)   NOT NULL

);


INSERT INTO employee (id, first_name, last_name, email)
VALUES  (1,'Nikoloz1','Latsabidze','nikalatsabidze@gmail.com'),
        (2,'Nikoloz2','Latsabidze','nikalatsabidze@gmail.com'),
        (3,'Nikoloz3','Latsabidze','nikalatsabidze@gmail.com'),
        (4,'Nikoloz4','Latsabidze','nikalatsabidze@gmail.com'),
        (5,'Nikoloz5','Latsabidze','nikalatsabidze@gmail.com'),
        (6,'Nikoloz6','Latsabidze','nikalatsabidze@gmail.com');