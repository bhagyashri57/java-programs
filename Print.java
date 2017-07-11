

public class Print
{
  int i;
   public void P(int i)
  {
    if(i<=10)
   {
    System.out.println(i);
     i++;
    P(i);
     }
   }
   public static void main(String args[])
 {
  Print p1=new Print();
   p1.P(1);   

   }
 
}