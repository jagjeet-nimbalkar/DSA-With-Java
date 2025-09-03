package AdvancePatterns;

public class invertedNumber {
    public static void inverted(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted(5, 5);
    }
}
