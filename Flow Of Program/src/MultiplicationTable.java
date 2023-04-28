//Take a number as input and print the multiplication table for it.

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to print Multiplication Table for it: ");
        int num = sc.nextInt();

        table(num);
    }
    static void table(int n) {
        for (int i = 1; i<=12; i++){
            System.out.println(i + " * " + n + " = " + i*n);
        }
    }
}
