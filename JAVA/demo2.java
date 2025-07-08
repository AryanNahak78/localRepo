package JAVA;

 class parent {
	public  void parent() {
		int x=10;
		System.out.println(x);
	}
}
 
 class child extends parent{
	 public  void parent() {
		 int x=20;
		 System.out.println("overrided "+x);
	 }
 }
public class demo2 {
	public static void main(String[] args) {
	//	parent p=new child();
		new child().parent();
}

}
