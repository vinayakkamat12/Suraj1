package capgemini.javabeans;

public class ShapeUtility {
 //no instance field..
	//no instance method..
	//all static fields only..
	//no instance method..
	//All static method only..
	public static Rectangle whoisBiggerTwo(Rectangle rectOne,Rectangle rectTwo)
	{
		if(rectOne.getLength()>rectTwo.getLength())
			return rectOne;
		else
			return rectTwo;
		
	}
}
