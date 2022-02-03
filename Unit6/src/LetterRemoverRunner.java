//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover test = new LetterRemover();
		
		test.setRemover("Hello World", 'o');
		test.removeLetters();
		System.out.println(test);
	
		test.setRemover("Peter Piper Picked a Peck of Picked Peppers", 'P');
		test.removeLetters();
		System.out.println(test);
		
		test.setRemover("I am Sam I am", 'a');
		test.removeLetters();
		System.out.println(test);
		
	}
}