import java.util.Scanner;
public class Addition {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int add=Addition(num1,num2);
		System.out.println("The addtion of two numbers:"+add);
		
	}
	static int Addition(int num1,int num2)
	{
		return num1+num2;
		
	}

}
