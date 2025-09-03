package Recursion;

public class power {

    public static int power(int n, int pow) {
        if (pow == 0) {
            return 1;
        }
        return n * (power(n, pow - 1));
    }

    public static void main(String args[]) {
        int n = 8;
        int pow = 0;
        System.out.println(power(n, pow));
    }
}