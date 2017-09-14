package Oracle;

public class Super {
	Super()
	{
		
System.out.println("parent class constr");		
	}
	public static void main(String[] args) {
		sub s=new sub(12);
		
	}
	

}
 class sub extends Super
{
	 sub()
	 {
		// super();
		// this();
		 System.out.println("Child constru");
		
		 
	 }
	 sub(int i)
	 {
		 this();
		 System.out.println("hello");
		 
	 }
	 
	


}
