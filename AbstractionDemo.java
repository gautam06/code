/*
Abstraction
--------------------------------------
Abstraction is a process of hiding the implementation details and showing only functionality to the user.

*/

abstract class Bike{  
   Bike(){ System.out.println("bike..."); }  
   abstract void run();  
   void changeGear(){ System.out.println("Gear changed..."); }  
}  
  
class Honda extends Bike{  
 
	void run(){System.out.println("Honda is running...");}  
}  

class AbstractionDemo{  
 	public static void main(String args[]){  
  		Bike obj = new Honda();  
  		obj.run();  
  		obj.changeGear();  
 	}  
}  

/*Output
-------------------------
bike...
Honda is running...
Gear changed...

*/
