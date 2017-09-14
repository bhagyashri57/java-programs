package Oracle;

public class NarrowingConcept {
public static void main(String[] args)
{
	//String s = null;
	NarrowingConcept n=new NarrowingConcept();
	n.m1();
	
	System.out.println((String)null);
}
public void m1()
{
	
System.out.println(this);
}	

}

