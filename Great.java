import java.util.Scanner;

public class Great
{
    public static void main(String args[])
  {
	int a,b,c;
 	System.out.println("\nEnter the 3 numbers:");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();

        if(a>b && b>c)
         System.out.println("\nThe greatest number is:"+a);
       else if(b>a && b>c)
         System.out.println("\nThe greatest number is:"+b);
	else
         System.out.println("\nThe greatest number is:"+c);




  }


}