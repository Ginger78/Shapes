
public class Square extends GeometricObject {
   //data fields
   private double side1;
   private double side2;
   private double side3;
   private double side4;
   
   //howToColor method
   public void howToColor() {
      System.out.println("Color all four sides");
   }
   
   //no arg constructor
   public Square() {
      side1 = 1.0;
      side2 = 1.0;
      side3 = 1.0;
      side4 = 1.0;
   }
   
   //specified constructor
   public Square(double newSide) {
      this.side1 = newSide;
      this.side2 = newSide;
      this.side3 = newSide;
      this.side4 = newSide;
   }
   
   //accessors
   public String getName() {
      return "Square";
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
   
   public double getSide4() {
      return side4;
   }
   
   public double getArea() {
      return side1 * side2;
   }
   
   public double getPerimeter() {
      return side1 * 4;
   }
   
   //mutator
   public void setSides(double newSide) {
      this.side1 = newSide;
      this.side2 = newSide;
      this.side3 = newSide;
      this.side4 = newSide;   
   }
   
   //toString method
   public String toString() {
      return "Square: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3 + " side4 = " + side4;
   }

}