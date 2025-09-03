package Functions;

import java.util.Scanner;

public class basic {
    // basic
    public static void printHello() {
        System.out.println("Hello World");
    }

    // taking parameter
    public static int calsulateSum(int a, int b) { // taking paramers/formal parameters from main function
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

    // swapping of values
    public static void swapping(int no1, int no2) {
        int temp = no1;
        no1 = no2;
        no2 = temp;
        System.out.println("value of no1:" + no1);
        System.out.println("value of no2:" + no2);
    }

    // product of numbers
    public static int product(int num1, int num2) {
        int product = num1 * num2;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a:");
        int a = sc.nextInt();
        System.out.println("enter value of b:");
        int b = sc.nextInt();
        int sum = calsulateSum(a, b); // passing actual parameter/arguments to function
        System.out.println("sum is " + sum);

        // swapping
        int no1 = 10;
        int no2 = 30;
        swapping(no1, no2);

        // product of numers
        int num1 = 50;
        int num2 = 25;
        int prod = product(num1, num2);
        System.out.println("product of number " + prod);
        sc.close();
    }
}
