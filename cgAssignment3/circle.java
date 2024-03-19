package cgAssignment3;

public class circle {
	private double radius=1.0;
	private String color="red";
	
	public circle() {
		
	}
	public circle(double radius) {
		this.radius= radius;
	}
	double getRadius() {
		System.out.println(radius);
		return radius;
	}
	
	double getArea() {
		System.out.println(Math.pow(this.radius,2)*3.14);
		return Math.pow(this.radius,2)*3.14;
	}
}
