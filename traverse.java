 import java.util.Scanner;
 public class traverse
  {

     public static void main(String args[])
    {

     int a[]=new int[10];
      int n,i;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter 10 numbers");
    for(i=0;i<10;i++)
    {
      a[i]=sc.nextInt();
    }
   System.out.println("Enter number to be found");
    n=sc.nextInt();
   for(i=0;i<=10;i++)
  {
    if(a[i]==n)
        {
        System.out.println("The number is found");
         break;
         }
    else
      {
       System.out.println("The number is not found");
       }
    }


  }

  }