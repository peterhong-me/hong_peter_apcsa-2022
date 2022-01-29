//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String vowel = "aeiouAEIOU";
	   if (vowel.indexOf(a.charAt(0)) == -1) {
		   if (vowel.indexOf(a.charAt(a.length() - 1)) == -1) {
			   return "no";
		   }
	   }
	   return "yes";
	}
}