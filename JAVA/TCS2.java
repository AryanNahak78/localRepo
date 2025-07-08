package JAVA;

import java.util.Iterator;
import java.util.Scanner;

public class TCS2 {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int []x= new int[7];
System.out.println("Enter 7 nos");
for (int i = 0; i < x.length; i++) {
	x[i]= sc.nextInt();
}
System.out.println("Array is");
for (int i = 0; i < x.length; i++) {
	System.out.print(x[i]+" ");
}
System.out.println();
double sum=0;
for (int i = 0; i < x.length; i++) {
	sum+=x[i];
}
System.out.println("Sum is "+ sum);
double avg=sum/7;
System.out.println("avg is "+ avg); 
	}

}
