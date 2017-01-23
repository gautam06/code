/*Low Cohesion
------------------------------------
Low cohesion would mean that the class does a great variety of actions and is not focused on what it should do.
Class Should be highly cohesive
*/

class SalesReport {
	static void generateSalesReport() { System.out.println("Generate Sales Report"); }
	static void getDb() { System.out.println("Get Database Connectivity "); }
	static void getPrintOptions() { System.out.println("Get Printing Options"); }
}

class LowCohesionDemo{
	public static void main(String args[]){
		System.out.println("Low Cohesion Example");
		System.out.println("All Operations defined within single class");
		System.out.println("------------------------------------------------------");		
		SalesReport.generateSalesReport();
		SalesReport.getDb();
		SalesReport.getPrintOptions();
	}
}

/*Output
--------------------------------------
Low Cohesion Example
All Operations defined within single class
------------------------------------------------------
Generate Sales Report
Get Database Connectivity 
Get Printing Options

*/
