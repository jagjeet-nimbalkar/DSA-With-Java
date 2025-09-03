package AdvancePatterns;

public class FloydsTrang {
    public static void trangle(int row) {
        int counter = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter = counter + 1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        trangle(5);
    }
}