package Functions;

import java.util.Scanner;

public class factorial {

    public static int fact(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // funtion for calculate bionomial factorial
    public static int factCoeff(int num, int r) {
        int factnum = fact(num);
        int factr = fact(r);
        int factnmr = fact(num - r);
        int bincoff = factnum / (factr * factnmr);
        return bincoff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value number:");
        int number = sc.nextInt();
        System.out.print("Enter the value of r:");
        int r = sc.nextInt();
        int factorial = factCoeff(number, r);
        System.out.println("factorial of number is:" + factorial);
        sc.close();
    }

}
