package JAVA;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("n is ");
		int n= sc.nextInt();
		int x[]= new int[n];
		System.out.println("elements are ");
		for (int i = 0; i < n; i++) {
			x[i]=sc.nextInt();
		}
		System.out.print("Array is ");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
}
		System.out.println();
		for (int i = 0; i < x.length; i++) {
			int count=0;
			for (int j = 0; j < x.length; j++) {
				if (x[i]==x[j]) {
					count++;
				}
			}
if (count==1) {
     System.out.println(x[i]+" is unique");	
}		
}
		
	}

}
