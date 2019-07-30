package capgemini.lang;

public class SimpleString {
public static void main(String[] args) {
	String s1="JAVA";
	String s2 ="JAVA";
	String s3= new String("JAVA");
	char[] value={'J','A','V','A'};
	String s4=new String(value);
	String s5= new String(s4);
	if(s1==s2)// values and memory location are same
	{
		System.out.println("s1==s2");
		
	}
	if(s1!=s3)// values are same but different memory locations
	{
		System.out.println("s1!=s3");
	}
	System.out.println("s1 equals s2"+(s1.equals(s2)));//true
	System.out.println("s1 equals s3"+(s1.equals(s3)));//true
	System.out.println("Length of string s2"+s2.length());//true
	if(s1.isEmpty())
	{
		System.out.println("String s1 is empty");
	}
	else 
	{
		System.out.println("String s1 is not empty");
	}
	System.out.println("Value present in string s1 at index1"+s1.charAt(1));
	if(s1.startsWith("J"))
	{
		System.out.println("String prefix found");
	}
	else
	{
		System.out.println("String prefix didnt found");
	}
	System.out.println("index:"+s1.indexOf("J"));
	s1=s1.concat("jdk");
	System.out.println(s1);
	byte[] byt=s1.getBytes();
	System.out.println("byte array"+byt);
	System.out.println(s1.toUpperCase());
	StringBuffer sb=new StringBuffer("JAVA");
	sb.append("jdk 8");
	System.out.println("sb:"+sb);
	
	
	
	
}
}
