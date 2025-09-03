
import java.util.Scanner;

public class begin {

    public static void main(String[] args) {
        // int subjects[] = { 1, 2, 3, 4, 5, 6 };
        // String froots[] = { "apple", "mango", "papaya", "chiku" };
        int marks[] = new int[40];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers to push in array:");
        marks[0] = sc.nextInt();
        System.out.print("Enter numbers to push in array:");
        marks[1] = sc.nextInt();
        System.out.print("Enter numbers to push in array:");
        marks[2] = sc.nextInt();

        System.out.println("phy: " + marks[0]);
        System.out.println("chem: " + marks[1]);
        System.out.println("math: " + marks[2]);
        sc.close();
    }
}
