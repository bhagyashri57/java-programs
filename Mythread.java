
 class Mythread extends Thread
{
  public static void main(String ar[])
{
  Mythread t=new Mythread();
t.start();
//System.out.println("One");
//System.out.println("Two");
t.start();

}
public void run()
{

System.out.println("Thread");
}



}