package capgemini.oops;

class Rectangle {
	// fields
	float length, breadth;

	// constructors
	public Rectangle() {
		length = 0.0f;
		breadth = 0.0f;
	}

	// constructor overloading
	public Rectangle(float plength, float pbreadth) {
		length = plength;
		breadth = pbreadth;
	}

	void show() {
		System.out.println("Rectangle is drawn");
	}

	public double calArea() {
		return length * breadth;
	}
	@Override
	public boolean equals(Object obj) {
		
		Rectangle otherRectangle=(Rectangle) obj;
		if(this.length==otherRectangle.length)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}

public class Rectangle_Test {
	public static void main(String args[]) {
		// declaration
		Rectangle r1, r2;
		// object instantiation
		r1 = new Rectangle(5.5f,6.5f);
		r2 = new Rectangle(5.5f, 6.5f);
		// calling methods
		r1.show();
		System.out.println("r1 area:" + r1.calArea());
		r2.show();
		System.out.println("r2 area:" + r2.calArea());
	}
}
