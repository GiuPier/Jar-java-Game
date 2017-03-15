import java.util.Random;
import java.util.Scanner;


public class Jar {
	
	private String itemName;
	private int maxNumber;
	private int ranNumber;
	private int guessNumber;
	private static final int MAX_TRY = 7;
	
	
	Scanner scanner = new Scanner(System.in);
	
	public Jar(){
		this.itemName = itemName;
		this.maxNumber = maxNumber;
	}
	
	public String getItemName(){
		return itemName;
	}
	
	public int getMaxNumber(){
		return maxNumber;
	}
	
	public int fill(){
		
		Random rand = new Random();
	    ranNumber = rand.nextInt(maxNumber) + 1;
	    return ranNumber;
	}
	
	
	public void readInput(){
		
		System.out.println("What type of item?");
		itemName = scanner.nextLine();
		System.out.printf("What is the maximum amount of  %s?",
							itemName);
		maxNumber = scanner.nextInt();
	}
	
	public void writeOutPut(){
		System.out.printf("item: %s %n", itemName);
		System.out.printf("max number: %d %n", maxNumber);
		
	}
	
	public void writePlayer(){
		System.out.printf("Your goal is to guess how many %s are in the jars.%n"
	                    + "Your guess shoul be between 1 and %d.%n",
							itemName,
							maxNumber);
		
	}
	
	public void applyGuess(){
		int tries = 0;
		do {
			System.out.printf("Enter a number: ");
			guessNumber = scanner.nextInt();
			tries ++;
			int remaingTries = MAX_TRY - tries;
			System.out.printf("You have only %d tryes left.%n",
								remaingTries);
			if(remaingTries == 0){
				System.out.printf("You are a looser. No more guesses times.%n The number was %d!",ranNumber);
				System.exit(0);
			}
      if(guessNumber < maxNumber && guessNumber > ranNumber){
      System.out.printf("Your number %d is more than the number of %s in the jar.%n",
                        guessNumber,
                        itemName);
    }else{
      System.out.printf("Your number %d is less than the number of %s in the jar.%n",
                        guessNumber,
                        itemName);
    }
		}while (guessNumber != ranNumber);
		if(guessNumber == ranNumber){
			System.out.printf("Congratulations you won.%n The number was %d.%n"
					+ "You guess the number of %s in %d times!", 
					ranNumber,
					itemName,
					tries);
		}
    
    
  }
}
