import java.util.Scanner;

public class digits

{ 
     int n,c=0,i;
    Scanner sc=new Scanner(System.in);
  public void count()
  {
     System.out.println("Enter the number:");
     n=sc.nextInt();
    while(n!=0)
   {
      n=n/10;
      c++;
   }
    System.out.println("The number of digits: "+c); 
  }

  
  public static void main(String args[])
  { 
   digits d=new digits();
   d.count();
    

   }
}