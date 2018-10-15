package Oct_15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_Ex {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for (int i = 10; i > 0; i--) list.add(i);
		for (int num : list) {
			System.out.println(num);
		}
		Collections.sort(list);
		for (int num : list) {
			System.out.println(num);
		}
		addArray(new String[]{ "ABC", "EDF" }, new String[]{ "GHI", "JKL" });
	}
	public static List<String> addArray(String[] arr1, String[] arr2) {
		List<String> list = new ArrayList<String>();
		list.toArray(arr1);
		for (String str : list) {
			System.out.println(str);
		}
		list.toArray(arr2);
		for (String str : list) {
			System.out.println(str);
		}
		
		return list;
	}
}
