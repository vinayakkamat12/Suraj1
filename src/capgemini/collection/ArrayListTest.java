package capgemini.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		String str="hi";
		List<String> list= new ArrayList<String>();
		list.add("String");
		list.add(str+str);//hihi
		System.out.println(list.size());
		System.out.println(list.contains(43));
		System.out.println(list.contains("hihi"));
		list.remove("hi");
		System.out.println(list.size());
		//printing using iterator
		Iterator iterator = list.iterator();
		while(iterator.hasNext())
		{
			Object obj=iterator.next();
			System.out.println(obj);
		}
		// printing using enhanced for loop
		for(Object obj:list)
		{
			System.out.println(obj);
		}
	}
}
