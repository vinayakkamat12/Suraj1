package capgemini.labbook;
import java.util.Scanner;
public class Lab5_Ex5_Age {
public static void main(String[] args) {
	int age;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your age");
	age=sc.nextInt();
	try
	{
		Age_check(age);
		System.out.println("valid age");
	}catch(Exception ex)
	{
		System.out.println("please enter age more than 15 years"+ex);
	}
}
static void Age_check(int age) throws Exception
{
try
{
if(age<15)
{
	throw new Exception("your age is:"+age);
}
}catch(Exception ex)
{
	throw ex;
//System.err.println("Age should be more than 15 years");	
}

}
}
