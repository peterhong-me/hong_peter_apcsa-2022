//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	public Perfect() {
		
		setNum(0);
	}
	public Perfect(int num) {
		setNum(num);
	}
	
	public void setNum(int num) {
		
		number = num;
	}

	public boolean isPerfect()
	{
		int numberCheck = 0;
		for (int i = 1; i < number; i++) {
			if (number % i ==0) {
				numberCheck = numberCheck + i;
			}
		}
		if (numberCheck == number) {
			return true;
		}
		return false;
	}

	public String toString() {
		if (isPerfect() == true) {
			return String.valueOf(number) + " is perfect.";
			}
		return String.valueOf(number) + " is not perfect.";
	}
	
}