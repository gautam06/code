/*
Aggregation
----------------------------------------------
Employee has an object of Address
Address object contains its own informations -> city, state, country
Relationship is Employee HAS-A address
*/
class Address {  
	
	String city,state,country;  
  
	public Address(String city, String state, String country) {  
    		this.city = city;  
    		this.state = state;  
    		this.country = country;  
	}  
  
}  

class Emp {  
	int id;  
	String name;  
	Address address;  
  
	public Emp(int id, String name,Address address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}  
  
	void display(){  
		System.out.println(id+" "+name);  
		System.out.println(address.city+" "+address.state+" "+address.country);  
	}  
    
}

public class AggregationDemo{
	public static void main(String[] args) {  
		Address add1=new Address("Ahmedabad","Gujarat","India");  
		Address add2=new Address("Mumbai","Maharastra","India");  
  
		Emp e1=new Emp(31,"Gautam",add1);  
		Emp e2=new Emp(32,"Karan",add2);  
      
		e1.display();  
		e2.display();  
	}
}

/* Output
----------------------------------
31 Gautam
Ahmedabad Gujarat India
32 Karan
Mumbai Maharastra India
*/
