/*
Polymorphism
---------------
Bank is a class that provides method to get the rate of interest. 
Rate of interest may differ according to banks. For example, SBI (8%), ICICI (7%) and AXIS (9%)
*/
class Bank{  
	int getRateOfInterest(){return 0;}  
}
 
class SBI extends Bank{  
	int getRateOfInterest(){return 8;}  
}  
  
class ICICI extends Bank{  
	int getRateOfInterest(){return 7;}  
}
  
class AXIS extends Bank{  
	int getRateOfInterest(){return 9;}  
}  
  
class PolymorphismDemo{  
	public static void main(String args[]){  
		Bank b1=new SBI();  
		Bank b2=new ICICI();  
		Bank b3=new AXIS();  
		
		System.out.println("SBI Rate of Interest: "+b1.getRateOfInterest());  
		System.out.println("ICICI Rate of Interest: "+b2.getRateOfInterest());  
		System.out.println("AXIS Rate of Interest: "+b3.getRateOfInterest());  
	}  
}  

/*Output
SBI Rate of Interest: 8
ICICI Rate of Interest: 7
AXIS Rate of Interest: 9
*/
