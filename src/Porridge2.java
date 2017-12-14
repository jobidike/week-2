import java.util.Scanner;

public class Porridge2 {
	
	public static void main(String[] args) {	
	
	Scanner input = new Scanner(System.in);   //while loops
	String porridgeTemperature;
	
	
	  System.out.println("Please specify porridge temperature.");
	  System.out.println("Type \"help\" to list options.");
	  porridgeTemperature = input.nextLine();
	  
	  while(porridgeTemperature.equals("help")); {
	

	  
	  if(porridgeTemperature.equals("help")) {
		  System.out.println("Options: too hot, too cold, just right");
	  }
	    
	    System.out.println("Please specify porridge temperature.");
		System.out.println("Type \"help\" to list options.");
		porridgeTemperature = input.nextLine();
		
	  }
	  
	  
	  
	}
}
	  

