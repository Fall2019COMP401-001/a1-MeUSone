package a1;

import java.util.ArrayList;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Your code follows here.
		int numberOfObjects=scan.nextInt();
		ArrayList allObject=new ArrayList();
		for(int a =0;a<numberOfObjects;a++) {
			allObject.add(scan.next());
			allObject.add(scan.nextDouble());
		}
		int numberOfCustomer=scan.nextInt();
		String[] customerInformation=new String[numberOfCustomer];
		double[] allCustomerAmount=new double[numberOfCustomer];
		for(int b=0;b<numberOfCustomer;b++) {
			String firstName=scan.next();
			String lastName=scan.next();
			int numberOfThings=scan.nextInt();
			double sum=0;
			for(int c=0;c<numberOfThings;c++) {
			int instant=scan.nextInt();
			int indexOfobject=allObject.indexOf(scan.next());
			double priceOfObject=(double) (allObject.get(indexOfobject+1));
			sum=sum+instant*priceOfObject;}
			allCustomerAmount[b]=sum;
			String totalSum=" ("+String.format("%.2f", sum)+")";
			customerInformation[b]=firstName+" "+lastName+totalSum;
		}
		System.out.println("Biggest: "+customerInformation[findValueMax(allCustomerAmount)]);
		System.out.println("Smallest: "+customerInformation[findValueMin(allCustomerAmount)]);
		System.out.println("Average: "+String.format("%.2f",average(allCustomerAmount)));
	}
		static int findValueMax(double[] vals){
			double valueMax=vals[0];
			int indexOfValueMax=0;
			for(int a=0;a<vals.length;a++) {
				if(valueMax<vals[a]) {
					valueMax=vals[a];
					indexOfValueMax=a;
				}
			}
			return indexOfValueMax;
}
		static int findValueMin(double[] vals){
			double valueMin=vals[0];
			int indexOfValueMin=0;
			for(int a=0;a<vals.length;a++) {
				if(valueMin>vals[a]) {
					valueMin=vals[a];
					indexOfValueMin=a;
				}
			}
			return indexOfValueMin;
}
		static double average(double[] vals) {
			double sum=0;
			for(int a=0;a<vals.length;a++) {
				sum+=vals[a];
			}
			return sum/vals.length;
		}
			}
	
