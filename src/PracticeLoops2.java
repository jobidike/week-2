import java.util.Scanner;

public class PracticeLoops2 {

	public static void main(String[] args) {  //countEvens
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter a number");
		int number = input.nextInt();
		
		int index = 1;
		int count = 0;
		
		while (index <= number) {
			if(index % 2== 0) {
				count ++;
				System.out.println(index + " ");
				count++;
			}
			index++;
		}
		System.out.println("I just found " + count + " even numbers" );
		
	}
		
		//User name revisited in practice loops problems week 2	
//		System.out.println("Enter a username of at least 4 character in length:");
//		String name=input.nextLine();
//		
//		while
//		System.out.println("Not long enough");

	}


