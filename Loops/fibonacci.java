package Loops;

public class fibonacci {
    public static void main(String args[]) {
        int a = 1;
        int b = 1;
        int n = 10;
        for (int i = 3; i <= n; i++) {
            int temp = a;
            a = b;
            b = temp + b;
            System.out.println(b);
        }
    }
}
