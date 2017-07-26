class A
{
  int a=10;
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
  int b=20,c=30;
public void m1()
{
  System.out.println("m1.....B");


}
public void m3()
{
  System.out.println("m3.....B");


}

}

class C extends B
{
  int d=40;
public void m3()
{
  System.out.println("m3.....c");


}
public void m4()
{
  System.out.println("m4.....c");


}

}
public class Multilevelinherit
{
   public static void main(String ar[])
 {
     A a=new B();
    a.m1();
    a.m2();
System.out.println(a.a);
System.out.println("================================"); 

B b=new C();
    b.m1();
    b.m2();
    b.m3();
System.out.println(b.b);
System.out.println(b.c);
System.out.println("================================"); 

A c=new C();
    c.m1();
   c.m2();
System.out.println(c.a);
System.out.println("================================"); 

 }

}

