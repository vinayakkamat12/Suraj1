package capgemini.labbook;

import java.util.Scanner;

public class Lab4_Ex1_Cubes {
	public static void main(String[] args) {
		int n, r = 0, sum = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while (n > 0) {
			r = n % 10;
			sum = sum + (r * r * r);
			n = n / 10;
		}
		System.out.println("sum ofcubes is:"+sum);
	}
}
