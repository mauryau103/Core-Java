package practicewithk;

public class Sphere {
	int radius = 1;
	double xCenter;
	double yCenter;
	double zCenter;

	// Parameterized Constructor
	public Sphere(double xCenter, double yCenter, double zCenter) {
		this();
		this.xCenter = xCenter;
		this.yCenter = yCenter;
		this.zCenter = zCenter;
	}// sphere(-,-,-)

	// Default Constructor
	public Sphere() {
		radius = 1;
	}// sphere()

	public Sphere(int radius, double xCenter, double yCenter, double zCenter) {
		this(xCenter, yCenter, zCenter);
		this.radius = radius;
		this.xCenter = xCenter;
		this.yCenter = yCenter;
		this.zCenter = zCenter;
	}// sphere(-,-,-,-)

	public String toString() {
		return "value of radius=" + radius + ", value of xCenter=" + xCenter + ", value of yCenter=" + yCenter
				+ ", value of zCenter=" + zCenter;
	}// toString()

}// class