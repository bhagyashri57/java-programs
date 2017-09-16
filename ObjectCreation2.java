package StringandStringBuffer;

public class ObjectCreation2 {
public static void main(String[] args) {
	String s1=new String("kundan");
	String s2=s1.toLowerCase();
	String s3=s1.toUpperCase();
	String s4=s1.toLowerCase();
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s3.hashCode());
	System.out.println(s4.hashCode());
}
}
