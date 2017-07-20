import java.util.Scanner;
 
public class perfect
{

  public static void main(String args[])
{
 int n,i,s=0,temp;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the number:");
 n=sc.nextInt();
 temp=n;
 for(i=1;i<=(n/2);i++)
 {
   if(i%n!=0)
    s=s+i; 
System.out.println(s);
 
 }

 if(s==temp)
 {

  System.out.println("The given number is perfect number");
  }
else
 
 System.out.println("The given number is not perfect number");

 }

}