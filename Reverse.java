package cjc;
import java.util.Scanner;
public class Reverse
{
    int n,re=0,rem;
    Scanner sc=new Scanner(System.in);
   void rev()
  {

    System.out.println("Enter the number:");
    n=sc.nextInt();
    while(n!=0)
   {
     rem=n%10;
    re=(re*10)+rem;
     n=n/10; 
 
   }
 
  System.out.println("The reverse number is:"+re);
  }


  public static void main(String args[])
  {
	Reverse r= new Reverse();
	r.rev();


  }   

}