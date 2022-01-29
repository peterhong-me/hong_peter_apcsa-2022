//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		StringEquality a = new StringEquality();
		
		a.setWords("hello", "goodbye");
		out.println(a);
		
		a.setWords("one", "two");
		out.println(a);
		
		a.setWords("three", "four");
		out.println(a);
		
		a.setWords("TCEA", "UIL");
		out.println(a);
		
		a.setWords("State", "Champions");
		out.println(a);
		
		a.setWords("ABC", "ABC");
		out.println(a);
		
		a.setWords("ABC", "CBA");
		out.println(a);
		
	}
}