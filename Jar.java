import java.util.Random;
import java.util.Scanner;


public class Jar {
	
	private String itemN;
	private int maxN;
	private int ranNumber;
	private int guessNumber;
	
	
	
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
		while (guessNumber != ranNumber){
			System.out.printf("Enter a number: ");
			guessNumber = scanner.nextInt();
			++tries;
			
			
      if(guessNumber < maxN && guessNumber > ranNumber){
      System.out.printf("Your guess is too high.%n",
                        guessNumber,
                        itemN);
    }else{
      System.out.printf("Your guess is too low.%n",
                        guessNumber,
                        itemN);
      }
      if(guessNumber == ranNumber){
    System.out.printf("You got it in %d attempts(s).%n",
								tries);
      }
     
		} 
  }
}
