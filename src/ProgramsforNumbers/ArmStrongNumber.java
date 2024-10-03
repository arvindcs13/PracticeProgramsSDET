package ProgramsforNumbers;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int input=sc.nextInt();
		int arm=0;
		int remainder;
		int a=input;
		
		while(input>0) {
			remainder= input%10;
			arm=arm+ remainder*remainder*remainder;
			input=input/10;
			
		}
		if(arm==a) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Non Armstrong number");
		}

	}

}
