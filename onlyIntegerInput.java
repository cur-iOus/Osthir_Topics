package osthirTopics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int myInteger;
		
		System.out.print("Enter an Integer: ");
		
		myInteger = getIntInput();
		
		System.out.print("Done!\nValid Integer: "+myInteger);
		
	}
	
	private static int getIntInput() {
		int choice = 0;
		
		while (choice <= 0) {
			try {
				choice = scan.nextInt();
				if (choice <= 0) {
					throw new InputMismatchException();
				}
				scan.nextLine();
			} catch (InputMismatchException e) {
				scan.nextLine();
				System.out.print("ERROR!\nEnter a valid Integer: ");
			}
		}
		return choice;
	}

}
