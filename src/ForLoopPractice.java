import java.util.Scanner;

public class ForLoopPractice {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		
		
//		System.out.println("Enter a number");
//		int number = input.nextInt();
//		
//		
//		for (int count=0; count<=number; count++) {
//			System.out.print(count + " ");
//		}
//		System.out.println("\n I just counted to " + number);
//		
//		//Ask the user for a name.
//		//Display a count of all the letter a's in the name.
//		//How many a's in the name
//		
//		System.out.println("Enter a name");
//		String name = input.nextLine();
//		String nameLC=name.toLowerCase();
//		
//		int numberOfAs = 0;
//		for (int i=0; i < nameLC.length(); i++) {
//			if (nameLC.charAt(i) == 'a') {
//					numberOfAs++;
//					
//			}
//		}
//		System.out.println("You have " + numberOfAs + "A's in " + name + "!");
		
		//name backwards
		
//		System.out.println("Enter a name");
//		String name=input.nextLine();
//		
//		for (int i=name.length()-1; i>=0; i--) {
//			System.out.print(name.charAt(i));
//		}
		
		int min = Integer.MAX_VALUE;  // MAX VALUE is a constant value never going to change
		int max = Integer.MIN_VALUE;
		
		for (int i=1; i<=5; i++) {
			System.out.println("Enter an integer");
			int number = input.nextInt();
			
			if(number < min) {
				min = number;
			}
			if (number > max ) {
				max = number;
			}
		}
		
		System.out.println("The min number is " + min);
		System.out.println("The max number is " + max);
		
		
		
		

	}

}
