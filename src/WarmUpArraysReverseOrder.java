import java.util.Scanner;

public class WarmUpArraysReverseOrder {

	public static void main(String[] args) {
		//Ask the user for their 5 favorite bands/musicians...store these in an array. 
		//Display the results in reverse order of how they were entered by the user.
		
		Scanner input = new Scanner(System.in);
		String[] musicians = new String [5];
		
		System.out.println("Enter your 5 favorite musicians");
		for (int i=0; i< musicians.length; i++) {   //
			System.out.println("Musician " + (i+1) + ": ");
			musicians[i] = input.nextLine();
	}
		System.out.println("Your musicians in reverse order are: ");
		for (int i = musicians.length-1; i >=0; i--) {  //length counting the number of things in the index
			System.out.println("musicians " + (i+1) + " is: " + musicians[i]); //reference the number of bands
		}
}
}