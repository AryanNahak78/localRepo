package JAVA;

public class TCS1 {

static	int x;  //no. of 4wheeler
	public static void main(String[] args) {
int v=200;
int w= 540;

int FW= (w-2*v)/2;
int TW= v-FW;
System.out.println("no. of 4wheelers are "+ FW);
System.out.println("no. of 2wheelers are "+ TW);

	}
}
