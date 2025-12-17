package withstrategy;

public class Tester {
	
	public static void main(String args[]) {
		PaymentEntry pe = new PaymentEntry();
//		pe.setPay(new DebitCard());
//		//PaymentEntry pe = new PaymentEntry(new CreditCard());
		pe.pay=new CreditCard();
		pe.makePayment();
	}

}
