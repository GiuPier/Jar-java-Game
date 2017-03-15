import java.util.Random;
import java.util.Scanner;


public class GuessingGame {
	public static void main (String[]args){
		
		
    String itemName = null;
    int maxNumber = 0;
		
		Jar jar = new Jar(itemName,maxNumber);
		
		jar.readInput();
		
		
		
		
		jar.writePlayer();
		jar.fill();
		
		jar.applyGuess();
		
		
		
		
	}

}
