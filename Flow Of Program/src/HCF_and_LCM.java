//HCF and LCM of
import java.util.Scanner;

public class HCF_and_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.println("HCF is " + HCF(num1,num2));
        System.out.println("LCM is " + LCM(num1,num2));
    }

    static int LCM(int a, int b) {
        int temp = 0;
        temp = a * b/HCF(a,b);
        return temp;
    }

    static int HCF(int a, int b) {
        int temp = 0;
        for(int i=1; i<=a; i++){
            if(a%i == 0 && b%i==0){
                temp=i;
            }
        }
        return temp;
    }


}
