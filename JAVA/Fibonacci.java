package JAVA;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		while (true) {
			int sum=list.getLast()+list.get(list.size()-2);
			list.add(sum);
			System.out.println(list);
			if (list.size()==8) {
				break;
			}
		}
	}
}
