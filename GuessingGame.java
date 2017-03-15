import java.util.Random;
import java.util.Scanner;


public class GuessingGame {
	public static void main (String[]args){
		
		System.out.printf("ADMINISTRATOR SETUP %n");
		System.out.printf("=================== %n");
    String itemName = null;
    int maxNumber = 0;
		
		Jar jar = new Jar(itemName,maxNumber);
		
		jar.readInput();
		
		
		System.out.printf("PLAYER %n");
		System.out.printf("=================== %n");
		
		jar.writePlayer();
		jar.fill();
		
		jar.applyGuess();
		
		
		
		
	}

}
