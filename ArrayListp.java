package Collection;


import java.util.*;

public class ArrayListp {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(10);
	    l.add("bhagyashri");
		l.add(null);
		
		System.out.println(l);
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			Object o=itr.next();
			
			if(o instanceof Integer)
			{
	        	int x=(Integer)o;		
		        System.out.println(x);
		   }
			
			if(o instanceof String)
			{
	        	String x=(String)o;		
		        System.out.println(x);
		   }
			
		
		
	}
		int a=(Integer)l.get(1);
		System.out.println("The Element at the specified position 1="+a);
	}


}