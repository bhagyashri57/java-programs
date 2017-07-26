class A
{
   int x;
public void m1()
{

System.out.println("m1......A");

}

}
 class B extends A
{
   
public void m2()
{


m1();

}
public void m3()
{

System.out.println(x);
}

}
public class withInherit
{

 public static void main(String ar[])
{

B b=new B();
b.m2();
b.m3();
b.m1();
System.out.println(b.x);
}

}