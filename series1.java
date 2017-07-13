//1+2+3+..+n
import java.util.Scanner;
 public class series1
{
   public static void main(String args[])
  {
      int f,i,n;
      double s=0.0d;
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter the number:");
     n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
     s=s+i;
     
   System.out.print(i+"+");
   }
  System.out.println("\n The sum of this series is:"+s);
    
 }

}