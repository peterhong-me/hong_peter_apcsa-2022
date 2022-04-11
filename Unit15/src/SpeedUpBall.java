//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball
{

   //instance variables
	private int xSpeed;
	private int ySpeed;

   public SpeedUpBall()
   {
	   super(200,200);

   }

   public SpeedUpBall(int x, int y)
   {
	   super(x, y);

   }


   public SpeedUpBall(int x, int y, int xSpd, int ySpd)
   {
	   super(x, y, 20, 20, Color.red, xSpd, ySpd);
	   xSpeed = xSpd;
	   ySpeed = ySpd;

   }

   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x, y, wid, ht, Color.red, xSpd, ySpd);
	   xSpeed = xSpd;
	   ySpeed = ySpd;
   }


   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   super(x, y, wid, ht, col, xSpd, ySpd);
	   xSpeed = xSpd;
	   ySpeed = ySpd;

   }

   public void setXSpeed( int xSpd )
   {
	   xSpeed += 10;

   }

   public void setYSpeed( int ySpd )
   {
	   ySpeed += 10;

   }
}