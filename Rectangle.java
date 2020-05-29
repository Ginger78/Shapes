
public class Rectangle extends GeometricObject {
	
	private double width;
	private double height;
	
   public void howToColor() {
      System.out.println("Color all four sides");
   }
   
	public Rectangle() {
		width = 1.0;
		height = 1.0;
	}
	
	public Rectangle(double newWidth, double newHeight) {
		this.width = newWidth;
		this.height = newHeight;
	}
	
	public Rectangle(double newWidth, double newHeight, String newColor, boolean newFilled) {
		this.width = newWidth;
		this.height = newHeight;
		this.color = newColor;
		this.filled = newFilled;
	}
	
   public String getName() {
      return "Rectangle";
   }
   
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double newWidth) {
		this.width = newWidth;
	}

	public double getHeight() {
		return height;
	}
	
	public void setHeight(double newHeight) {
		this.height = newHeight;
	}
	
	public double getArea() {
		return (width * height);
	}
	
	public double getPerimeter() {
		return 2 * (width + height);
	}
	
	
}
