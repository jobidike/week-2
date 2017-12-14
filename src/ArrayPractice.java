import java.util.Scanner;       //Array slides week2 wednesday

public class ArrayPractice {     //Dont use arrays for friday project.

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		
//		String[] name = { "Will", "Sam", "Mike"};
//		double[] gpa = {4.0, 3.5, 3.0,2.5,1.0};
//		String[] vacSpots = {"Miami", "Orlando","Oakland", "San Diego"};
//		
//		for (int i=0; i<name.length; i++) {
//			System.out.println(name[i]);
//		}
//		
//		System.out.println(" ");
//		
//		for (int i=0; i<gpa.length; i++) {
//			System.out.println(gpa[i]);
//		}
//		
////		System.out.println(vacation[0] + ", " + vacation[3]);   another way
//		System.out.println(vacation[0] + " ," + vacation[vacation.length-1]);
		
		
		
//		//search vacation spots array and give feedback on if Pittsburgh is in our collection or not
		
//		boolean isInCollection = false;
//		
//		for (int i = 0; i < vacSpots.length; i++) {
//			if (vacSpots[i].contains("Pittsburgh")){
//				isInCollection = true;
//			}
//		}
//		
//		if(isInCollection == true) {
//			System.out.println("Go Steelers!");
//		}else {
//			System.out.println("Go Browns!");
//		}
		
		
		//array of characters
//		System.out.println("Enter your name");
//		String myName = input.nextLine();
//		System.out.println("Enter a letter to find");
//		String letter = input.nextLine();
//		char[] letters = myName.toCharArray();
//
//		System.out.println("The first letter of my name is " +
//		letters[0]);
//		System.out.println("The last letter of my name is " +
//		letters[letters.length - 1]);
//		System.out.println("Number of letters in name " + letters.length);
//		
//
//		System.out.println(myName.indexOf(letter)); // prints "0"
//		
//		
//		
//		
////		String source = "this, that, the other";
////		String[] elements = source.split(", ");
////
////		System.out.println(elements[0]); // prints "this"
////		System.out.println(elements[1]); // prints "that"
////		System.out.println(elements[2]); // prints "the other"
//		
//		
//		
//		String source = "my-file-name"; // myFileName
//		String[] elements = source.split("-");
//
//		System.out.println(elements[0]); // prints "this"
//		System.out.println(elements[1]); // prints "that"
//		System.out.println(elements[2]); // prints "the other"
//		
//		System.out.println(elements[0] +
//				elements[1].substring(0,1).toUpperCase() +
//				elements[1].substring(1).toLowerCase() +
//				elements[2].substring(0,1).toUpperCase() +
//				elements[2].substring(1).toLowerCase()
//			);
//		
		
		//Work it slide-arrays  //first letter of 4 names
//		String[] name = new String[4];
//		
//		//get input
//				for(int i=0; i<name.length; i++) {
//					System.out.println("Enter a name");
//					name[i]= input.nextLine();
//				}
//				//show output
//				for (int i=0; i<name.length; i++) {
//					System.out.print(name[i].charAt(0));
//				}
		
		System.out.println("Enter a word");
		
		String word=input.nextLine();
		
		System.out.println("Enter a letter");
		String letter = input.nextLine();
		
		if (word.indexOf(letter) < 0) { 
			System.out.println("so sorry");
			}else {
				System.out.println("yep its got one of those!");
			}
		input.close();
				
				
		}
	}
	

		
	
		
		
	
		

	


