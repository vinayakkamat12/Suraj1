package capgemini.javabeans;

public class Rectangle1 extends Shape {

	private float length, breadth;

	public Rectangle1(float length, float breadth) {
		setlength(length);
		setBreadth(breadth);
	}

	public void setlength(float length) {
		this.length = length;
		// this.breadth=breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
		// this.breadth=breadth;
	}

	public float getLength() {
		return length;
	}

	public float getBreadth() {
		return breadth;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle is drawn");
	}

	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		System.out.println("rectangle area:"+length * breadth);
		return length * breadth;
	}
	
}
