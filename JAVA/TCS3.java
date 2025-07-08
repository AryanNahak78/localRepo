package JAVA;

public class TCS3 {

	public static void main(String[] args) {
		int x=31;
		int y=1;
		while (x>=y) {
			int count=0;
			int z=1;
			while (y>=z) {
				if (y%z==0) {
					count++;
				}
				z++;
			}
			if (count==2) {
				System.out.print(y+" ");	}
			y++;
}
	}
}
