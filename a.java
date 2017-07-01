class  A
{
      int a,b,s;
    public void sum(int a,int b)
{
   this.a=a;
this.b=b;
s=a+b;
System.out.println("sum="+s);
}
public A(int a,int b)
{
int m;
m=a*b;
System.out.println("mul="+m);

}

public static void main(String args[])
{
  A obj=new A(2,3);
  A obj1=new A(5,2);
obj.sum(10,15);

} 
}