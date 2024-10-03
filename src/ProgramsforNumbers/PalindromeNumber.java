package ProgramsforNumbers;

import java.util.Scanner;

public class PalindromeNumber {

          public static boolean isPalindrome(int num) {
        	  int originalNumber=num;
        	  int reverseNumber=0;
        	  while(num!=0) {
        		  int remain=num%10;
        		  reverseNumber=reverseNumber*10+remain;
        		  num=num/10;
        	  }
        	  return originalNumber==reverseNumber;
          }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number :");
		int nuber=sc.nextInt();
		
		if(isPalindrome(nuber)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not Palindrome");
		}
		
	}
}
