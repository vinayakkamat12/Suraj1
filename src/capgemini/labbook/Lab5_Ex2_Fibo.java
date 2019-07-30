package capgemini.labbook;
import java.util.Scanner;
public class Lab5_Ex2_Fibo {
public static void main(String[] args) {
	int result=0,a=1,b=1,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	n=sc.nextInt();
	
	result=fibo(n);
	System.out.println("your fibo series n th value: "+result+" if you feel that this value is incorrect then try on your own");
}
public static int fibo(int n) 
{ 
	if (n == 1||n==2) 
	{ 
		return 1; 
		
	} 
	
	
	return fibo(n - 1) + fibo(n - 2); }


}
