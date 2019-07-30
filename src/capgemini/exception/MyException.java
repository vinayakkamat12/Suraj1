package capgemini.exception;

import javax.sound.midi.SysexMessage;

public class MyException {

	static int div1(int no1, int no2) throws Exception {
		try {
			if (no2 <= 0)
			{throw new Exception("no2 has a value:" + no2);
			}
		} catch (Exception ex) {
			System.err.println("can not divide by zero.."+ex.getMessage());
			 throw ex;
		}
		return no1 / no2;

	}

	static int div2(int no1, int no2) throws Exception  {
		try
		{
			if (no2 <= 0)
		
			{
				throw new Exception("no2 has value:" + no2);
			}
		}catch(Exception ex)
		{
			throw ex;
		}
			
		return no1 / no2;
	}

	public static void main(String[] args) {
		System.out.println("started...");
		if (args.length < 2) {
			System.out.println("please provide two arguments");
			System.exit(0);
		}
		int no1, no2, result;
		no1 = no2 = result = 0;
		try {
			no1 = Integer.parseInt(args[0]);
			no2 = Integer.parseInt(args[1]);
			result = div2(no1, no2);

			System.out.println("Result:" + result);

		} catch (NumberFormatException ex) {
			System.err.println("please provide 2 numeric arguments...");
		} catch (ArithmeticException p) {
			System.err.println("please provide 2nd number other than 0");
		}
		catch (Exception ex)
		{
			System.err.println("caught in main");
		}
		finally {
			System.out.println("I will reach the condition");
		}
	}
}
