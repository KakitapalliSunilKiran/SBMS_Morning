What are runners which we discusses:
====================================

CommandLine Runner 
Application Runner 

at the end of the run these runners will executed 
run method

============================================
if i want to go for custom banner
banner.txt in Application.properties
==============================================
Application start
IOC initialization
Bean creation (Car bean , Engine e)
Injecting the bean
@Postconstruct
using the bean
@Predestroy(this will be executed when we stop server)
===================================================
for interface we cannot create bean 
we can create bean for implementation class only
Where @Component annotation
==================================================
Car has one @component annoation
DieselEngine has @Component annotaion
===================================================
@Qualifier annotaion at variable level
@Primary annotation at class level
==============================================
at first Spring Boot try to inject the bean via
byName
if the reference variable name and component name is matching 
directly it will inject the respective bean 

Engine e;

PetrolEngine and DieselEngine both are Engine type
then Ambuiguity will be coming
to resolve this ambuiguity in ByType
@Primary
@Qualifier
=====================================
if the Same thing happen in Spring core
primary=true
autowire_candiatate="false"
<bean id="ref1" class="fullyQualified class Name">
<bean id="ref2" class="fullyQualified class Name">
<property name="e" ref="ref1" primary="true">
<property name="e" ref="ref2" autowire_candiatate="false">
======================================================
ic 
nr
======================================================
@Qualidier setter , constructor
===============================
Three tier application
