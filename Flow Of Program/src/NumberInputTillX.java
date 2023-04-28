import java.util.Scanner;

//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
public class NumberInputTillX {
    public static void main(String[] args) {
        int sum = 0;
        String input;

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number (or x to exit): ");
            input = sc.nextLine();

            if(input.equals("x") || input.equals("X")){
                break;
            }

            int num = Integer.parseInt(input);
            sum = sum + num;
        }
        System.out.println("The sum of given numbers is "+ sum);
        System.out.println("The Program ENDS...!!!");
    }
}
