package carapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = 
		        new ClassPathXmlApplicationContext("beans.xml");
//		PetrolEngine de = ctx.getBean(PetrolEngine.class);
//		System.out.println(de.hashCode());
//		PetrolEngine de1 = ctx.getBean(PetrolEngine.class);
//		System.out.println(de1.hashCode());
		Car c = ctx.getBean(Car.class);
		c.startCar();
		
		
	}

}
