 public class Base
{
  Base()
{

System.out.println("Base");

}
}
 class Alpha extends Base
{

public static void main(String args[])
{
  new Alpha();
  new Base();


}

}