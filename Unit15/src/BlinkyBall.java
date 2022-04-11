//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class BlinkyBall extends Ball
{


   //constructors
   public BlinkyBall()
   {
		super(200, 200);

   }

   public BlinkyBall(int x, int y)
   {
	   super(x, y);


   }

   public BlinkyBall(int x, int y, int wid, int ht)
   {
	   super(x, y, wid, ht);


   }

   public BlinkyBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x, y, wid, ht, Color.red, xSpd, ySpd);


   }

   public BlinkyBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   super(x, y, wid, ht, col, xSpd, ySpd);
   }

   public Color randomColor()
   {
   	int r = (int)(Math.random()*255);		//use Math.random()
 		int g = (int)(Math.random()*255);
 		int b = (int)(Math.random()*255);
 		return new Color(r,g,b);
   }

   public void moveAndDraw(Graphics window)
   {

	   Color c = randomColor();
	   setColor(Color.WHITE);
	   draw(window);
   	//draw a white ball at old ball location

      setX(getX()+super.getXSpeed());
		//setY
      setY(getY()+super.getYSpeed());

		//draw the ball at its new location
      setColor(c);
      draw(window);
   }
}