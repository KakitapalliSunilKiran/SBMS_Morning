package withstrategy;

public class Car {
	
	Engine e;
	
	Car(Engine e){
		this.e=e;
	}
	
	public void startCar() {
		boolean flag = e.startEngine();
		if(flag==true) {
			System.out.println("Car is starting");
		}else {
			System.out.println("Please start the Engine again");
		}
	}

}
