class A
{
 int a=10,b=20;
public void m1()
{
System.out.println("m1.....A");

}
public void m2()
{
System.out.println("m2.....A");

}

}
class B extends A
{
int c=30,d=40;
public void m1()
{
System.out.println("m1.....B");

}
public void m3()
{
System.out.println("m3.....B");

}

}
public class Singleinherit
{
   public static void main(String args[])
  {
    A a=new B();
     a.m1();
     a.m2();
    System.out.println(a.a);
    System.out.println(a.b);
System.out.println("=========================================");
  B b=new B();
   b.m1();
   b.m2();
   b.m3();
System.out.println(b.a);
System.out.println(b.b);
System.out.println(b.c);
System.out.println(b.d);

 }

}