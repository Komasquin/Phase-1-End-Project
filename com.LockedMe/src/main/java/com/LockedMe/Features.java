package com.LockedMe;
import java.util.Scanner;

public class Features {
	static Scanner in = new Scanner(System.in);
	static Model mObj = new Model();

	public String delete() {
		String key;
		System.out.println("Enter the name of the file you would like to delete.");
		key = in.next();
		return mObj.deleteFile(key);
	}//end of 'delete' method
	
	public String search() {
		String key;	
		System.out.println("Enter the name of the file you would like to search.");
		key = in.next();
		return mObj.searchFile(key);
	}//end of 'search' method
	
	public String add() {
		String fileName;
		String fileContent;
		System.out.println("Enter the name of the file you would like to add.");
		fileName = in.next();
		System.out.println("Enter file contents.");
		fileContent = in.next();
		fileContent += in.nextLine();	
		return mObj.addFile(fileName, fileContent);
	}//end of 'add()' method
}
