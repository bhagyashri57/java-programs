import java.util.Scanner; 

public class series10
{

  public static void main(String args[])
 {
  int i,n,s=0,sign=1;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number:");
  n=sc.nextInt();
  for(i=1;i<=n;i++)
  {
    s=s+(i/i+1)*sign;
    i=i+1;
    sign=sign*(-1);
//System.out.println(+i+"/"+(i+1)"\t");
  }

System.out.println("The addition of this series is :"+s);
  }

}