package capgemini.abstracts;

import capgemini.javabeans.Shape;

abstract class shape {
	public shape() {
		super();// will call def const of object class
		System.out.println("shape->def...");
	}

	public void draw() {
		System.out.println("Shape is drawn");
	}

	public abstract double calcArea();

	@Override
	public String toString() {

		return "Shape->";
	}
}

class Circle extends shape {

	float radious;

	// define constructor
	public Circle() {
		super(); // will call default constructor of shape class
		System.out.println("Circle->def...");
	}

	// parameterized constructor
	public Circle(float radious) {
		super();// will call default constructor of shape class
		this.radious = radious;
	}
	@Override
	public void draw()
	{
		super.draw();//will call method from shape class
		System.out.println("Circle is draw");
		
	}
	@Override
	public double calcArea()
	{
		return radious*radious*radious*Math.PI;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
	public void showCircle()
	{
		System.out.println("I am circle");
	}
	
	
}


public class Test_shape {
public static void main(String[] args) {
	Circle c1=new Circle();
	c1.draw();
	c1.calcArea();
	c1.showCircle();
	shape Shape= new Circle();
	Shape.calcArea();
	Shape.draw();
	//shape.showCircle();
	
}
}
