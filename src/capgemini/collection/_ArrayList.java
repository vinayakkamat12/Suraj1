package capgemini.collection;

import java.util.ArrayList;

public class _ArrayList {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	//LinkedList<String> list=new LinkedList<String>();
	//Vector<String> list=new Vector<String>(3);
	System.out.println("Size:"+list.size()+"\t"+list);
	list.add("Sun");
	list.add("Mon");
	list.add("Wed");
	System.out.println("Size:"+list.size()+"\t"+list);//list will call to string method
	//added based on index
	list.add(2, "Tue");
	System.out.println("Size:"+list.size()+"\t"+list);
	list.add("Thus");
	list.add("Free");
	list.add("Sat");
	list.add("Soon");
	System.out.println("Size:"+list.size()+"\t"+list);
	//searched a string
	if(list.contains("Free"))
		list.set(list.indexOf("Free"),"Fri");
	list.set(list.indexOf("Soon"),"Sun");
		//list.set(5,"Fri");
	//list.remove(5);
	System.out.println("Size:"+list.size()+"\t"+list);
	for(String value:list)
	{
		System.out.println(value);
	}
}
}
