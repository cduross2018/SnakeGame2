/* Snake Game
 * by Andre M. and Catherine D.
 * May 2016
 * C block
 */
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
public class Game {
	final static int x = 800, y = 800;
	public static boolean pause = false, caught = false;
	public static int randX, randY;
	public static void main(String[] args) {
		playGame();
	}
	//main method for the game to start
	public static void playGame(){
	if(!pause)
		{
		JFrame f = new JFrame();
		//JPanel p = new JPanel();
		//p.setBackground(Color.BLUE);
		KeyStroke snake = new KeyStroke();
		//Graphics g = f.getGraphics();
		f.add(snake);
		//f.getContentPane().setBackground(Color.BLUE);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(x, y);
		//snake.paintComponent(f);
		}
		else {
			System.out.println("pause");
		}
		
	
		/*while(!pause){
			Food nextFood = pickFood();
			pickPoint(nextFood, g);
			caught = false;
			while(!caught){
				if((int)snake.getVelx()==randX && (int)snake.getVely()==randY){
					caught = true;
				}
			}
		}*/
	}
	//picks a random food for the snake to get next
	public static Food pickFood(){
		BlueFood bFood = new BlueFood();
		RedFood rFood = new RedFood();
		GreenFood gFood = new GreenFood();
		PurpleFood pFood = new PurpleFood();
		Food[] foodList = {bFood, rFood, gFood, pFood};
		int pick = (int)(Math.random()*4)+1;
		return foodList[pick];
	}
	//picks where the next random food will be
	public static void pickPoint(Food f, Graphics g){
		randX = (int)(Math.random()*x)+1-200;
		randY = (int)(Math.random()*y)+1-200;
		f.draw(g, randX, randY);
	}
	//draws the snake
	public static void drawSnake(KeyStroke snake, Graphics g){
		g.setColor(Color.MAGENTA);
		g.fillRect(x, y, 20, snake.getSnakeSize());
	}
	 	         
}