package com.LockedMe;

import java.util.Scanner;

public class Menu {
	static Scanner in = new Scanner(System.in);
	static Model mObj = new Model();
	static Features fObj = new Features();
	
	public static void mainMenu() {
		mainMenuPrivate();
	}//end of method 'mainMenu'
	
	private static void mainMenuPrivate() {
		int val = 0;
		while(val != 3) {
			val = menu1();
			switch(val) {
			case 1: System.out.println("\n" + Model.files.toString() + "\n");
				break;
			case 2: menu2();
				break;
			case 3: System.out.println("Closing application...");
				break;
			default: System.out.println("Closing application...");
				break;
			}//end of 'switch case'
		}//end of 'while loop'
	}//end of 'maniMenu'
	
	public static int menu1() {
		return menu1Private();
	}//end of 'menu1' method
	
	private static int menu1Private() {
		int value = 0;
			try {
				System.out.print("Welcome to LockedMe.com\nCreated by Lockers Pvt. Ltd.\n------------------------------"
						+ "\n\n1: Display the current file menu.\n2: Display the "
						+ "details of the user interface.\n3: Close the operation.\n");
				value = in.nextInt();
			}catch(Exception ex){
				System.out.println("\n\nInvalid input please enter [1, 2 or 3]. Try again!\n\n");
				in.next();
			}//end of 'try-catch'
		return value;
	}//end of 'menu1'
	
	public static void menu2() {
		menu2Private();
	}//end of /menu2' method
	
	public static void menu2Private() {
		int value = 0;
		while(value != 4) {
			try {
				System.out.print("\n1: Add a file.\n2: Delete a file.\n3: Search a file.\n4: Back to main menu.\n");
				value = in.nextInt();
			}catch(Exception ex){
				System.out.println("\\n\\nInvalid input please enter [1, 2, 3 or 4]. Try again!\\n\\n");
				in.next();
				value = 5;
			}//end of 'try-catch'
			switch(value) {
			case 1: System.out.print(fObj.add() + "\n");
				break;
			case 2: System.out.print(fObj.delete() + "\n");
				break;
			case 3: System.out.print(fObj.search() + "\n");
				break;
			case 4: mainMenu();
				break;
			case 5: menu2();
			break;
			}//end of 'switch case'
		}//end of 'while loop'
	}//end of 'menu2'
}
