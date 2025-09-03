package Loops;

import java.util.Scanner;

public class breakStmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a no:k");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                System.out.println("Loop breaked");
                break;
            }
            ;
            System.out.println(n);
            ;
        } while (true);
        sc.close();
    }
}
