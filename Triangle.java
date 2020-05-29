
public class Triangle extends GeometricObject {
   //data fields
   private double side1;
   private double side2;
   private double side3;
   
   //print out how to color this shape
   public void howToColor() {
      System.out.println("Color all three sides");
   }
   
   //no-arg constructor
   public Triangle() {
      side1 = 0;
      side2 = 0;
      side3 = 0;
   }
   
   //constructor with specified sides
   public Triangle(double newSide1, double newSide2, double newSide3) {
      this.side1 = newSide1;
      this.side2 = newSide2;
      this.side3 = newSide3;
   }
   
   //accessors
   public String getName() {
      return "Triangle";
   }
   
   public double getSide1() {
      return side1;
   }
   
   public double getSide2() {
      return side2;
   }
   
   public double getSide3() {
      return side3;
   }
   
   //get the area of the triangle
   public double getArea() {
      double s = (side1 + side2 + side3) / 2;
      double area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
      return area; 
   }
   
   //get the perimeter of the triangle
   public double getPerimeter() {
      double perimeter = side1 + side2 + side3;
      return perimeter;
   }
   
   //print out the sides of the triangle object
   public String toString() {
      return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
   }
   
}