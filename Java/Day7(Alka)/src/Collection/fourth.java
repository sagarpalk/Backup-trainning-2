package Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(6, "lmn");
		map.put(1, "def");
		map.put(3, "xyz");
		map.put(4, "pqr");
		map.put(5, "abc");

		System.out.println(map.entrySet());
		System.out.println(map.containsKey(6));
		System.out.println(map.get(1));
		System.out.println(map.size());
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		//traverse
		Iterator<Entry<Integer,String>> it=map.entrySet().iterator();

		// traverse the map
		map.forEach((key, value) -> System.out.println("key:" + key + " " + "value:" + value));

	}

}
