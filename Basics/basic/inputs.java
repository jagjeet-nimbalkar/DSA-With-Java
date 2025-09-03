package basic;

import java.util.*;

public class inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String input=sc.next();
        // System.out.println(input);

        // String input=sc.nextLine();
        // System.out.println(input);

        System.out.print("enter first number:");
        int num1 = sc.nextInt();
        System.out.print("enter second number:");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.print(" \n Sum of numbers:");
        System.out.print(sum);

        int product = num1 * num2;
        System.out.print("\n Product of numbers:");
        System.out.print(product);

        System.out.print("\n Area  of circle \n ");
        System.out.print("Enter radius:");
        int radius = sc.nextInt();
        double area = Math.PI * radius * radius;
        System.out.print("Area:");
        System.out.print(area);
        sc.close();
    }
}
