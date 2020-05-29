
public class TestShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle1 = new Circle();
		Rectangle rectangle1 = new Rectangle();
		rectangle1.setWidth(2);
		rectangle1.setHeight(4);
		
		System.out.println(circle1.toString());
		
		System.out.println("The color is: " + circle1.getColor());
		
		circle1.setColor("red");
		
		System.out.println("The color is: " + circle1.getColor());
		
		System.out.println("The radius is " + circle1.getRadius());
		
		System.out.println("The area is " + circle1.getArea());
		
		System.out.println("The diameter is " + circle1.getDiameter());
		
		System.out.println("A rectangle created on: " + rectangle1.getDateCreated() + 
				" color: " + rectangle1.getColor() + " filled: " + rectangle1.isFilled());
		
		System.out.println("The area is " + rectangle1.getArea());
		
		System.out.println("The perimeter is " + rectangle1.getPerimeter());
	}
		

}
