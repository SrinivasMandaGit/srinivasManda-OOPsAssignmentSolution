package abstraction.implementation;

public class Main {
	
	// Creating Objects using subclasses of abstracted Super class
	
		public static void main (String args[]) {
		SportsCar sc = new SportsCar();
		sc.start();
		sc.stop();
		
		
		CommercialCar cc = new CommercialCar();
		cc.start();
		cc.stop();
	
	}

}
