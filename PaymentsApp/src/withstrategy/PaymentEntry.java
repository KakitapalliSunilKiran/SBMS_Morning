package withstrategy;

public class PaymentEntry {

    Payment pay;
//    PaymentEntry(Payment p){
//    	this.p=p;
//    }
//    
//    public Payment getPay() {
//		return pay;
//	}

	public void setPay(Payment pay) {
    	this.pay=pay;
    }
    
    void makePayment() {
    	boolean flag = pay.pay(2000);
    	if(flag==true) {
    		System.out.println("Payment done goods will be delivered soon");
    	}else {
    		System.out.println("Payment failed please try again");
    	}
    }
}
