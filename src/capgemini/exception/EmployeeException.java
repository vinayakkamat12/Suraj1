package capgemini.exception;
import java.util.Scanner;
public class EmployeeException {

	public static void main(String[] args) {
		int salary;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your salary");
		salary=sc.nextInt();
		try
		{
			if(salary<3000)
			{
				throw new Exception("your salary is less than 3000");
			}
		}catch (Exception ex)
		{
			System.err.println("your salary should be more than 3000"+ex.getMessage());
		}
	}
}
