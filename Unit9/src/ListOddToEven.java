//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int firstOdd = -1;
		int lastEven = -1;
		
		for (int i = 0; i<ray.size();i++) {
			if (ray.get(i) % 2 == 1) {
				firstOdd = i;
				break;
			}
		}
		
		if (firstOdd > -1) {
			for (int j = ray.size()-1; j>0; j--) {
				if (ray.get(j) % 2 == 0) {
					lastEven = j;
					break;
				}
			}
			if (lastEven > -1) {
				return lastEven - firstOdd;
			}
			else {
				return -1;
			}
		}
		else {
			return -1;
		}
	
	}
}