package JAVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class demo1 {

	public static void main(String[] args) {
		String a="abcdefbcaghi";
		int x=0;

		List<String> list=new ArrayList<String>();
		for (int i = 0; i < a.length(); i++) {
			String add="";
			for (int j = 0; j < 3; j++) {
				add+=a.charAt(x);
				x++;
			}
			list.add(add);
			if (list.size()==a.length()/3) {
				break;
			}
		}
		Set<String> set=new TreeSet<String>();
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			char[]arr=list.get(i).toCharArray();
			Arrays.sort(arr);
			set.add(new String(arr));
		}
		System.out.println(set);
	}
}
