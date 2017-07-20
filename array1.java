import java.util.Scanner;
public class array1
{
  public static void main(String args[])
{
   int []a=new int[10];
int i,j,count=0,temp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers"); 
for(i=0;i<10;i++)
 {
  
 a[i]=sc.nextInt();

 }


for(i=0;i<10;i++)
{
  for(j=i+1;j<10;j++)
{
  if(a[i]>a[j])
  {
     temp=a[i];
     a[i]=a[j];
     a[j]=temp; 


  }
  
} 

}

System.out.println("===========================================");
 for(i=0;i<10;i++)
System.out.println(a[i]);

System.out.println("the addition of two highest number= "+(a[9]+a[8]));
System.out.println("the addition of two smallest number= "+(a[0]+a[1]));
}

}