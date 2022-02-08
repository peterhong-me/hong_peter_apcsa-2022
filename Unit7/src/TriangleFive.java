import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter(' ');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		
		
		int toPrint = amount;
		int columnNum = amount;
		
		for (int r = 0; r < amount; r++) {
		
			for (int c = 0; c < columnNum; c++) {

				for (int s = 0; s < toPrint; s++) {
					if (letter+amount-toPrint < 91) {
						output += (char) (letter+amount-toPrint);
					}
					else {
						output += (char) (letter+amount-toPrint-26);
					}
				}
				output+=" ";
				toPrint--;
			}
			output += "\n";
			toPrint = amount;
			columnNum--;
			
		}
	
		
		
		return output;
	}
}