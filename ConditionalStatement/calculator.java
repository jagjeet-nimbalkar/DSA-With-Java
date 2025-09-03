package ConditionalStatement;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char operator = sc.next().charAt(0);
        int b = sc.nextInt();

        if (operator == '+') {
            System.out.println(a + b);
        } else if (operator == '-') {
            System.out.println(a - b);
        } else if (operator == '*') {
            System.out.println(a * b);
        } else if (operator == '/') {
            System.out.println(a / b);
        } else {
            System.out.println("Use a valid operator");
        }
        sc.close();
    }

}
