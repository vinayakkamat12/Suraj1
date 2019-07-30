package capgemini.javabeans;

public class Employee {

	private int empId;
	private String name;
	public static int count;
	public static int sequence;
	static 
	{
		count=0;
		sequence=100;
	}
	public Employee()
	{	
		count++;
	}
	public Employee(int empId, String name)
	{
		setName(name);
		setImpId(empId);
		count++;
		sequence++;
	}
	public int getEmpId()
	{
		return empId;
	}
	public void setImpId(int empId)
	{
		this.empId=empId;
		
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		
		this.name=name;
	}
	public static int countr()
	{
		return count;
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empId=").append(empId).append(", name=").append(name).append("]");
		System.out.println(builder.toString());
		return builder.toString();
	}
	
}
