package Collection;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		Map<Integer, String> m=new HashMap<Integer, String>();
		m.put(1, "abc");
		m.put(2, "ndg");
		m.put(null, null);
		m.put(null, null);
		m.put(4, null);
		
		
		Set<Integer> keys=m.keySet();
		System.out.println(keys);
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext())
		{
			int x=(Integer)itr.next();
			System.out.println(x);
		String  val =(String)m.get(x);
			System.out.println(val);
		}
	}
}
