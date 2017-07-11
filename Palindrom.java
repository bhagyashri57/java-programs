import java.util.Scanner;

public class Palindrom

{ 
     int n,rem=0,r,temp;
    Scanner sc=new Scanner(System.in);
    
public void palin()
  {
     System.out.println("\n Enter the number:");
     n=sc.nextInt();
   temp=n; 
   while(n!=0)
  {
   r=n%10;
   rem=(rem*10)+r;
   n=n/10;
  }
 System.out.println("The reverse numberis:"+rem);
 if(rem==temp)
    System.out.println("The number is palindrom");
else
  System.out.println("The number is not palindrom");
    
  }

  
  public static void main(String args[])
  { 
  Palindrom a=new Palindrom();
   a.palin();
    

   }
}