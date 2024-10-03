package ProgramsforNumbers;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Fibonacci Series");
		int n=0;
		int n1=1;
		int n2;
		System.out.print(n+" ,"+n1+" ,");
		for(int i=0;i<20;i++) {
			n2=n+n1;
			System.out.print(n2+" ,");
			n=n1;
			n1=n2;
			
		}

	}

}
