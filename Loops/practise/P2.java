package Loops.practise;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        // Write a program that find the factorial of any number
        Scanner sc = new Scanner(System.in);
        int factorial = 1;
        System.out.print("Enter Number:");
        int Number = sc.nextInt();
        for (int i = 1; i <= Number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of no is:" + factorial);
        sc.close();
    }
}
