package capgemini.oops;

public class Student {
	public static void main(String args[]) {

		Student_Info s1,s2;
		String[] sub= {"phy","chem","maths"};
	
		s1 = new Student_Info(101, "suraj", 250);
		s2= new Student_Info(102, "Toshu", 225);
		s1.display();
		System.out.println("Your grade:"+s1.CalGrade());
		System.out.println("Your percentage:"+s1.Calper());
		s2.display();
		System.out.println("Your grade:"+s2.CalGrade());
		System.out.println("Your percentage:"+s2.Calper());
		System.out.println(s1.equals(s2));
	}
}

class Student_Info {
	// declaration
	int rollno, total = 300;
	String name, grade;
	float marks;
	//initialization
	public Student_Info(int roll, String name1, float marks1) {
		rollno = roll;
		name = name1;
		marks = marks1;
	}
	//methods
	void display() {
		System.out.println("Roll number is:" + rollno);
		System.out.println("name is:" + name);
		System.out.println("marks are:" + marks);
	}

	String CalGrade() {
		if (marks < 100) {
			grade = "c";
			}
		else if (marks > 100 && marks < 200) {
			grade = "b";
			} 
		else {
			grade = "a";
			}
		return grade;

	}

	public double Calper()
		{
			return (marks / 3);
		}
@Override
public boolean equals(Object obj) {
Student_Info other_Student=(Student_Info)obj;
	if(this.marks==other_Student.marks)
	{
		return true;
	}
	else{
	return false;
	}
	}
	{

	}

}
