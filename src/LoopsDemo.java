import java.util.Scanner;

public class LoopsDemo {
	
	public static void main(String[] args) {
		
		int count = 1;
		while (count <= 10) {
			System.out.println("The count is " + count);
			count ++; //remember, this increases the value of count by 1 //while loop
		}
		System.out.println("After loop shuts off count = " + count);  
		
		
		Scanner input = new Scanner(System.in);  //do while loop
		String porridgeTemperature;
		do {
		  System.out.println("Please specify porridge temperature.");
		  System.out.println("Type \"help\" to list options.");
		  porridgeTemperature = input.nextLine();
		  
		  if(porridgeTemperature.equals("help")) {
		    System.out.println("Options: too hot, too cold, just right");
		  }
		  
		} while(porridgeTemperature.equals("help"));
		input.close();
		System.out.println("Program continues...");
	}
}
