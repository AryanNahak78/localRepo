package JAVA;

public class Palindrom {

	public static void main(String[] args) {
		String original="madam";
		String reverse="madam";
		
		String check="";
		
		for (int i = original.length()-1; i>=0; i--) {
			check+= original.charAt(i);
		}
		if (check.equals(reverse)) {
			System.out.println(original + " is palindrom");
		}
		else
			System.out.println(original + " is not palindrom");
	}

}
