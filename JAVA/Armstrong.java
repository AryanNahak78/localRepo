package JAVA;

import java.util.ArrayList;
import java.util.List;

public class Armstrong {

	public static void main(String[] args) {
		int x=153;
		int once=x%10;
		System.out.println(once);
		int y=x/10;
		int tens=y%10;
		System.out.println(tens);
		int hundreds=y/10;
		System.out.println(hundreds);
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(once);
		list.add(tens);
		list.add(hundreds);
		int sum=0;
		
		for (int i = 0; i < list.size(); i++) {
			int temp_sum=1;
			for (int j = 0; j < list.size(); j++) {
				temp_sum=temp_sum*list.get(i);
			}
			sum+=temp_sum;
		}
		System.out.println(sum);
		if (x==sum) {
			System.out.println(x+" is armstrong");
		}
		else
			System.out.println(x+" is not armstrong");
	}

}
