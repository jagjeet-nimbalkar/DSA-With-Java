package Loops.practise;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        // write a program to print the multiplication table of the given number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No to print table:");
        int no = sc.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(no + "*" + i + "=" + no * i);
            i++;
        }
        sc.close();
    }
}
