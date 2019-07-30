package capgemini.javabeans;

public class Shape_Test {
	public static void main(String[] args) {
		Circle c1 = new Circle(5.5f);
		Rectangle1 r1 = new Rectangle1(5, 6);
		c1.draw();
		c1.calArea();
		r1.draw();
		r1.calArea();
	}
}
