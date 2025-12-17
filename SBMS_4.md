Layered Architecture:
Presentation Layer
Controller
Service
DAO (Repo)
================
I will touch base what every module of Spring will do

then i will explain Spring basics and Spring core in depth

then we will go with Spring Boot
--------------=============
Spring frame work
-> it is an Application development framework
-> end to end Application development
-> Spring is Java based frame work
-> Released in 2004
-> Recent version of Spring 6.X

What is An Api:
================
What is Rest Api:
What is Graph Ql: No need to develop n number of Apis

cricbuzz.com/players
cricbuzz.com/players/playerid/player-score
=============================
Spring framework developed in Modular fashion

1. Spring core 
2. Spring context
3. Spring AOP
4. Spring Jdbc/Spring DAO
5. Spring ORM
6. Spring web
7. Spring security
8. Spring Bacth
9. Spring cloud
10. Spring Rest

1. Spring frame work will not force all the modules to use
2. There is no relationship between one module to other module

We can use any module based on our project requirement

Spring core:
============
Base Module in Spring
It provides fumdamental of Spring
      -> IOC -> create bean / objects loads in IOC container
      -> DI -> Constructor , Setter , Field
      -> Autowiring

Note : We can develop stand alone applications 

<bean id="" class="">
<property >
<constructor-arg>
=================================
core java
================

Spring context:
==============
Spring context is responsible to manage configurations
Which class needs to create bean/object which classes not
=========================================================
Spring AOP:
==========
POP; Procedure Oruented Programminhg
OOP: Object Oriented Programming
AOP : Aspect oriented Programming

Security , Transaction , Audit , logging etc...
these are the features available in AOP , AOP will do integration 
with our Application
===============================

Spring Jdbc:
We can reduce the boiler plte code
plain text to write the Query 

REgistering the driver
getting connection
crteate Statement
Execute Query (programmer)
Process result
close connection
===============================================
Spring ORM :
ORM Stands for Object Relational Mapping
Hibernate is also Such ORM frame work 
ORM will represent in form of Objects
=====================================================
Spring Web MVC
we can develop user Interface
jsp->Thamaleaf
IT supports multiple presentation techniques
===========================================
Spring Rest Module:

it used to communicate distributed Application
distributed Application : 
It helps to communicater between multiple modules in 
distributed Application
============================================

Spring security:
================
It gives Authentication and Authorization

Authentication :
Checking username and passwsord wheather the credentials are 
correct or not

Authorization: Checking the roles
Checking the user wheather he is elgible to access particular 
role or not clear

Spring Batch:
=============
if i want to process large number of records i want to use 
Spring Batch

Spring cloud :
==============
We can see multiple Dashboards using Spring cloud Api

What is Strategy Design pattern:
===============================
1.It is better to have Has-A relationship over is A relation
2.Communication should happen via interfaces
3.Open for Extention and closed for modification


is A relationship

class PerSon
{

}
class Emplyoee extends Person
{

}

class Car
{
    Engine e;
}

Car and Engine is Has A relationship

What is Interface
===============
Which contains all abstract methods


