package capgemini.javabeans;

public class Rectangle {

	//fields
	private float length, breadth;
	//default..
	public Rectangle()
	{
		//to call another constructor
		this(0.0f,0.0f);//will call param constructor0
		System.out.println("rectasngle->def...");
		
	}
	public Rectangle(float length, float breadth)
	{
		//this.length=length;
		//this.breadth=breath;
		setLength(length);
		setBreadth(breadth);
		System.out.println("Rectangle->param...");
	}
	// setter method to set value of private variables
	public void setLength(float length)
	{
		if(length>0)
			{
				this.length=length;
			}
		
	}
	public void setBreadth(float breadth)
	{
		if(breadth>0)
		{
			this.breadth=breadth;
		}
	}
	
	//getter methods
	public float getLength()
	{
		//System.out.println(this.length);
		return length;
	}
	public float getBreadth()
	{
		//System.out.println(this.breadth);
		return breadth;
	}
	
	public double calArea()
	{
		return length*breadth; 
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Length:"+getLength()+"\tBreadth:"+ getBreadth();
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Rectangle)) {
			return false;
		}
		Rectangle other = (Rectangle) obj;
		if (Float.floatToIntBits(breadth) != Float.floatToIntBits(other.breadth)) {
			return false;
		}
		if (Float.floatToIntBits(length) != Float.floatToIntBits(other.length)) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		//declaration
		Rectangle r1;
		//object instantiation
		r1=new Rectangle();
		//accessing field of an object
		r1.length=5.5f;
		r1.breadth=6.5f;
		//accessing method of an object
		
		
	}
	
}
