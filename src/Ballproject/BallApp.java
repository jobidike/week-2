package Ballproject;
import java.util.Scanner;

public class BallApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Ball ball1= new Ball ("brown", "football");
		
		
		System.out.println(ball1.getColor()); //color of ball 1
		
		System.out.println(ball1.getType());  //type of ball 2
		
		System.out.println(ball1.kicked(true));
		
		
		
			String choice;
			System.out.println("Press 1 to kick the ball");
			System.out.println("Press 2 to check what color the ball is");
			System.out.println("Press 3 to exit");
			choice=input.nextLine();
			
			if (choice.equals("1")) {
				System.out.println(ball1.kicked(true));
				
			}else {
				System.out.println(ball1.getColor());
			}
			
			
	}
}
		
		
		
		
		
		
		
		
		




//menu
//press 1 to kick the ball
//2 to check what color the ball is
//3 to exit
	
	
