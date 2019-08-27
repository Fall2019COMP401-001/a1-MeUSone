package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int numberOfCustomer = scan.nextInt();
		String[] customInformation= new String[numberOfCustomer];
		for(int a =0;a<numberOfCustomer;a++) {
			String firstName=scan.next().substring(0,1)+". ";
			String lastName=scan.next();
			int numberOfThings=scan.nextInt();
			double sum=0;
			for(int b=0;b<numberOfThings;b++) {
			int instant=scan.nextInt();
			String shiftString=scan.next();
			sum=sum+instant*scan.nextDouble();}
			customInformation[a]=firstName+lastName+": "+String.format("%.2f", sum);
		}
		for(int c=0;c<numberOfCustomer;c++) {
		System.out.println(customInformation[c]);
		}
	}
}
