package Collection;

import java.util.*;

public class Vectorp {
	public static void main(String[] args) {
		Vector<Integer> l=new Vector<Integer>();
		l.add(10);
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(5);
		System.out.println(l);
		Enumeration<Integer> e=(Enumeration<Integer>)l.elements();
		while(e.hasMoreElements())
		{
			int x=(Integer)e.nextElement();
			System.out.println(x);
		}
		
		
	}

}
