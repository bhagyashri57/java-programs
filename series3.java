 //(1)+(1+2)+(1+2+3)
import java.util.Scanner;
 public class series3
{
   public static void main(String args[])
  {
      int n,i,j;
      double s=0.0d,t=0.0d;
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter the number:");
     n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
      for(j=1;j<=i;j++)
      {
        
   s=s+j;
     System.out.print("("+j+"+"+i+j+")");
     }
t=t+s;
     
   
   }
  System.out.println("\n The sum of this series is:"+s);
    
 }

}