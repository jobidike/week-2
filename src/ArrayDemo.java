import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) { //String args means a collection of arguments/statements
		
		
		Scanner input = new Scanner(System.in);
		int[] cupValues = new int[5]; //new means object  //5 number of objects in array
		//this array will always have 5 things and cant have less unless you declare it above
		
		
		
		cupValues[0] = 42;
		cupValues[1] = 86;
		cupValues[2] = 23;
		cupValues[3] = 8;
		cupValues[4] = 91;
		
		System.out.println(cupValues[0]);
		System.out.println(cupValues[1]);
		
		//data into the array
		for (int i=0; i<cupValues.length; i++) {
			System.out.println("Enter an integer");
			System.out.println(cupValues[i]);
		}
		//use a for loop to display all items in the array
		//another way
		for (int i=0; i<cupValues.length; i++) {
			cupValues[i]=input.nextInt();  
		}
		
		
		
		
		//initialize one way
		String[] giantWords1 = { "fee", "fie", "foe", "fum" };
		
		//initialize an array 2nd way  //best for user input
		String[] giantWords2 = new String[4];
		giantWords2[0] = "fee";
		giantWords2[1] = "fie";
		giantWords2[2] = "foe";
		giantWords2[3] = "fum";

	}

}
