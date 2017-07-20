public class string1
{
   public static void main(String args[])
 
{
   String str="tathagat";
   char a,a1;
   int l,i,count=0;
   l=str.length();
   a=str.charAt(0);
System.out.println(a );
  for(i=1;i<(l-1);i++)
   {

      a1=str.charAt(i);
      if(a==a1)
       count++;
    
   }
System.out.println(" "+a+"="+count );

 }



}