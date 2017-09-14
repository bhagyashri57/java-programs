package Oracle;

public class PrintNumber {
	
	public static void main(String[] args) {
		PrintNumber p=new PrintNumber();
		int i=1;
		p.m1(i);
	}
	void m1(int i)
	{
		//PrintNumber p=new PrintNumber();
		while(i<11)
		{
		System.out.println(i);
		
		m1(i++);
		
		}
		
		
	}

}

