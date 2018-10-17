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
		//Iterator�� Collections, List, Map, Set ���� ����(Enumeration)�� �� ���
		
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

	private static List<String> addArray(String[] arr1, String[] arr2) {
		List<String> list = new ArrayList<>(Arrays.asList(arr1));
		//�Ҵ��� Ŭ������ ���׸� Wrapper Ŭ������ �����ص� ��
		list.addAll(Arrays.asList(arr2));
		
		/*
		 * for (String str : arr1) list.add(str);
		 * for (String str : arr2) list.add(str);
		 * �� ����� ����
		 */
		
		return list;
	}

}
