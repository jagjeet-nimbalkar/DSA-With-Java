package ConditionalStatement;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age:");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Adult ! you have right to vote");
        } else {
            System.out.println("You don't have right to vote");
        }
        sc.close();

    }
}
