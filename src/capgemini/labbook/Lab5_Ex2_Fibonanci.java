package capgemini.labbook;
import java.util.Scanner;
public class Lab5_Ex2_Fibonanci {
public static void main(String[] args) {
	

int result=0,n=0,a=1,b=1;
Scanner sc =new Scanner(System.in);
System.out.println("enter the number");
n=sc.nextInt();

result=result+a+b;
for(int i=2;i<n;i++)
{
result=a+b;
a=b;
b=result;

}
System.out.println("Your n th fibonanci term is: "+result+"  If you feel that this value is incorrect then try to find on your own");
}	
}
