package neeraj.string;

public class LongestWordInParagraph {
	
	 public static void main(String[] args) {

	        String str = "My Name Is Neeraj Mewada I Am Java Full Stack Devloper";

	        String[] words = str.split(" ");

	        String longest = "";

	        for (String word : words) {
	        	
	            if (word.length() > longest.length()) {
	            	
	                longest = word;
	            }
	        }

	        System.out.println("longest word: " + longest);
	    }

}