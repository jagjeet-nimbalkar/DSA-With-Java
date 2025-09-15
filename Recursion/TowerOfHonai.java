package Recursion;

public class TowerOfHonai {
    static void print(int n, String A, String B, String C) {
        if (n == 0) {
            return;
        }
        print(n - 1, A, C, B);
        System.out.println("move " + n + " From " + A + " To " + C);
        print(n - 1, B, A, C);
    }

    public static void main(String[] args) {
        int n = 3;
        print(n, "A", "B", "C");
    }
}