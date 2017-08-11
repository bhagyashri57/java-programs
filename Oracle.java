 interface connection
{
public abstract void commit();
public abstract void rollback();

}

public class Oracle implements connection
{
public void commit()
{
System.out.println("commited...........Oracle");

}
public void rollback()
{
System.out.println("rollbackkk...........Oracle");

}

} 