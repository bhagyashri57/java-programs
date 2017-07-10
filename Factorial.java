import java.util.Scanner;
public class Factorial
{
    int f=1,i,n;
    Scanner sc=new Scanner(System.in);
   void fact()
  {

    System.out.println("Enter the number:");
    n=sc.nextInt();
     for(i=1;i<=n;i++)
    {
     f=f*i;
    }    
   System.out.println("factorial of a given number:"+f);

  }


  public static void main(String args[])
  {
	Factorial fc= new Factorial();
	fc.fact();


  }   





}