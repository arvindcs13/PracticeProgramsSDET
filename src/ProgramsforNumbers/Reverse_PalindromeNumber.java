package ProgramsforNumbers;

import java.util.Scanner;

public class Reverse_PalindromeNumber {

	public static void main(String[] args) {
		int no; 
		int rev=0;
		int r; 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number : ");
		no = scanner.nextInt();
//		a=no;
		while(no>0) {
			r=no%10;
			rev=rev*10+r;
			no=no/10;
		}
		
		System.out.println(rev);
	}
}
		

