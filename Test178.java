
public class Test178
{

 public static void main(String ar[])
{
  String s="foo";
Object o=(Object)s;
if(s.equals(o))
{ 
System.out.println("AAA");

}
else
{
System.out.println("BBB");


}
if(o.equals(s))
{ 
System.out.println("CCC");

}
else
{
System.out.println("DDD");


}



}

}