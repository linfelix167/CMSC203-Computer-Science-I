import java.util.Scanner;
import javax.swing.JOptionPane;

public class GameOfTwentyOne {

	public static void main(String[] args) {
		int computerPoint = 0;
		int playerPoint = 0;
		Dice obj = new Dice();
		
		
		System.out.println("\tA Game of Twenty-One");
		while(obj.again()){
			computerPoint += obj.getRollPoint();
			playerPoint += obj.getRollPoint();
			
			if(!obj.scoreLimit(playerPoint) && !obj.scoreLimit(computerPoint)){
				break;
			}
			
			System.out.println("Player point:"+playerPoint);
			
		}
		if (playerPoint == 0 && computerPoint == 0) {
			JOptionPane.showMessageDialog(null, "You need to roll dice!");
		} else {
			obj.result(playerPoint, computerPoint);
		}
		
		obj.whoWin(playerPoint, computerPoint);
		System.out.println("\nCreated by Ho Chien Lin");
}
}