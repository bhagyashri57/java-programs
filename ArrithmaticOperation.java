import java.util.Scanner;

public class ArrithmaticOperation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int add = addition(num1, num2);
		int sub = subtraction(num1, num2);
		int mul = multiplication(num1, num2);
		System.out.println("The addtion of two numbers:" + add);
		System.out.println("The subtraction of two numbers:" + sub);
		System.out.println("The multiplication of two numbers:" + mul);

	}

	static int addition(int num1, int num2) {
		return num1 + num2;

	}

	static int subtraction(int num1, int num2) {
		return num1 - num2;

	}

	static int multiplication(int num1, int num2) {
		return num1 * num2;

	}
}
