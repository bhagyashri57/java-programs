package TreeSet;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class List {
public static void main(String[] args) {
	Map m=new HashMap();
	m.put("1","java");
	m.put("2", "pune");
	m.put("3","karve nagar");
	m.put("4","kothrud");
	
	Set keys=m.keySet();
	Iterator itr=keys.iterator();
	
	while(itr.hasNext())
	{
		String s=(String)itr.next();
	//	System.out.println(s);
		String s1=(String)m.get(s);
	System.out.println(" "+s+"\t "+s1);	
		
		
	}
	}
}