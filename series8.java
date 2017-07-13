import java.util.Scanner; 

public class series8
{

  public static void main(String args[])
 {
  int i,n,f=1;
  double s=0.0d;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number:");
  n=sc.nextInt();
  for(i=1;i<=n;i++)
  {
    f=f*i;
    s=s+(Math.pow(i,i))/f;
   System.out.print("("+i+"^"+i+"/"+i+")+");
  }

System.out.println("The addition of this series is :"+s);
  }

}