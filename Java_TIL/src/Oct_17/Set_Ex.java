package Oct_17;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//Set과 Iterator을 사용하기 위해 패키지를 불러옴

public class Set_Ex {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		System.out.println(set.add("Apple"));
		set.add("Banana");
		System.out.println(set.add("Apple"));
		set.add("Orange");
		
		for (String str : set) {
			System.out.print(str + " ");
		}
		
		Iterator iter = set.iterator();
		
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		
		Set<String> set2 = new HashSet<>();
		
		set2.addAll(Arrays.asList(new String[] {"Apple", "Orange", "Kiwi", "Banana", "Melon", "Melon"}));
		set2.retainAll(set);
		
		for (String str : set2) {
			System.out.print(str + " ");
		}
	}
}
