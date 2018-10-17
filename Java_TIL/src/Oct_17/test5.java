package Oct_17;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class test5 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.addAll(Arrays.asList(new String[] {"Apple", "Banana"}));
		
		for (String str : set) {
			System.out.print(str + " ");
		}
	}

}
