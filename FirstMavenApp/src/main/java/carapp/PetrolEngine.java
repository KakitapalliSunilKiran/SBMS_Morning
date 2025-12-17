package carapp;

public class PetrolEngine implements Engine {
	
	PetrolEngine(){
		System.out.println("I am in Petrol Engine constructor");
	}


	@Override
	public boolean startEngine() {
		// TODO Auto-generated method stub
		System.out.println("I am in petrol engine");
		return false;
	}

}
