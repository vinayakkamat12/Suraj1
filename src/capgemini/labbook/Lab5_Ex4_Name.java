package capgemini.labbook;

import java.util.Scanner;

public class Lab5_Ex4_Name {
public static void main(String[] args) {
	String fname,lname;
	fname="suraj ";
	lname=null;
	Scanner sc = new Scanner(System.in);
	
	try
	{
		System.out.println("Enter first name");
	
	//fname=sc.next();
	//System.out.println("Enter last name");
	//lname=sc.next();
	String sp=check(fname,lname);
	System.out.println(sp);
}catch(Exception ex)
	{
	System.err.println("Enter valid name");
	}
}
	public static String check(String fname, String lname) throws Exception {
		try {
			if (fname==null||lname==null)

			{
				throw new Exception("either your first or last name is null");
			}
		} catch (Exception ex) {
			throw ex;
		}
		return "Your name is valid";
	}

}
