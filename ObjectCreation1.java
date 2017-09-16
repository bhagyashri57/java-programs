package StringandStringBuffer;

public class ObjectCreation1 {
	public static void main(String[] args) {
		
	
	String s1=new String("Complte");
	s1.concat("java");
	String s2=s1.concat("Classes");
	s1=s1.concat("Karvenagar");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	}

}
