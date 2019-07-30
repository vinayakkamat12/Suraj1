package capgemini.oops;

class Circle {
	// fields
	float radious;

	// constructors
	public Circle() {
		radious = 0.0f;
		System.out.println("circle definition");
	}

	// constructor overloading
	public Circle(float pradious) {
		radious = pradious;
		System.out.println("Circle->parameters");
	}

	// Methods
	public void draw() {
		System.out.println("Circle is drwan");
	}

	public double calcArea() {
		return radious * radious * Math.PI;
	}
		
		//method overriding from parent object class
		@Override 	//java annotation
		public String toString(){
			return "Radius:" +radious;
		}
		@Override
		public boolean equals(Object obj) {
			Circle otherCircle=(Circle) obj;
			if(this.radious==otherCircle.radious)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		 
	}



public class CircleTest {

	public static void main(String args[]) {
		// declaration
		Circle c1, c2;
		// object instantiation
		c1 = new Circle();
		c2 = new Circle(5.5f);
		// calling methods
		c1.draw();
		System.out.println("c1 area:" + c1.calcArea());
		c2.draw();
		System.out.println("c2 area:" + c2.calcArea());
		System.out.println(c1);
		System.out.println(c2.toString());
	}
}
