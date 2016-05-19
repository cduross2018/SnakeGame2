/*
 * Snake Game: food
 * This gives the main components 
 * of what each food needs
 */
import java.awt.*;
import java.util.*;

public abstract class Food {
	//sets the food to a specific color
	private Color myColor;
	//gives each food a specified point value
	private int pointValue;
	
	//constructor
	public Food(Color newColor, int value){
		myColor = newColor;
		pointValue = value;
	}
	//gives a command to the snake
	abstract ArrayList<KeyStroke> changeSnake(ArrayList<KeyStroke> mySnake);
	
	//gives the food the specified size and shape
	public void draw(Graphics g, int x, int y){
		g.setColor(myColor);
		g.fillRect(x, y, 5, 5);
	}
	
	//adds a food length cube to the end of the snake
	public int ateFood(){
		return pointValue;
	}
}