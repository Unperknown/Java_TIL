package Oct_22;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Product {

	public static Map<String, Integer> MakeMap() {
		Map<String, Integer> products = new HashMap<>();
		
		Scanner scan = new Scanner(System.in);
		
		String key;
		
		while (true) {
			key = scan.nextLine();
			
			if (key == "Q") break;
			int value = scan.nextInt();
			
			products.put(key, value);
		}
		
		return products;
	}
	public static void main(String[] args) {
		Map<String, Integer> target = MakeMap();
		Iterator<String> iter = (target.keySet()).iterator();
		
		while (iter.hasNext()) {
			System.out.println(target.get(iter.next()));
		}
	}

}
