package Collection;

import java.util.HashMap;
import java.util.Map;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>map=new HashMap<Integer,String>();
		map.put(6, "lmn");
		map.put(1, "def");
		map.put(3, "xyz");
		map.put(4, "pqr");
		map.put(5, "abc");
		
		
		//traverse the map
		map.forEach((key,value)->
		System.out.println("key:"+key+" "+"value:"+value));
		

	}

}
