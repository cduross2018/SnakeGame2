/* This food has color blue
 * Makes the snake wider
 * has point value 200
 */
import java.awt.Color;
import java.util.*;
public class BlueFood extends Food {
	public BlueFood(){
		super(Color.BLUE, 200);
	}
	//this will make the snake
	public ArrayList<KeyStroke> changeSnake(ArrayList<KeyStroke> mySnake){
		for(int i=0; i<mySnake.size(); i++){
			mySnake.get(i).setSnakeSize(35);
		}
		return mySnake;
	}
}
