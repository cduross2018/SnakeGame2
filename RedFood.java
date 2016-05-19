/* This food has color red
 * Reverses the keystrokes of the game
 * has point value 200
 */
import java.awt.*;
import java.util.*;
public class RedFood extends Food{
	//constructor: goes to super class
	public RedFood(){
		super(Color.RED, 200);
	}
	//this will make the snake
	public ArrayList<KeyStroke> changeSnake(ArrayList<KeyStroke> mySnake){
		for(int i=0; i<mySnake.size(); i++){
			mySnake.get(i).setChange(-1);
		}
		return mySnake;
	}
}
