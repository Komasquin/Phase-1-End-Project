package com.LockedMe;
import java.util.*;
public class Model {
	
	static SortedMap<String, String> files = new TreeMap<String, String>(new Comparator<String>() { 
			public int compare(String a, String b) { 
        		return a.compareToIgnoreCase(b); 
        	} 
    	}
	);//end of 'TreeMap' callback
	
		public String addFile(String key, String file) {
			if(files.containsKey(key)) {
				return "\nFailed to add file to direcory!\n";
			}else {
				files.put(key, file);
				return "\nFile added to directory successfully.\n";
			}//end of 'if Statement'
		}//end of method 'addFile'
		
		public String deleteFile(String key) {
			if(files.containsKey(key)) {
				files.remove(key);
				return "\nFile has been removed.\n";
			}else {
				return "\nFile Not Found!\n"; 
			}//end of 'if statement'
		}//end of method 'deleteFile'
		
		public String searchFile(String key) {
			if(files.containsKey(key)) {
				return "\nFile has been found. " + "\nFile: " + key + "\nContains: " + files.get(key) + "\n";
			}else {
				return "\nFile Not Found!"; 
			}//end of 'if statement'
		}//end of method 'searchFile'
		
}
