//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}
	

	//add the other Ball constructors
	
	public Ball (int x, int y) {
		super(x, y);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball (int x, int y, int width, int height) {
		super(x, y, width, height);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball (int x, int y, int width, int height, Color col) {
		super(x, y, width, height, col);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball (int x, int y, int width, int height, Color col, int xS, int yS) {
		super(x, y, width, height, col);
		xSpeed = xS;
		ySpeed = yS;
	}
	
	   
   //add the set methods
	public void setXSpeed(int xS) {
		xSpeed = xS;
	}
	
	public void setYSpeed(int yS) {
		ySpeed = yS;
	}
   

   public void moveAndDraw(Graphics window)
   {
	   Color c = getColor();
	   setColor(Color.WHITE);
	   draw(window);
   	//draw a white ball at old ball location

      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);

		//draw the ball at its new location
      setColor(c);
      draw(window);
   }
   
	public boolean equals(Object obj)
	{
		
		Ball other = (Ball)obj;
		if (super.equals(other) && getXSpeed() == other.getXSpeed() && getYSpeed() == other.getYSpeed()) {
			return true;
		}

		return false;
	}   

   //add the get methods
	
	public int getXSpeed() {
		return xSpeed;
	}
	
	public int getYSpeed() {
		return ySpeed;
	}
	
	public Color getColor() {
		return super.getColor();
	}

	
   //add a toString() method
}