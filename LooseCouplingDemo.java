/*LooseCoupling
------------------------------------------
Journey and Car objects are loosely coupled. It means Vehicle is an interface 
and we can inject any of the implemented classes at run time 
and we can provide service to the end user.

The examples of Loose coupling : Interface, JMS, Spring IOC
*/

interface Vehicle {
  void start();
}

class Car implements Vehicle {
@Override
 public void start() {
          System.out.println("Travel by Car");
 }
}

class Bike implements Vehicle {
@Override 
 public void start() {
          System.out.println("Travel by Bike");
 }
}

class Journey {
	public static void main(String[] args) {
       		Vehicle v = new Car();
       		v.start();
		v = new Bike();
		v.start();
	}
}

/*Output
----------------------------------------------
Travel by Car
Travel by Bike
*/
