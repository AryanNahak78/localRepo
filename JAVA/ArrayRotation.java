package JAVA;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x[]= {10,20,30,40,50,60,70};
		int y[]= new int[x.length];
		System.out.println("rotation no. ");
		int a=sc.nextInt()-1;
		System.out.println("real array is ");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
		for (int i = x.length-1; i >=0; i--) {
			for (int j = 0; j < y.length; j++) {
				y[j]=x[i];
				i--;
			}
		}
//		for (int i = 0; i < y.length; i++) {
//			System.out.print(y[i]+" ");
//		}
	//	System.out.println();
		int z[]= new int[y.length];
		for (int i = 0; i< a; ) {
			for (int j = a; j >=0; j--) {
				z[j]=y[i];
				i++;
			}
		}
		for (int i = y.length-1; i>a; ) {
			for (int j = a+1; j < z.length; j++) {
				z[j]=y[i];
				i--;
			}
		}
		for (int i = 0; i < z.length; i++) {
			System.out.print(z[i]+" ");
		}
	}
			}
		

