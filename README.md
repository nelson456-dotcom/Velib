# Velib
googlemaps API, spingboot, restful, mysql db

create the database, on terminal

$ sudo mysql --password
*type your password for eisti then your password for mysql DB
mysql> create database spring_login; 
mysql> create user 'springuser'@'%' identified by 'ThePassword';
mysql> grant all on spring_login.* to 'springuser'@'%'; 



**BUIld jar file ON TERMINAL, make sure you re in the folder contains both src and pom.xlm
mvn clean
mvn complie
test -complie
mvn test -combile
mvn test
mvn install
