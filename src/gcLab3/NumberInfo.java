package gcLab3;
import java.util.Scanner;

public class NumberInfo {

	public static void main(String[] args) {
		String name;
		int userInput;
		String y = "y";
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		name = scn.next();
		
		while (y.equals("y")) {
		
		System.out.println(name + ", please enter an integer between 1 and 100: ");
		userInput = scn.nextInt();
		
		if (userInput < 1 || userInput > 100) {
			System.out.println("Invalid input, please enter an integer between 1 and 100: ");
			userInput = scn.nextInt();
		} else if (userInput % 2 == 0) { 
			if (userInput < 25 && userInput >= 2) {
				System.out.println("Even and less than 25.");
				System.out.println("Continue? (y/n) ");
				y = scn.next();
			} else if (userInput <= 60 && userInput >= 26) {
				System.out.println("Even.");
				System.out.println("Continue? (y/n) ");
				y = scn.next();
			} else if (userInput > 60) {
				System.out.println(userInput + " Even.");
				System.out.println("Continue? (y/n) ");
				y = scn.next();
			}
			
		} else if (userInput % 2 != 0) {
			if (userInput > 60) {
				System.out.println(userInput + " Odd and over 60.");
				System.out.println("Continue? (y/n) ");
				y = scn.next();
			} else {
				System.out.println(userInput + " Odd.");
				System.out.println("Continue? (y/n) ");
				y = scn.next();
			}
		}
		
	}
		scn.close();	
	}


}
