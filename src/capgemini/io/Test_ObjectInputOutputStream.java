package capgemini.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test_ObjectInputOutputStream {
public static void main(String[] args) {
	File file;
	Student s1=new Student(101,"Suraj",44.6f);
	file= new File("C:\\Capgemini\\suraj2.txt");
	try(FileOutputStream fileoutput=new FileOutputStream(file);
			ObjectOutputStream objectOutput= new ObjectOutputStream(fileoutput))
	{
		objectOutput.writeObject(s1);
		objectOutput.flush();
	}catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}catch(IOException ex)
	{
		ex.printStackTrace();
	}
	System.out.println("file is written");
	
}

}
