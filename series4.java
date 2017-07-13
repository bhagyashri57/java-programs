//1!+2!+3!+...n
import java.util.Scanner;
 public class series4
{
   public static void main(String args[])
  {
      int f=1,i,n,s=0;
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter the number:");
     n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
      f=f*i;
     s=s+f;
   System.out.print("("+i+"!)+");
   }
  System.out.println("\n The sum of this series is:"+s);
    
 }

}