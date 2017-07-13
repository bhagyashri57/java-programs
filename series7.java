//[(1^1)/1]+[(2^2)/2]+...n
import java.util.Scanner;
 public class series7
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
     s=s+(Math.pow(i,i)/i);
     
   System.out.print("[("+i+"^"+i+")/"+i+"]+");
   }
  System.out.println("\n The sum of this series is:"+s);
    
 }

}