class factorial
{
int fact=1,n;
public factorial(int n)
{
for(int i=1;i<=n;i++)
{
 fact=fact*i;
}
System.out.println("factorial="+fact);
}
public static void main(String args[])
{
factorial obj=new factorial(3);
}
}
