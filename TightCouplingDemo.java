/*
TightCoupling
------------------------------
Journey class is tightly coupled with Car class it means 
if any change in the Car class requires Journey class to change. 
For example if Car class travel() method change to journey() method then you have to change the startJourney() method will call journey() method instead of calling travel() method.

*/

class Journey {
	Car car = new Car();
	public void startJourney() { car.journey(); }
}

class Car {
	public void journey () { System.out.println("Travel by Car");}
}

public class TightCouplingDemo{	
	public static void main(String args[]){
		
		new Journey().startJourney();	
			
	}
}

/*Output
----------------------------------------------
Travel by Car
*/
 
      
