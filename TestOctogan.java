
public class TestOctogan {
  
   public static void main(String[] args) throws CloneNotSupportedException {
      //create octogan object with length of 5 for its sides
      Octogan octogan1 = new Octogan(5);
      
      //print out the area and perimeter of octogan1
      System.out.println("The area of octogan1 is: " + octogan1.getArea()); 
      System.out.println("The perimeter of octogan1 is: " + octogan1.getPerimeter()); 
      
      //clone octogan1
      Octogan octogan2 = (Octogan)octogan1.clone();
      
      //print out and compare the two objects
      System.out.println("I have made a clone of octagon1 and will compare the area of octogan1 with its clone octogan2.");
      System.out.println("If a value of 1 is returned, octogan1's area is greater than octogan2, if a value of -1 is returned than octogan2's area is greater"); 
      System.out.println("than octogan1, and if a value of 0 is returned, then they both have equal area's.");
      System.out.println("The value is: " + octogan1.compareTo(octogan2) + ". They have the same area!");
       
   }
   
}