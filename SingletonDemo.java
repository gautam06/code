/*Singleton Pattern
--------------------------------------
Single class responsible to create only single object
Private Constructor
Instance is private & static 
Static method provide single instance
*/

class SingleObject {

   //create an object of SingleObject (static)
   private static SingleObject instance = new SingleObject();

   //make the constructor private so that this class cannot be instantiated
   private SingleObject(){}

   //public static method provide access to static single instance 
   public static SingleObject getInstance(){
      return instance;
   }

   public void displayMessage(){
      System.out.println("This method is called using singleton object...");
   }
}

class SingletonDemo {
   public static void main(String[] args) {

      //SingleObject object = new SingleObject();
	  //If you try to create new instance -> Compile Time Error: The constructor SingleObject() is not visible
	  
      //Get the only object available
      SingleObject obj = SingleObject.getInstance();

      //show the message
      obj.displayMessage();
   }
}

/*Output
------------------------------------------------------------------
This method is called using singleton object...
*/