package ProgramsforNumbers;

import java.util.Scanner;

public class Odd_or_Even {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the input :");
		int number = sc.nextInt();
		
		if(number % 2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}

	}

}
