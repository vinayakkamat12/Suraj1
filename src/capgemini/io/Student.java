package capgemini.io;

import java.io.Serializable;

class Student implements Serializable {
private int rollno;
private String name;
private float marks;
public Student()
{
super();	
}
public Student(int rollno, String name, float marks) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.marks = marks;
}
/**
 * @return the rollno
 */
public int getRollno() {
	return rollno;
}
/**
 * @param rollno the rollno to set
 */
public void setRollno(int rollno) {
	this.rollno = rollno;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the marks
 */
public float getMarks() {
	return marks;
}
/**
 * @param marks the marks to set
 */
public void setMarks(float marks) {
	this.marks = marks;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
}


}
