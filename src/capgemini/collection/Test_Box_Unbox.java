package capgemini.collection;

public class Test_Box_Unbox {
public static void main(String[] args) {
	int _int=10;
	Integer _intobj=new Integer(10);
	_int=_intobj;     //object type is assigned to primitive type// unboxing
	_intobj=_int;     //primitive type is assigned to object type// boxing
	// before jdk1.5 - explicit type conversion was needed
	//object type is converted and assigned to primitive type
	// code needed earlier
	_int=_intobj.intValue();
	_intobj=Integer.valueOf(_int);
}
}
