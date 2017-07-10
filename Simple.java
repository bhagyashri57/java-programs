import java.util.Scanner;

class Simple
{
  int p,n,r,sim;
  public void simp()
  {
    System.out.println("Enter the 3 vales of Principal ,rate,time:");
   Scanner sc=new Scanner(System.in);
   p=sc.nextInt();
   r=sc.nextInt();
   n=sc.nextInt();
   sim=(p*n*r)/100;
   System.out.println("Simple Interest:"+sim);
	

  }
   public static void main(String args[])
   {

  Simple s=new Simple();
  s.simp();
  }


}