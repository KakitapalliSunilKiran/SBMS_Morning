How to configure Explicit Bean :
================================
@Configuration
@Bean (mathod level)

@Bean
StudentObj getStudentObj(String str){
      return new StudentObj(str);
}
=====================================
Singleton:
   Eager loading 
   Single instance created per IOC container
   When ever you are calling getBean method 
   same instance will be coming
Prototype:
   Lazy loading 
   When ever Bean is created new Bean will bean coming from IOC 
   container 

Singleton class 
===============
constructor Should be private 
Method which we are trying 
Synchronized static 
class Singleton
{
    private Singleton st;
    private Singleton(){}

    Synchronized static Singleton getSingleton(){
        if(st==null){
            st=new Singleton();
            return st;
        }
        return st;
    }
}
=========================================
Bean life cycle :
    1. Application start
    2. IOC container initialization and creation
    3. Beans creation
    4. Injecting the Beans
    5. @PostContrcut
    6. Using the beans 
    7. @PreDestroy
    8. Destroy

=============================================
@ComponentScan
By using the base package 
    What kind of classes in Base package does framework will consider
    to create the Beans 

    The classes that are annotated with @Component and childs
    @Service 
    @Repository
    @RestController

==========================================
@Controller (@ResponseBody on the Method level)
@RestController (@Controller + @ResponseBody)
=================================================
difference between Spring and Spring Boot
Autoconfiguration 
In memory database
Dependecy resolution
    Mvn Repository to classpath
    Maven is downloading
    alternative is Gradle
Health check by using Actuator
==================================================
@SpringBootApplication
   @Configuartion
   @EnableAutowired
   @ComponentScan
===================================================
Bean 
IOC container
dependent class 
Target class 
===================================================
Dependecy Injection in Spring Boot:
===================================
Injecting the dependent class bean into target class reference 
variable 

class Car 
{
   Engine e;
}
class Engine
{

}
=====================
Field Injection
Constructor Injection
Setter Injection
===========================
Make Sure Car and Engine class are part of IOC container
for the you shoulod @component annotation or its child 
@Autowired on Field , constructor , Setter 
===========================

