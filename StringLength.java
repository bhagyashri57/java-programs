import java.util.Scanner;

public class StringLength {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.next();

		int len = stringLen(str);
		System.out.println("The length of" + str + " is=" + len);

	}

	static int stringLen(String str) {
		int len = str.length();
		return len;

	}
}
