//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
	}

	public String determineWinner()
	{
		String winner="";

		int compNum = (int) (Math.random() * 3);
				
		
		if (compNum == 0) {
			compChoice = "R";
		}
		else if (compNum == 1) {
		    compChoice = "P";
		}
		else if (compNum == 2) {
			compChoice = "S";
		}
		
		if (playChoice.equals(compChoice)) {
			
			winner = "Draw";
		}
		else if ((compChoice.equals("P") && playChoice.equals("S")) || 
				(compChoice.equals("S") && playChoice.equals("R")) ||
				(compChoice.equals("R") && playChoice.equals("P"))) {
			
			winner = "Player";
			
		} else {
			
			winner = "Computer";
			
		}
		
		return winner;
	}

	public String toString()
	{
		String output="";
		String choice = "";
		

		if (compChoice.equals("R") && playChoice.equals("P")) {
			output = "!Player Wins ";
			choice = "<<Paper Covers Rock>>!";
		}
		else if (compChoice.equals("P") && playChoice.equals("R")) {
			output = "!Computer Wins ";
			choice = "<<Paper Covers Rock>>!";
		}
		else if (compChoice.equals("P") && playChoice.equals("S")) {
			output = "!Player Wins ";
			choice = "<<Scissors Cut Paper>>!";
		}
		else if (compChoice.equals("S") && playChoice.equals("P")) {
			output = "!Computer Wins ";
			choice = "<<Scissors Cut Paper>>!";
		}
			
		else if (compChoice.equals("R") && playChoice.equals("S")) {
			output = "!Computer Wins ";
			choice = "<<Rock Breaks Scissors>>!";
		}
		else if (compChoice.equals("S") && playChoice.equals("R")) {
			output = "!Player Wins ";
			choice = "<<Rock Breaks Scissors>>!";
		}
		else if ((compChoice.equals(playChoice))) {
			output = "!Draw Game!";
			choice = " ";
		}
		
		
		return output + choice + " Computer chose: " + compChoice;
	}
}