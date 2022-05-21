//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;

	public Alien()
	{
		this(0,0,30,30,2);
	}

	public Alien(int x, int y)
	{
		super(x, y, 30, 30);
		speed = 2;
	}

	public Alien(int x, int y, int s)
	{
		super(x, y, 30, 30);
		setSpeed(s);
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		setSpeed(s);
		try
		{
			URL url = getClass().getResource("alien.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			//feel free to do something here
		}
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void move(String direction)
	{
//		if(direction.equals("LEFT") ) {
//			setX(getX() - getSpeed());
//		}
//		else if(direction.equals("RIGHT") ) {
//			setX(getX() + getSpeed());
//		}
//		else if(direction.equals("UP") ) {
//			setY(getY() - getSpeed());
//		}
//		else if(direction.equals("DOWN") ) {
//			setY(getY() + getSpeed());
//		}
		
		while(super.getY() < 600) {
			super.setX(getX() + getSpeed());
			if (getX() > getWidth()) {
				speed = -speed;
				super.setY(getY() + 25);
			}
		}
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return "";
	}
}