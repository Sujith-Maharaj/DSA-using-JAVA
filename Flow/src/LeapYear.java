//Input a year and find whether it is a leap year or not

//A leap year must be divisible by four except for century years,
//also it is leap year if it is perfectly divisible by 400

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a year to check : ");
        int year = sc.nextInt();

        if(isLeapYear(year)){
            System.out.println(year + " is a Leap Year");
        }
        else {
            System.out.println(year + " is Not a Leap Year");
        }
    }

    static boolean isLeapYear(int year){
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }

}
