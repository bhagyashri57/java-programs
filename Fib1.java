 import java.util.Scanner;  

public class Fib1
{   
   
 
   int f1=0,f2=1,f3,n;
   Scanner sc= new Scanner(System.in);
   void fibo()
   { 
    System.out.println("Enter the number:");
     n=sc.nextInt(); 
   
  System.out.println("The Fibonacci series is:\n "+f1+"\t"+f2);
   f3=f1+f2;
   fibo1(int f3)
   {
      System.out.println("\t"+f3);
      f1=f2;
       f2=f3;
     f3=f1+f2;
     fibo1(f3);
    }
  }
  public static void main(String args[])
  {
    Fib1 f=new Fib1();
    f.fibo();

  }

   }
