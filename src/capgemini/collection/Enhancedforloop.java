package capgemini.collection;

import java.util.ArrayList;

public class Enhancedforloop {
public static void main(String[] args) {
	int intArr[]={1,2,3,4,5,};
	printArray(intArr);
	ArrayList arraylist=new ArrayList();
	arraylist.add(10);
	arraylist.add(30);
	arraylist.add(40);
	printCollection(arraylist);
}
static void printArray(int intArr[])
{
	
	for(int arrayindex:intArr)
	{
		System.out.println(arrayindex);
	}
	

}
static void printCollection(ArrayList arrList)
{
for(Object object:arrList)
{
System.out.println(object);	
}
}
}
