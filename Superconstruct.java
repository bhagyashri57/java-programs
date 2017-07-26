 class A
{

public A()
{
super();
System.out.println("Constructor......A");
}

}
 class B extends A 
{

public B()
{
super();
System.out.println("Constructor......B");
}

}
public class Superconstruct
{

  public static void main(String ar[])
 {

   A a=new B();


 }

}