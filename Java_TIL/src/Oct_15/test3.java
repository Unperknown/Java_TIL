package Oct_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class test3 {

	public static void main(String[] args) {
		List<String> result = new ArrayList<>();
		
		result = addArray(new String[]{ "1", "2", "3", "4", "5" }, new String[]{ "A", "B", "C", "D", "E" });
		
		Iterator<String> it = result.iterator();
		//Iterator는 Collections, List, Map, Set 등을 열거(Enumeration)할 때 사용
		
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

	private static List<String> addArray(String[] arr1, String[] arr2) {
		List<String> list = new ArrayList<>(Arrays.asList(arr1));
		//할당할 클래스의 제네릭 Wrapper 클래스는 생략해도 됨
		list.addAll(Arrays.asList(arr2));
		
		/*
		 * for (String str : arr1) list.add(str);
		 * for (String str : arr2) list.add(str);
		 * 이 방법도 가능
		 */
		
		return list;
	}

}
