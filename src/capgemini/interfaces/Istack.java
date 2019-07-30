package capgemini.interfaces;

import java.util.Scanner;

interface StackI {
	void push();

	void pop();

	void display();
}

class Istackimp implements StackI {
	String[] array = new String[5];
	int top = -1;
	Scanner sc = new Scanner(System.in);
	String name;

	@Override
	public void push() {

		// System.out.println("enter string to be pushed");
		// String name1=sc.next();
		if (top == 5) {
			System.out.println("overflow");

		} else {
			System.out.println("enter string");
			name = sc.next();
			top++;
			array[top] = name;

		}

	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		if (top == -1) {
			System.out.println("underflow");
		} else {
			System.out.println(array[top] + "is popped");
			top--;
		}

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		for (int i = top; i >= 0; --i) {
			System.out.println(array[i]);

		}
	}
}

public class Istack {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ch;
		Istackimp s1 = new Istackimp();
		// System.out.println("enter your choice 1. push 2. pop 3. display");
		// ch=sc.nextInt();
		do {
			System.out.println("enter your choice 1. push 2. pop 3. display");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				s1.push();
				break;
			// s1.display();
			case 2:
				s1.pop();
				break;
			case 3:
				s1.display();
				break;
			}
		} while (ch < 3);
	}
}
