class A
{
  public void m1(Object o)
{
System.out.println("Object method");
}
public void m1(String s)
{
System.out.println("String method");
}


}
public class Overloading
{
  public static void main(String args[])
{
 A a=new A();
  a.m1(null);
a.m1((Object)null);

}
}