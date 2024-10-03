package ProgramsforNumbers;

import java.util.Scanner;

public class SumoFDigits {

	public static void main(String[] args) {
		int no = 0, a = 0;
		int sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number : ");
		no = scanner.nextInt();
		while(no>0) {
			int digit=no%10;
			sum=sum+digit;
			no=no/10;
		}
		System.out.println("Sum of digit are :"+sum);

	}

}
