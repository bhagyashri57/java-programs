import java.util.Scanner;

public class StringConcatination {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two String:");
		String str1 = sc.next();
		String str2 = sc.next();

		String str3 = stringCon(str1,str2);
		System.out.println("String Concatination="+str3);

	}

	static String stringCon(String str1,String str2) {
		
		String str3=str1.concat(str2);
		return str3;

	}
}
