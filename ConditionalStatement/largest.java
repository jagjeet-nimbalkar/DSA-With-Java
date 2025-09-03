package ConditionalStatement;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a:");
        int a = sc.nextInt();
        System.out.print("Enter value of b:");
        int b = sc.nextInt();
        System.out.print("Enter value of c:");
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("A Is Greater Value");
            }
        } else if (b > c) {
            System.out.println("B is Greatest Valuse");
        } else {
            System.out.println("C is Greater");
        }
        sc.close();

    }
}
