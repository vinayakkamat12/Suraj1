package capgemini.javabeans;

public class Circle extends Shape {

	private float radius;

	public Circle(float radius) {
		setRadius(radius);
	}

	@Override
	public void draw() {
		System.out.println("Circle is drawn");
	}

	public void setRadius(float radius) {
		if (radius > 0) {
			this.radius = radius;
		}
	}

	public float getRadius() {
		return radius;
	}

	@Override
	public double calArea() {
		System.out.println("circle area:"+radius * radius * Math.PI);
		return radius * radius * Math.PI;
	}

}
