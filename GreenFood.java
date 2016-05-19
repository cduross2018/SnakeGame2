import java.awt.Color;
import java.util.*;
/* This food has color green
 * This does nothing to the snake; normal food
 * has point value 100
 */
public class GreenFood extends Food{
	//constructor
	public GreenFood(){
		super(Color.GREEN, 100);
	}
	//this will do nothing to the snake
	public ArrayList<KeyStroke> changeSnake(ArrayList<KeyStroke> mySnake){
		return mySnake;
	}
}
