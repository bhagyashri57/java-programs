import java.util.Scanner;

public class Fibonacci

{ 
     int n,i,f1=0,f2=1,f3;
    Scanner sc=new Scanner(System.in);
  public void fibo()
  {
     System.out.println("\n Enter the number:");
     n=sc.nextInt();
    System.out.println("\n The fibonacci series is:"+f1+" \n \t"+f2);
    for(i=0;i<=n;i++)
   {
	f3=f1+f2; 
        f1=f2; 
        f2= f3;
    System.out.println("\t"+f3);

   }
    
  }

  
  public static void main(String args[])
  { 
   Fibonacci f=new Fibonacci();
   f.fibo();
    

   }
}