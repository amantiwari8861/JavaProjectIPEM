package carfactory;
import carfactory.bmw.Driver;

public class TestPackages {

	public static void main(String[] args) {

		System.out.println("i am in carfactory");
		
		Driver d=new Driver();
		d.drive();
	
		carfactory.bugati.Driver d2=new carfactory.bugati.Driver();
		d2.drive();
		
	}

}
//https://www.geeksforgeeks.org/access-modifiers-java/