/* Encapsulation

Use of getter & setter methods
data members are private - cannot be accessed directly
data members can be accessed via public methods only 
Fields name, desg and salary are made hidden using encapsulation technique of OOPs
*/

class Employee{
	
	//private datamembers
	private	String name;
	private String desg;
	private long salary;


	//getter method
	public String getName(){
		return name;	
	}
	public String getDesg(){
		return desg;	
	}
	public long getSalary(){
		return salary;
	}

	//setter method
	public void setName(String name){
		this.name=name;
	}
	public void setDesg(String desg){
		this.desg=desg;	
	}
	public void setSalary(long salary){
		this.salary=salary;	
	}
}
class EncapsulationDemo{
	
	public static void main(String args[]){
		Employee e = new Employee();
		e.setName("Gautam");
		e.setDesg("Trainee");
		e.setSalary(20000);
		System.out.println("Employee Name: "+e.getName());
		System.out.println("Employee Designation: "+e.getDesg());
		System.out.println("Employee Salary:"+e.getSalary());	
	}
}

/*Output
------------------------------------
Employee Name: Gautam
Employee Designation: Trainee
Employee Salary:20000
*/
