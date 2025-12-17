package carapp;

public class Car {
	
	Engine e;
	
	SeatBelt sb;
	
	
	Car(){
		System.out.println("I am in car class default constructor");
	}
//	public void setE(Engine e) {
//		System.out.println("I am in Serr method");
//		this.e = e;
//		
//	}
	
	Car(Engine e, SeatBelt sb){
		System.out.println("I am in Param constructor");
		this.e = e;
		this.sb = sb;
	}
	
//	Car(Engine e){
//		System.out.println("I am in single Param constructor");
//		this.e = e;
//	}



	void startCar() {
		boolean flag = e.startEngine();
	  sb.addSeatBelt();
		if(flag == true) {
			System.out.println("Have a happy journey");
		}else {
			System.out.println("Engine failed please start again");
		}
	}

	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		System.out.println("I am in Setter method (SetE)");
		this.e = e;
	}

	public SeatBelt getSb() {
		return sb;
	}

	public void setSb(SeatBelt sb) {
		System.out.println("I am in Setter method (SetSb)");
		this.sb = sb;
	}
	

}
