import java.util.Random;
import java.util.Scanner;

public class PracticeLoops {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//If I wanted to ask the user for a message, then display it five times, how would I do this?
				//If I wanted to pick a number, then ask the user to guess it, how might I do this?
				//What if I wanted my program to pick a random number?
	
		System.out.println("Please enter a message");
		String message=input.nextLine();
		
		int count = 0;
		while (count < 5) {
			System.out.println(message + " " + count);
			count++;
		}
		
		
		System.out.println("Please enter your PIN number?");
		int Pin=input.nextInt();
		
		int number= 0;
		while(number == 1234) {
			
		}
		
		
	}

}
