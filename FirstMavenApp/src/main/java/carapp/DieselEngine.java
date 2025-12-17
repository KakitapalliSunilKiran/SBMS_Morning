package carapp;

public class DieselEngine implements Engine {
	
	DieselEngine(){
		System.out.println("I am in Diesel Engine constructor");
	}

	@Override
	public boolean startEngine() {
		// TODO Auto-generated method stub
		System.out.println("I am in diesel engine");
		return false;
	}

}
