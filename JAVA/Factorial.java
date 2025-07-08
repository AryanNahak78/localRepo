package JAVA;

public class Factorial {

	public static void main(String[] args) {
		int product=1;
		int n=5;
		
		for (int i = n; i>0 ; i--) {
			product*=i;
		}
		System.out.println(n+"! is "+product);
	}

}
