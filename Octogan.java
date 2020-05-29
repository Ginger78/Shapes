import java.lang.Cloneable;

public class Octogan extends GeometricObject implements Cloneable, Comparable<Octogan> {
   //data fields
   private double side1;
   private double side2;
   private double side3;
   private double side4;
   private double side5;
   private double side6;
   private double side7;
   private double side8;
   
   //this class's howToColor method
   public void howToColor() {
      System.out.println("Color all eight sides");
   }
   
   //no-arg constructor
   public Octogan() {
      side1 = 1.0;
      side2 = 1.0;
      side3 = 1.0;
      side4 = 1.0;
      side5 = 1.0;
      side6 = 1.0;
      side7 = 1.0;
      side8 = 1.0;
   }
   
   //specified constructor
   public Octogan(double newSide) {
      this.side1 = newSide;
      this.side2 = newSide;
      this.side3 = newSide;
      this.side4 = newSide;
      this.side5 = newSide;
      this.side6 = newSide;
      this.side7 = newSide;
      this.side8 = newSide;
   }
   
   //accessors
   public String getName() {
      return "Octogan";
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
   
   public double getSide5() {
      return side5;
   }
   
   public double getSide6() {
      return side6;
   }
   
   public double getSide7() {
      return side7;
   }
   
   public double getSide8() {
      return side8;
   }
   
   public double getArea() {
      return (2 + (4/22)) * side1 * side1;
   }
   
   public double getPerimeter() {
      return 8 * side1;
   }
   
   //mutator method
   public void setSides(double newSide) {
      this.side1 = newSide;
      this.side2 = newSide;
      this.side3 = newSide;
      this.side4 = newSide;
      this.side5 = newSide;
      this.side6 = newSide;
      this.side7 = newSide;
      this.side8 = newSide;
   }
   
   //toString method
   public String toString() {
      return "Octogan: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3 + " side4 = " + side4 + " side5 = " + side5 + 
      " side6 = " + side6 + " side7 = " + side7 + " side8 = " + side8;
   }
   
   //cloneable method
   public Object clone() throws CloneNotSupportedException {
      return super.clone();
   } 
   
   
   //compare area of octogans
   public int compareTo(Octogan o) {
      if (getArea()> o.getArea())
         return 1;
      else if (getArea() < o.getArea())
         return -1;
      else 
         return 0;   
   } 
   
}