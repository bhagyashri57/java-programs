import java.util.Scanner;

public class Armstrong

{ 
     int n,rem=0,r,temp;
    Scanner sc=new Scanner(System.in);
  public void fibo()
  {
     System.out.println("\n Enter the number:");
     n=sc.nextInt();
    temp=n;
   while(n!=0)
  {
   r=n%10;
   rem=(r*r*r)+rem;
   n=n/10;
  }
 if(rem==temp)
    System.out.println("The number is armstrong");
else
  System.out.println("The number is not armstrong");
    
  }

  
  public static void main(String args[])
  { 
   Armstrong a=new Armstrong();
   a.fibo();
    

   }
}