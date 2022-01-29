//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
 		//add test cases
 	   WordsCompare a = new WordsCompare();
 	   
 	   a.setWords("abe", "ape");
 	   a.compare();
 	   out.println(a);
 	   
 	   a.setWords("giraffe", "gorilla");
 	   a.compare();
 	   out.println(a);
 	   
 	   a.setWords("one", "two");
 	   a.compare();
 	   out.println(a);
 	   
 	   a.setWords("fun", "funny");
 	   a.compare();
 	   out.println(a);
 	   
 	   a.setWords("123", "19");
 	   a.compare();
 	   out.println(a);

 	   a.setWords("193", "1910");
 	   a.compare();
 	   out.println(a);
 	   
 	   a.setWords("goofy", "godfather");
 	   a.compare();
 	   out.println(a);
 	   
 	   a.setWords("funnel", "fun");
 	   a.compare();
 	   out.println(a);

 	}
 }