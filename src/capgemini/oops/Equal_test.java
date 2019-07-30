package capgemini.oops;

public class Equal_test {
	public static void main(String args[]) {
		String name = "capgemini";
		String company = new String("capgemini");
		if (name == company) {
			System.out.println("you are an employee");
		} else {
			System.out.println("you are not an employee");
		}
		if (name.equals(company)) {
			System.out.println("capgemini-> you are an employee");

		} else {
			System.out.println("you are not an employee");
		}
	}
}
