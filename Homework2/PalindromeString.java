package Homework2;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		String s, reverse = "";
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter a string to check if it is a palindrome");
	      s = in.nextLine();
	 
	      int length = s.length();
	      System.out.println(length);
	     
	      for ( int i = length - 1; i >= 0; i-- ){
	         reverse = reverse + s.charAt(i);
	      }
	      System.out.println(reverse);
	      
	      if (s.equals(reverse))
	         System.out.println("Entered string is a palindrome.");
	      else
	         System.out.println("Entered string is not a palindrome.");
	 in.close();
	}

}
