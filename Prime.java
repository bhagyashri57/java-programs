import java.util.Scanner;
public class Prime
{
    int n;
    Scanner sc=new Scanner(System.in);
   void pri()
  {

    System.out.println("Enter the number:");
    n=sc.nextInt();
     if(n%2==0)    
   System.out.println("Given number is prime:"+n);
else
System.out.println("Given number is not prime:"+n);

  }


  public static void main(String args[])
  {
	Prime pc= new Prime();
	pc.pri();


  }   





}