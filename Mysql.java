public class Mysql implements connection
{
public void commit()
{

System.out.println("commit....Mysql");
}
public void rollback()
{

System.out.println("rollback....Mysql");
}

public static void main(String args[])
{
connection con=new Oracle();
connection con1=new Mysql();
con.commit();
con1.commit();


}


}