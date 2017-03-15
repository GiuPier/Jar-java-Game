import java.util.Random;
import java.util.Scanner;


public class Jar {
	
	private String itemN;
	private int maxN;
	private int ranNumber;
	private int guessNumber;
	private static final int MAX_TRY = 7;
	
	
	Scanner scanner = new Scanner(System.in);
	
	public Jar(String itemN, int maxN){
		this.itemN = itemN;
		this.maxN = maxN;
	}
	
	public String getItemName(){
		return itemN;
	}
	
	public int getMaxNumber(){
		return maxN;
	}
	
	public int fill(){
		
		Random rand = new Random();
	    ranNumber = rand.nextInt(maxN);
	    return ranNumber;
	}
	
	
	public void readInput(){
		
		System.out.println("What type of item?");
		itemN = scanner.nextLine();
		System.out.printf("What is the maximum amount of  %s?%n",
							itemN);
		maxN = scanner.nextInt();
	}
	
	public void writePlayer(){
		System.out.printf("How many %s are in the jars?%n"
	                    + "Pick a number between 1 and %d.%n",
							itemN,
							maxN);
		
	}
	
	public void applyGuess(){
		int tries = 0;
		do {
			System.out.printf("Enter a number: ");
			guessNumber = scanner.nextInt();
			++tries;
			int remaingTries = MAX_TRY - tries;
			System.out.printf("You have only %d tryes left.%n",
								remaingTries);
			if(remaingTries == 0){
				System.out.printf("You are a looser. No more guesses times.%n The number was %d!",ranNumber);
				System.exit(0);
      }
      if(guessNumber < maxN && guessNumber > ranNumber){
      System.out.printf("Your number %d is more than the number of %s in the jar.%n",
                        guessNumber,
                        itemN);
    }else{
      System.out.printf("Your number %d is less than the number of %s in the jar.%n",
                        guessNumber,
                        itemN);
    }
		}while (guessNumber != ranNumber);
		if(guessNumber == ranNumber){
			System.out.printf("Congratulations you won.%n"
					+ "You got it in %d attempts!",tries);
		} 
  }
}
