package Loops.practise;

import java.util.Scanner;
// import ConditionalStatement.elseif;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // write a program that read the set of input and then print the sum of the even
        // and odd number
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        do {
            System.out.println("Enter a Number:");
            number = sc.nextInt();
            if (number % 2 == 0) {
                evenSum = evenSum + number;
            } else {
                oddSum = oddSum + number;
            }
            ;
            System.out.println("If you want to continue then press 1 of exit press 0");
            choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("Sum of even no:" + evenSum);
        System.out.println("Sum of odd no:" + oddSum);
        sc.close();
    }
}
