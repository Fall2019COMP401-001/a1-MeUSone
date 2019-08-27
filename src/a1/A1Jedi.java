package a1;

import java.util.ArrayList;
import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int numberOfObjects=scan.nextInt();
		ArrayList allObject=new ArrayList();
		for(int a =0;a<numberOfObjects;a++) {
			allObject.add(scan.next());
			allObject.add(scan.nextDouble());
			allObject.add(0);
			allObject.add(0);
		}
		int numberOfCustomer=scan.nextInt();
		for(int b=0;b<numberOfCustomer;b++) {
			String firstName=scan.next();
			String lastName=scan.next();
			int numberOfThings=scan.nextInt();
			for(int c=0;c<numberOfThings;c++) {
				int instant=scan.nextInt();
				int indexOfobject=allObject.indexOf(scan.next());
				allObject.set(indexOfobject+2,(int) allObject.get(indexOfobject+2)+instant);
				allObject.set(indexOfobject+3,(int) allObject.get(indexOfobject+3)+1);
				}}
		for(int c=2;c<allObject.size();c+=4) {
			if((int)allObject.get(c+1)==0) {
				System.out.println("No customers bought "+(String)allObject.get(c-2));}
			else
				System.out.println(allObject.get(c+1)+" customers bought "+allObject.get(c)+" "+allObject.get(c-2));
			}
		}
  }

