package withoutstartegy;

public class Car  {
	
    
	static DieselEngine de;
	
	Car(DieselEngine de){
		this.de=de;
	}
	// 3 ways of Injecting
	//1. Constructor Injection'
	//2.Setter Injection
	//3. Field Injection
	
	static void startCar() {
		System.out.println("Car is waiting for Engine start");
		de.startEngine();
	}

}
