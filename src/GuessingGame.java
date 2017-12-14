import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		
		int randNumber = generator.nextInt(10) + 1;  //the (10)means 0-9 and + 1 makes it 1-10.
		
		System.out.println("Enter a # from 1-10");
		int guess = input.nextInt();
		
		int count =1;
		
		while(count <3 && guess != randNumber) {
			
			if(guess < randNumber) {
				System.out.println("Too low, try again");
				guess = input.nextInt();
			}else {
				System.out.println("Too high, try again");
				guess = input.nextInt();
			}
			count++;
		}
		if(guess!= randNumber) {
			System.out.println("You are out of tries! You LOSE!");
		}else {
			
		System.out.println("You guessed it!");
		}
		input.close();
	}
}
