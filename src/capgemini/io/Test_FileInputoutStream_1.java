package capgemini.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test_FileInputoutStream_1 {
	public static void main(String[] args)  {
		File file;
		String message="We are learning java";
		FileInputStream fileInput=null;
		file= new File("C:\\Capgemini\\suraj2.txt");
		try(FileOutputStream fileoutput=new FileOutputStream(file))
		{
			fileoutput.write(message.getBytes());
			fileoutput.flush();
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
