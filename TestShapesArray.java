
public class TestShapesArray {
   //method that displays the shapes area and howToColor method
   public static void displayAreaAndHowToColor(GeometricObject[] arr) {
      for (int i = 0; i < arr.length; i++) {
         System.out.println("This is a " + arr[i].getName() + " in the array and its area is: " + arr[i].getArea() + ".");
         System.out.println("How do you color this shape?");
         arr[i].howToColor();
      }
   }
   
   public static void main(String[] args) {
      //array of Geometric Object
      GeometricObject[] arr = new GeometricObject[5];
      
      //creating objects for arr
      Square square1 = new Square(4);
      Triangle triangle1 = new Triangle(3, 4, 5);
      Circle circle1 = new Circle(2);
      Rectangle rectangle1 = new Rectangle(2, 4);
      Square square2 = new Square(3);
      
      //fill the array with these objects
      arr[0] = square1;
      arr[1] = triangle1;
      arr[2] = circle1;
      arr[3] = rectangle1;
      arr[4] = square2;
      
      //call method
      displayAreaAndHowToColor(arr);
      
   }
}