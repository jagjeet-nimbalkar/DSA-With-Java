package ConditionalStatement;

import java.util.Scanner;

public class incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Income:");
        int Income = sc.nextInt();
        int tax;
        if (Income < 500000) {
            tax = 0;
            System.out.println("You don't have to pay any GST");
        } else if (Income >= 500000 && Income <= 100000) {
            tax = (int) (Income * 0.2);
            System.out.println("You have to pay 20% tax" + (tax));
        } else {
            tax = (int) (Income * 0.3);
            System.out.println("You have to pay 30% tax" + (tax));
        }
        sc.close();
    }
}
