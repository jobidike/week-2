import java.util.Scanner;

public class ForFun1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int number = 0;
		
		System.out.println("Please enter a number?");    //loop practice
		number = input.nextInt();
		
		while (number < 11) {
		System.out.println(number);
		number++;
		}
		System.out.println("Yay, I counted to 10!");
		
		String name;
		int count = 3;
		char a;
		
		System.out.println("Enter a name:");
		name=input.nextLine();
		
		
		
		

	}

}
