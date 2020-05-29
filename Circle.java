
public class Circle extends GeometricObject {

	private double radius;
	
   public void howToColor() {
      System.out.println("Color its one side");
   }
   
	public Circle() {
		radius = 1.0;
	}
	
	public Circle(double newRadius) {
		this.radius = newRadius;
	}
	
	public Circle(double newRadius, String newColor, boolean newFilled) {
		this.radius = newRadius;
		this.color = newColor;
		this.filled = newFilled;
	}
	
   public String getName() {
      return "Circle";
   }
   
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	public double getDiameter() {
		return 2 * radius;
	}
	
	public String toString() {
		return super.toString() + "\n" + "This is the child's toString: The circle is created on " + getDateCreated() +
				" and the radius is " + getRadius();
	}
	
}
