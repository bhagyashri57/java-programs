import java.util.Scanner;

public class Swap1
{
   public static void main(String args[])
   {
 	int a=10,b=5,temp;
      System.out.println("Enter the two numbers:");
      Scanner sc =new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
       System.out.println("Before swapping:\n"+"A="+a+"\n B="+b);
	temp=a;
 	a=b;
	b=temp;
	System.out.println("After swapping:\n"+"A="+a+"\nB="+b);

    }


}