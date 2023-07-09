import java.util.*;

public class sum {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first Integer: ");
		int a = sc.nextInt();

		System.out.print("Enter the second Integer: ");
		int b = sc.nextInt();

		int sum = a + b;
		System.out.println("The sum of " + a + " and " + b + ": " + sum );
	}
}
