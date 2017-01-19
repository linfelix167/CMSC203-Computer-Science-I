import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * CMSC203 Project 2B A Game of Twenty One
 * Dice class will get the roll points, determine point limit, and determine player
 * or computer win the game
 * 
 * @author Ho Chien, Lin
 *
 */
public class Dice {
	private int point;
	
	/**
	 * Constructor call the roll() method
	 */
	public Dice(){
		roll();
	}
	
	/**
	 * roll method generate dice value
	 */
	public void roll(){
		point = (int)(Math.random()*6)+1;
	}
	
	/**
	 * Get roll point
	 * @return point
	 */
	public int getPoint() {
		return point;
	}
	
	/**
	 * Get the roll point combine by two dices
	 * @return total roll point
	 */
	public int getRollPoint(){
		
		int firstRoll = getPoint();
		roll();
		int secondRoll = getPoint();
		
		return firstRoll + secondRoll;
	}
	/**
	 * This method will make sure the score reaches limit or not
	 * @param b player or computer point
	 * @return false if score larger than 21
	 */
	public boolean scoreLimit(int b){
		if(b > 21){
			return false;
		}
		else{
			return true;
		}
	}
	
	/**
	 * This method asks player want to continue to roll or not
	 * @return yes if player want to roll again
	 */
	public boolean again(){
		
		String str = JOptionPane.showInputDialog("Roll dice?(yes/no)");
		if(str.equalsIgnoreCase("yes")){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * This method will display player's and computer's total point
	 * @param player 
	 * @param computer
	 */	
	public void result(int player, int computer){
	    JOptionPane.showMessageDialog(null, "-----Result-----"+"\nPlayer point:"+player+"\tComputer point:"+computer);
		System.out.println("-----Result-----");
		System.out.println("Player point:"+player);
		System.out.println("Computer point:"+computer);
	}
	
	/**
	 * This method will determine who win the game
	 * @param player
	 * @param computer
	 */
	
	public void whoWin(int player, int computer){
		if(player > computer && scoreLimit(player)){
			System.out.println("You win!");
		}
		else if(scoreLimit(player) && !scoreLimit(computer)){
			System.out.println("You win!");
		}
		else if(player == 21 && computer != 21){
			System.out.println("You win!");
		}
		else if(player == computer){
			System.out.println("Tie!");
		}
		else if(!scoreLimit(player) && !scoreLimit(computer)){
			System.out.println("No winner!");
		}
		else{
			System.out.println("You lose!");
		}
	}
	
	
	
	
}
