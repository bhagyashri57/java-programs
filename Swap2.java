import java.util.Scanner;

public class Swap2
{
   public static void main(String args[])
   {
 	int a=10,b=5;
      
	b=a+b;
 	a=b-a;
	b=b-a;
	System.out.println("After swapping:\n"+"A="+a+"\nB="+b);

    }


}