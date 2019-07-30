package capgemini.io;
import  java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Test_FileInputoutStream {
public static void main(String[] args)  {
	File file;
	FileInputStream fileInput=null;
	file= new File("C:\\Capgemini\\suraj.txt");
	try
	{
		fileInput=new FileInputStream(file);
		int input=0;
		while((input=fileInput.read())!=-1)
		{
			System.out.print((char)input);
		}
		
	}catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}catch(IOException ex)
	{
		ex.printStackTrace();
	}finally
	{
		try {
			fileInput.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
}
}
