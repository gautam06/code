/*
Composition
---------------
composition provides code reuse and the relationship between two classes is has-a 
composition is achieved by using instance variables that refers to other objects. 
For example -> A Person has a Job 
*/
class Job { 

	private String role; 
	private long salary; 
	private int id; 

	public String getRole() { return role; } 

	public void setRole(String role) { this.role = role; } 

	public long getSalary() { return salary; } 
	
	public void setSalary(long salary) { this.salary = salary; } 

	public int getId() { return id; } 
	
	public void setId(int id) { this.id = id; } 

} 

class Person { 

	//composition has-a relationship 
	private Job job; 

	public Person(){ 
		this.job=new Job(); 
		job.setSalary(10000); 
	}
 
	public long getSalary() { return job.getSalary(); } 

} 

public class CompositionDemo { 

	public static void main(String[] args) { 
		Person person = new Person(); 
		long salary = person.getSalary(); 
		System.out.println("Person Salary: "+salary);
	} 
} 

/*Output
--------------------------------
Person Salary: 10000

*/
