package JAVA;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter max limit");
		int max=sc.nextInt();
		
		System.out.println("Enter min limit");
		int min=sc.nextInt();
		
		while (max>min) {
			int div=1;
			int count=0;
			
			for (int i = div; i <=min; i++) {
				if (min%div==0) {
					count++;
				}
				div++;
			}
		if (count==2) {
			System.out.print(" ");
			System.out.println(min);
		}
		min++;
		}
	}
}
