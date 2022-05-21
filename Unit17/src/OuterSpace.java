//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date; 

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
	private Ammo ammo;

	// uncomment once you are ready for this part
	
   private AlienHorde horde;
	private Bullets shots;
	

	private boolean[] keys;
	private BufferedImage back;
	
	public boolean end = false;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		//Ship, Alien
		ship = new Ship(400, 300, 25, 25, 2);
		//alienOne = new Alien(10, 100, 30, 30, 1);
		//alienTwo = new Alien(500, 100, 30, 30, 0);
		horde = new AlienHorde(10);
		//ammo = new Ammo(ship.getX(), ship.getY(), 20);
		//horde.add(alienOne);
		shots = new Bullets();
	
		

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

   
	public void paint( Graphics window )

	{
		
		if (end == true) {
			return;
		}
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);

		shots.moveEmAll();
		shots.drawEmAll(graphToBack);
		ship.draw(graphToBack);
		//alienOne.draw(graphToBack);
		//alienTwo.draw(graphToBack);
		horde.moveEmAll();
		horde.drawEmAll(graphToBack);
		
		//add code to move Ship, Alien, etc.

		if(keys[0])
	    {
	      if (ship.getX()>=0) {
	        ship.move("LEFT");
	      }
	    }
	    if(keys[1])
	    {
	      if (ship.getX()+ship.getWidth()<=600) {
	        ship.move("RIGHT");
	      }
	    }
	    if(keys[2])
	    {
	      ship.move("UP");
	    }
	    if(keys[3])
	    {
	      if (ship.getY()+ship.getHeight()<=420) {
	        ship.move("DOWN");
	      }
	    }
	    if(keys[4])
	    {
	      ammo = new Ammo(ship.getX(), ship.getY(), 2);
	      shots.add(ammo);
	      shots.cleanEmUp();
	      //ammo.draw(graphToBack);
	      
	      }
	    
	    shots.moveEmAll();
	    
	    if(ammo!=null) {
	    	if(ammo.getY()>=0) {
	    		ammo.move("UP");
	    		ammo.draw(graphToBack);
	    	}
	    }
	    
	    horde.removeDeadOnes(shots.getList());
	    
//	    if (ammo != null && ammo.getX() >= alienOne.getX() && ammo.getX() <= alienOne.getX() + alienOne.getWidth()
//	    && ammo.getY() == alienOne.getY()+alienOne.getHeight()) {
//	    	alienOne = new Alien(0,0,0,0,0);
//	    
//	    }
	


		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
	    
//	    horde.drawEmAll(graphToBack);
//	    ship.draw(graphToBack);
//	    twoDGraph.drawImage(back, null,  0, 0);
	    
	    
		
		twoDGraph.drawImage(back, null, 0, 0);
		
		for (int i = 0; i < horde.getSize(); i++) {
			Alien alien = horde.get(i);
			if ((alien.getX() <= ship.getX() + ship.getWidth() && alien.getX() >= ship.getX())|| 
					(alien.getX() + alien.getWidth() >= ship.getX() && alien.getX() + alien.getWidth() <= ship.getX() + ship.getWidth())) {
				if (alien.getY() >= ship.getY() && alien.getY() <= ship.getY() + ship.getHeight() || 
						alien.getY() + alien.getHeight() <= ship.getY() + ship.getHeight() && alien.getY() + alien.getHeight() >= ship.getY()) {
					graphToBack.setColor(Color.red);
					graphToBack.fillRect(0,0,800,600);
					graphToBack.setColor(Color.white);
					graphToBack.drawString("Game Over", 300, 400);
					end = true;
				}	
			}
		}
		
		if (horde.getSize() == 0) {
			graphToBack.setColor(Color.green);
			graphToBack.fillRect(0,0,800,600);
			graphToBack.setColor(Color.white);
			graphToBack.drawString("YAS YOU WIN", 300, 400);
			end = true;
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
		
	}



	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}