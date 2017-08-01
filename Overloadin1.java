class A
{
 public void m1(B b)
{

System.out.println("method .....B");
}

public void m1(A a)
{

System.out.println("method .....A");
}
public void m1(C c)
{

System.out.println("method .....C");
}

}
public class Overloadin1
{

public static void main(String args[])
{

A a=new A();
a.m1((A)c);

}

}