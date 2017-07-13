import java.util.Scanner; 

public class series8
{

  public static void main(String args[])
 {
  int i,n,s=0,f=1;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number:");
  n=sc.nextInt();
  for(i=1;i<=n;i++)
  {
    f=f*1;
    s=s+(Math.pow(i,i))/f;
   System.out.println(+i+"^"+i+"/"+i+);
  }

System.out.println("The addition of this series is :"+s);
  }

}