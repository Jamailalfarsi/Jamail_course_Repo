import java.util.Scanner;

public class factorialNumber {
	public static int factorial(int n) {
		if (n==1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
		}
		
	public void factorial(){
		System.out.println("Enter the number of factorial:");
		Scanner sc = new Scanner(System.in);
		int userInput =sc.nextInt();
		long resultOfFactorial=factorial(userInput);
		System.out.println("factorial("+userInput+"!"+")=" + userInput+"*factorial("+(userInput-1)+"!"+")");
		System.out.println(resultOfFactorial);
	}
}
