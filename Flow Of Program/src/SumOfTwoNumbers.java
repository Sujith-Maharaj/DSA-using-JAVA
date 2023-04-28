//Take two numbers and print the sum of both
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second number: ");
        int b = sc.nextInt();

        System.out.println("The sum of " + a + " and " + b + " is " + sum(a,b));
    }

    static int sum(int a, int b) {
        return a+b;
    }
}
