import java.awt.Color;
import java.util.*;

/* This food has color purple
 * changes the color of the snake
 * has point value 100
 */
public class PurpleFood extends Food{
	//constructor
	public PurpleFood(){
		super(Color.MAGENTA, 100);
	}
	//this will do nothing to the snake
	public ArrayList<KeyStroke> changeSnake(ArrayList<KeyStroke> mySnake){
		return mySnake;
	}
}
