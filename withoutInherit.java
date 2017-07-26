class A
{
   int x;
public void m1()
{

System.out.println("m1......A");

}

}
 class B
{
   A a= new A();
public void m2()
{


a.m1();

}
public void m3()
{

a.m1();
System.out.println(a.x);
}

}
public class withoutInherit
{

 public static void main(String ar[])
{

B b=new B();
b.m2();
b.m3();

}

}