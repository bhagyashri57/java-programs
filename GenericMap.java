package Collection;

import java.util.*;

public class GenericMap {
	public static void main(String[] args) {
		//GenericMap g=new GenericMap();
		
		Map<String,Student>m=new HashMap<String,Student>();
		
		Student s=new Student();
		s.setRollno(1);
		s.setName("Bhagyashri");
		
		
		 Student s1=new Student();
		s1.setRollno(2);
		s1.setName("Aish");
		m.put("a",s);
		m.put("b",s1);
		
		Set <String>keys=m.keySet();
		System.out.println(keys);
		for (String key : keys) {
			Student stu=(Student)m.get(key);
			System.out.println(stu.getRollno()+"   "+stu.getName());
			//System.out.print();
			
		}
		
		
		
		
	}
	

}
