package Oct_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class test3 {

	public static void main(String[] args) {
		
		List<String> result = new ArrayList<String>();
		test3 ex = new test3();
		result = ex.addArray(new String[]{ "1", "2", "3", "4", "5" }, new String[]{ "A", "B", "C", "D", "E" });
		for (String str : result) {
			System.out.println(str);
		}
		Iterator it = result.iterator();
		
		while (it.hasNext()) {
			System.out.println("*" + it.next());
		}
	}

	private List<String> addArray(String[] arr1, String[] arr2) {
		List<String> list = new ArrayList<String>(Arrays.asList(arr1));
		list.addAll(Arrays.asList(arr2));
		return list;
	}

}
