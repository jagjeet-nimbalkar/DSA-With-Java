package ConditionalStatement;

import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price:");
        int price = sc.nextInt();
        double GST = 0.1;
        if (price > 10000) {
            System.out.print("You have to pay 10% gst and your total price is \t");
            System.out.println(price + (price * GST));
        } else if (price >= 5000) {
            System.out.println("You have to pay 4% GST");
        } else {
            System.out.println("You don't have to pay GST ");
        }
        sc.close();
    }
}
