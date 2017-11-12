package Collection;

import java.util.Enumeration;
import java.util.*;

public class LinkedListp {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(5);
		l.add("string");
		System.out.println(l);
		ListIterator ltr=l.listIterator();
		while(ltr.hasNext())
		{
			int x=(Integer)ltr.next();
			System.out.println(x);
		}
		
		
	}

}


