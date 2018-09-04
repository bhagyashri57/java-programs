import java.util.Scanner;

public class StringManipulation {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str1 = sc.next();
		System.out.println("The Character at this position="+str1.charAt(1));
		System.out.println("After replacement="+str1.replaceAll("a","o"));
		System.out.println("The Character at lastposition="+str1.lastIndexOf("a"));
		System.out.println("The Character at this position="+str1.compareTo("RohaN"));
		System.out.println("The Equals method :"+str1.equals("admin"));
		System.out.println("The concat output :"+str1.concat("ABC"));
		System.out.println("The ReplaceFirst output :"+str1.replaceFirst("Rohan", "One"));
		System.out.println("The Is Empty output :"+str1.isEmpty());
		System.out.println("The ToLowerCase output :"+str1.toLowerCase());
		System.out.println("The To UpperCase output :"+str1.toUpperCase());

	}
}
