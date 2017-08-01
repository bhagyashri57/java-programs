class A
{
 static int a1,b1;
static int add(int a, int b)
{

a1=a;
b1=b;
System.out.println("real");
return (a1+b1);
}
}
public class staticoverride extends A
{
static int c1,d1;

static int add(int c, int d)
{
c1=c;
d1=d;
System.out.println("Overrided");
return (c1+d1);
}

public static void main(String args[])
{
  B b1=new B();
int add=b1.add(5,6);
System.out.println("The addition="+add);
}
} 