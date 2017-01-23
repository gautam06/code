/*High Cohesion
--------------------------------------
Class should highly cohesive
class is designed with a single, well-focused purpose
*/

class SalesReport {
	static void generateSalesReport() { System.out.println("Generate Sales Report"); }
}

class ConnectToDb {
	static void getDb() { System.out.println("Get Database Connectivity "); }
}

class PrintStuff {
	static void getPrintOptions() { System.out.println("Get Printing Options"); }
}

class HighCohesionDemo{
	public static void main(String args[]){
		System.out.println("Class designed with single well-focused purpose");
		System.out.println("Following operations are performed using diff classes");
		System.out.println("------------------------------------------------------");
		SalesReport.generateSalesReport();
		ConnectToDb.getDb();
		PrintStuff.getPrintOptions();
	}
}

/*Output
--------------------------------------
Class designed with single well-focused purpose
Following operations are performed using diff classes
------------------------------------------------------
Generate Sales Report
Get Database Connectivity 
Get Printing Options
*/
