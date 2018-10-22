package Oct_22;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Ex {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("01", "Someone");
		map.put("02", "Anonymous");
		map.put("03", "A guy who named Map");
		
		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		
		while (iter.hasNext()) {
			String curr_key = iter.next();
			System.out.println(curr_key + " " + map.get(curr_key));
		}
	}

}
