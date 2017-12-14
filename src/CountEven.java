import java.util.Scanner;
public class CountEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

				Scanner input = new Scanner(System.in);

				System.out.println("Enter a number");
				int number = input.nextInt();

				int index = 1;
				int count = 0;

				while (index <= number) {
					if (index % 2 == 0) {
						System.out.print(index + " ");
						count++;

					}
					index++;
				}
				System.out.println("I just found " + count + " even numbers");
			}
//n%2==0 will be true if n is even and false if n is odd
		

	}


