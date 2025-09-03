package Recursion;

public class First {
    // print number in decreasing order
    public static void DEC(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        DEC(n - 1);
    }

    // print number in Increasing order
    public static void INC(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        INC(n - 1);
        System.out.print(n + " ");
    }

    // print factorial of number
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        int fact = n * factorial(n - 1);
        return fact;
    }

    // print sum of first n natural numbers
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = n + sum(n - 1);
        return sum;
    }

    public static void main(String[] args) {
        int n = 10;
        DEC(n);
        INC(n);
        System.out.println();
        System.out.println(factorial(5));
        System.out.println(sum(n));
    }
}
