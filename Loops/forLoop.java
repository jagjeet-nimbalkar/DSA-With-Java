package Loops;

public class forLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            System.out.println("****");
        }

        // print reverse of no
        int n = 461104;
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit + " ");
            n = n / 10;
        }
        System.out.println();

        //
        int no = 582655899;
        int rev = 0;
        while (no > 0) {
            int lastDigit = no % 10;
            rev = (rev * 10) + lastDigit;
            no = no / 10;
        }
        System.out.println(rev);
    }
}
