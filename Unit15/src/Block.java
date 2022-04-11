//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		xPos = 0;
		yPos = 0;
		width = 0;
		height = 0;
		color = Color.GREEN;

	}

	//add other Block constructors - x , y , width, height, color
	
	public Block (int x) {
		setX(x);
	}
	
	public Block (int x, int y) {
		setPos(x, y);
	}
	
	public Block (int x, int y, int w) {
		setPos(x, y);
		width = w;
	}
	
	public Block (int x, int y, int w, int h) {
		setPos(x, y);
		width = w;
		height = h;
	}
	
	public Block (int x, int y, int w, int h, Color c) {
		setPos(x, y);
		width = w;
		height = h;
		setColor(c);
	}
	
	
   //add the other set methods
	public void setPos(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	public void setX(int x) {
		xPos = x;
	}
	
	public void setY(int y) {
		yPos = y;
	}
   

	public void setColor(Color col)
	{
		color = col;

	}

	public void draw(Graphics window)
	{
   	//uncomment after you write the set and get methods
		window.setColor(color);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void draw(Graphics window, Color col)
	{
		window.setColor(col);
		window.fillRect(getX(), getY(), getWidth(), getHeight());

	}
   
	public boolean equals(Object obj)
	{
		if (getX() == ((Block) obj).getX() && getY() == ((Block) obj).getY() &&
			getWidth() == ((Block) obj).getWidth() && getHeight() == ((Block) obj).getHeight()) {
			
			return true;
		}

		return false;
	}   

   //add the other get methods
	
	public int getX() {
		return xPos;
	}
	
	public int getY() {
		return yPos;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public Color getColor() {
		return color;
	}
    

   //add a toString() method  - x , y , width, height, color
	public String toString() {
		return xPos + " " + yPos + " " + width + " " + height + " " + color;
	}
}