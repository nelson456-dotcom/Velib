create the database, on terminal

$ sudo mysql --password
*type your password for eisti then your password for mysql DB
mysql> create database spring_login; 
mysql> create user 'springuser'@'%' identified by 'ThePassword';
mysql> grant all on spring_login.* to 'springuser'@'%'; 







