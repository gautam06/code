/*OpenClose Principle
----------------------------------------------
Software entities (Classes, modules, functions) should be OPEN for EXTENSION, CLOSED for MODIFICATION.

*/

interface Shape{
	double calculateArea();
}

class Rectangle implements Shape{
	private double width;
	private double height;
	private double area;
	public double getWidth(){
		return width;
	}
	public double getHeight(){
		return height;
	}
	
	public void setWidth(double width){
		this.width=width;
	}
	public void setHeight(double height){
		this.height=height;
	}
	
	public double calculateArea(){
		area = height*width;
		return area;
	}
}

class Circle implements Shape{
	private double radius;
	private double area;
	public void setRadius(double radius){
		this.radius=radius;
	}
	public double getRadius(){
		return radius;
	}
	public double calculateArea(){
		area = Math.PI*radius*radius;
		return area;
	}
}

class AreaCalculator{
private static double area;
	public static double calculateArea(Object[] shapes)
	{
		for(Object shape:shapes)
		{
			if(shape instanceof Rectangle){
				Rectangle r = (Rectangle) shape;
				area += r.calculateArea(); 
			}
			else if(shape instanceof Circle){
				Circle c = (Circle) shape;
				area += c.calculateArea();
			}
		}
		return area;
	}
	
	public static void display(){
		System.out.println("\n Total Calculated Area: "+area);
	}
}

class OpenClosePrincipleDemo{
	public static void main(String args[]){
		Rectangle r1 = new Rectangle();
		r1.setHeight(5);
		r1.setWidth(6);
		Circle c1 = new Circle();
		c1.setRadius(6);
		Circle c2 = new Circle();
		c2.setRadius(8);
		
		Object[] shape = new Object[3];
		shape[0] = r1;
		shape[1] = c1;
		shape[2] = c2;
		
		AreaCalculator.calculateArea(shape);
		AreaCalculator.display();
	}
} 

/*Output
---------------------------------

Total Calculated Area: 344.1592653589793

*/
