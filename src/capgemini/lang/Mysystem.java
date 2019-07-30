package capgemini.lang;

import capgemini.javabeans.Employee;

public class Mysystem {
public static void main(String[] args) {
	System.out.println(System.currentTimeMillis());
	System.out.println();
	//System.out.println(System.lineSeparator());
	long startmemory=Runtime.getRuntime().freeMemory();
	long starttimemillis=System.currentTimeMillis();
	System.out.println("start time:"+starttimemillis);
	//consuming memory
	for (int i = 0; i < 10000; i++) {
		new Employee();
		
	}
	System.out.println("last employee id:"+Employee.sequence);
	System.out.println("total employee count:"+Employee.count);
	long endTimemillis= System.currentTimeMillis();
	long endmemory=Runtime.getRuntime().freeMemory();
	System.out.println("end millis:"+endTimemillis);
	System.out.println("memory:"+endmemory);
}
}
