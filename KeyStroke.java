/* Gives the code the ability to use
 * the arrow keys to move the snake
 *  
 */
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
public class KeyStroke extends JPanel implements ActionListener, KeyListener {
	//variables to move each key a specific amount
	private int x = 359, y = 359; 
	private double velx = 0, vely = 0;
	private int snakeSize = 20;
	private int change = 1;
	Timer t = new Timer(10, this);
	//constructor
	public KeyStroke(){
		t.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}
	//draws the snake object
	public void paintComponent(JFrame f){
		Graphics g = f.getGraphics();
		super.paintComponent(g);
		g.setColor(Color.GREEN);
		g.fillRect(x, y, 20, snakeSize);
	}
	//changes the snake size for when the snake eats the blue food
	public void setSnakeSize(int snakeSize) {
		this.snakeSize = snakeSize+10;
	}
	// sets the x and y values to the new value
	public void actionPerformed(ActionEvent e){
		repaint();
		x += velx;
		y += vely;
	}
	//changes the direction that the snake is moving in
	public void up(){
		velx = 0;
		vely = -3*change;
	}
	public void down(){
		velx = 0;
		vely = 3*change;
	}
	public void left(){
		velx = -3*change;
		vely = 0;
	}
	public void right(){
		velx = 3*change;
		vely = 0;
	}
	public void space(){
		velx=change*0;
		vely=change*0;
	}
	//key is pressed then moves the snake that way
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if(code==KeyEvent.VK_UP){
			up();
		}
		if(code==KeyEvent.VK_DOWN){
			down();
		}
		if(code==KeyEvent.VK_LEFT){
			left();
		}
		if(code==KeyEvent.VK_RIGHT){
			right();
		}	
		if(code==KeyEvent.VK_SPACE){}
	}
			//sets the change value to switch the direction of the keys
	public void setChange(int change) {
		this.change = change;
	}
	//mandatory methods, but not used or needed
	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}
	//getters for some variables
	public double getVelx() {
		return velx;
	}
	public double getVely() {
		return vely;
	}
	public int getSnakeSize() {
		return snakeSize+10;
		
	}
}
