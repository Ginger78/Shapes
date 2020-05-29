import java.util.Date;

public abstract class GeometricObject implements Colorable {
	
	protected String color;
	protected boolean filled;
	private Date DateCreated;
	
	public GeometricObject() {
		color = "white";
		filled = false;
		DateCreated = new Date();
	}

	public GeometricObject(String newColor, boolean newFilled) {
		this.color = newColor;
		this.filled = newFilled;
		DateCreated = new Date();
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String newColor) {
		this.color = newColor;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean newFilled) {
		this.filled = newFilled; 
	}
	
	public Date getDateCreated() {
		return DateCreated;
	}
	
	public String toString() {
		return "This is the parent toString: " + DateCreated + " color: " + color + " filled: " + filled;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
   public abstract void howToColor();
   
   public abstract String getName();
}
