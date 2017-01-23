/*
Interface
-----------------------------
blueprint of a class
mechanism to achieve fully abstraction
represents IS-A relationship

*/

interface Printable{  
	void print();  
}  
interface Showable extends Printable{  
	void show();  
}  
class InterfaceDemo implements Showable{  
  
	public void print(){ System.out.println("Printing Data..."); }  
	public void show(){ System.out.println("Showing Data..."); }  
  
	public static void main(String args[]){  
		InterfaceDemo obj = new InterfaceDemo();  
		obj.print();  
		obj.show();  
 	}  
}  

/*Output
------------------------------
Printing Data...
Showing Data...

*/
