import java.util.Scanner;

public class TestTriangle {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      //variables needed to assign what the user inputs
      double side1;
      double side2;
      double side3;
      String color;
      boolean bValue;
      
      //following code assigns the user inputted data to the corresponding variables
      System.out.println("Enter the first side of the triangle: ");
      side1 = in.nextDouble();
      
      System.out.println("Enter the second side of the triangle: ");
      side2 = in.nextDouble();
      
      System.out.println("Enter the third side of the triangle: ");
      side3 = in.nextDouble();
      
      System.out.println("Enter the color of the triangle: ");
      color = in.next();
      
      System.out.println("Enter either true or false to indicate if the triangle is filled or not: ");
      bValue = in.nextBoolean(); 
      System.out.println(bValue);
      
      //create a triangle with the specified sides that the user inputted
      Triangle triangle1 = new Triangle(side1, side2, side3);
      
      //set the color of the triangle to what the user inputted
      triangle1.setColor(color); 
      
      //set the boolean value of filled to either true or false based on the user input
      triangle1.setFilled(bValue);
      
      //print out the area, perimeter, color, and the boolean value of filled of the triangle
      System.out.println("The area of triangle1 is: " + triangle1.getArea());
      System.out.println("The perimeter of triangle1 is: " + triangle1.getPerimeter());
      System.out.println("The color of triangle1 is: " + triangle1.getColor());
      System.out.println("Is triangle1 filled? : " + triangle1.isFilled());
   }
}   