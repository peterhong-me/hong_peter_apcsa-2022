/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card test = new Card("ace", "spades", 1);
		Card test2 = new Card("ace", "spades", 1);
		Card test3 = new Card("ten", "diamonds", 10);
		
		System.out.println(test.matches(test2));
		System.out.println(test.matches(test3));
		System.out.println(test2.matches(test3));
	
		System.out.println(test);
		System.out.println(test2);
		System.out.println(test3);
		
	}
}