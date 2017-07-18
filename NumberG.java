public class NumberG extends Thread
{
  int st,end,i;
public NumberG(int st,int end)
{
 this.st=st;
 this.end=end;

}
public void run()
{
  for(i=st;i<end;i++)
  {

  System.out.println(i+" "+currentThread().getName());//to get the name  of the thread
  i++;

 }
}
public static void main(String args[])
{
  NumberG odd=new NumberG(1,100);
  NumberG even=new NumberG(2,100);
   odd.setName("odd");
   even.setName("even");
   odd.setPriority(9);
   even.setPriority(1);
   odd.start();
   even.start();

}

}