package capgemini.interfaces;

 interface CalculatorTest {
	//by default methods are public and abstract
		int add(int no1, int no2); //no body
		public abstract int sub(int no1,int no2);
		
}

interface Advcalculator
{
	int mul(int no1, int no2);
	int div(int no1, int no2);

}

//Interfaces are implemented via class
class CalculatorImpl implements CalculatorTest, Advcalculator
{
// the type calculator must implement the inherited abstract method
	@Override
	public int add(int no1, int no2) {
		
		return no1+no2;
	}
	
	@Override
		public int sub(int no1, int no2) {
			
			return no1-no2;
		}
	
	@Override
		public int mul(int no1, int no2) {
			
			return no1*no2;
		}
	
	@Override
		public int div(int no1, int no2) {
			
			return no1/no2;
		}

}
public class Calculator
{
public static void main(String[] args) {
	CalculatorImpl cal=new CalculatorImpl();
	//Advcalculator adv;
	System.out.println(cal.add(4,5));
	System.out.println(cal.sub(7, 2));
	System.out.println(cal.mul(5, 2));
	System.out.println(cal.div(10, 2));
	
}	
}