/*FactoryMethod Pattern
------------------------------
Factory Method defines that interface or abstract class for creating an object 
but let the subclasses decide which class to instantiate
It allows the sub-classes to choose the type of objects to create
*/
import java.io.*;      

abstract class Plan{  
         protected double rate;  
         abstract void setRate();  
   
         public void calculateBill(int units){ 
		 System.out.println(units*rate); 
	}  
}

class  DomesticPlan extends Plan{   
	void setRate(){ rate=4; } 
}  
   
class  CommercialPlan extends Plan{
	void setRate(){ rate=7.5; }     
}
   
class  InstitutionalPlan extends Plan{  
    	void setRate(){ rate=10; }
}
   
class GetPlanFactory{  
      
   //use getPlan method to get object of type Plan   
       public Plan getPlan(int planNumber){  
              
          	if(planNumber == 1){ return new DomesticPlan(); }   
           	else if(planNumber == 2){  return new CommercialPlan(); }   
          	else if(planNumber == 3){  return new InstitutionalPlan(); }  
      		
		return null;  
   }  
}  

class FactoryMethodDemo{  
    public static void main(String args[])throws IOException{  
    
	try{
  
	     	GetPlanFactory planFactory = new GetPlanFactory();  
	      
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));      
	  
		System.out.println("Menu");
		System.out.println("--------------------------");
		System.out.println("1 Domestic Plan ");
		System.out.println("2 Commercial Plan ");
		System.out.println("3 Institutional Plan ");
		System.out.println("--------------------------");
	      	System.out.print("Enter your choice: ");  
	    
		int planNumber = Integer.parseInt(br.readLine());      
		
	      	System.out.print("Enter the number of units: ");  
	      	int units = Integer.parseInt(br.readLine());  
	  
	      	Plan p = planFactory.getPlan(planNumber);  
	      	//calculateBill() method will calculate bill  
	  	
		System.out.println("--------------------------");
	       	System.out.print("Bill amount for "+units+" units: ");    
		p.setRate(); //rate will be set by determining type of object        
		p.calculateBill(units); 
	}catch(Exception e){ System.out.println("Exception caught !"); } 
    }  
}

/*Output
--------------------------------------
Menu
--------------------------
1 Domestic Plan 
2 Commercial Plan 
3 Institutional Plan 
--------------------------
Enter your choice: 1
Enter the number of units: 3
--------------------------
Bill amount for 3 units: 12.0

*/
