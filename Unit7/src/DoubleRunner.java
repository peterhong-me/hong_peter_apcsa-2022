//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class DoubleRunner
{
	public static void main(String[] args)
	{
		BiggestDouble run = new BiggestDouble(4.5,6.7,7.8,9.0);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");

		//add more test cases
		
		run.setDoubles(234.32, 2343.33, 2423.34, 2342.432);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");
		
		run.setDoubles(22.25, 14.25, 123.42, 12.25);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");
		
		run.setDoubles(23.55, 55.5, 62.2, 54.2);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");
		
				
	}
}