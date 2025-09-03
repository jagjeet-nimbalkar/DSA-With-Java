package AdvancePatterns;

public class zeroone {
    public static void zeroOne(int r) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                int mod = (i + j) % 2;
                if (mod == 0) {
                    System.out.print('1');
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        zeroOne(5);
    }
}
