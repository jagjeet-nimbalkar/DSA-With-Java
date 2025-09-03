package basic;

import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = (float) 10.110;
        int b = (int) a;
        System.out.println(b);

        int x = 10;
        long y = x;
        System.out.println(y);

        char ch = 'z';
        int cha = ch;
        System.out.println(cha);
        sc.close();
    }
}
