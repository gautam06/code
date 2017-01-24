/*AbstractFactory Pattern
-------------------------------------
Abstract Factory patterns work around a super-factory which creates other factories
also called factory of factories
Interface is responsible for creating a factory of related objects without explicitly 
specifying their classes. 
Each generated factory can give the objects as per the Factory pattern.

*/


//Interface Shape & implementation Class

interface Shape {
   void draw();
}

class Rectangle implements Shape {
   @Override
   public void draw() {
      System.out.println("Rectangle::draw() method.");
   }
}

class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Circle::draw() method.");
   }
}


//Interface Color & implementation Class

interface Color {
   void fill();
}

class Red implements Color {

   @Override
   public void fill() {
      System.out.println("Red::fill() method.");
   }
}

class Green implements Color {

   @Override
   public void fill() {
      System.out.println("Green::fill() method.");
   }
}


//Abstract Class AbstractFactory and implementation class

abstract class AbstractFactory {
   abstract Color getColor(String color);
   abstract Shape getShape(String shape) ;
}

class ShapeFactory extends AbstractFactory {
	
   @Override
   public Shape getShape(String shapeType){
   
      if(shapeType == null){ return null; }		
      
      if(shapeType.equalsIgnoreCase("CIRCLE")){ return new Circle(); }
	  else if(shapeType.equalsIgnoreCase("RECTANGLE")){ return new Rectangle(); }
	 
      return null;
   }
   
   @Override
   Color getColor(String color) { return null; }
}

class ColorFactory extends AbstractFactory {
	
   @Override
   public Shape getShape(String shapeType){ return null; }
   
   @Override
   Color getColor(String color) {
   
      if(color == null){ return null; }		
      
      if(color.equalsIgnoreCase("RED")){ return new Red(); }
	  else if(color.equalsIgnoreCase("GREEN")){ return new Green(); }
	  
      return null;
   }
}

//FactoryProducer Class

class FactoryProducer {
   public static AbstractFactory getFactory(String choice){
   
      if(choice.equalsIgnoreCase("SHAPE")){ return new ShapeFactory(); }
	  else if(choice.equalsIgnoreCase("COLOR")){ return new ColorFactory(); }
      
      return null;
   }
}

//Main Class

class AbstractFactoryPatternDemo {
   public static void main(String[] args) {

      //get shape factory
      AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

	  //get an object of Shape Rectangle
      Shape rec = shapeFactory.getShape("RECTANGLE");
      rec.draw();
	   
      //get an object of Shape Circle
      Shape cir = shapeFactory.getShape("CIRCLE");
      cir.draw();

      
      
      //get color factory
      AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

      //get an object of Color Red
      Color red = colorFactory.getColor("RED");
      red.fill();

      //get an object of Color Green
      Color green = colorFactory.getColor("Green");
      green.fill();

   }
}

/*Output
--------------------------------------
Rectangle::draw() method.
Circle::draw() method.
Red::fill() method.
Green::fill() method.

*/