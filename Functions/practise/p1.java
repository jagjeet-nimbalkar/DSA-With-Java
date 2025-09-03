package Functions.practise;

public class p1 {
    // write a java method to computer the average of the threee numbers
    public static int Avg(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        System.err.println(avg);
        return avg;
    }

    // is even method that accept argument and return true if no is even or false
    // for odd
    public static boolean isEven(int no) {
        if (no % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // write a code to check the number is palindrome
    public static void isPalindrome(int num) {
        int originalNo = num;
        int reverse = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }
        if (originalNo == reverse) {
            System.out.println(originalNo + " is a palindrome");
        } else {
            System.out.println(originalNo + " not a palindrome");
        }
    }

    // write a java method to compute the sum of the lastdigit in an integer
    public static void checkSum(int a) {
        int number = a;
        int sum = 0;
        while (a > 0) {
            int lastDigit = a % 10;
            sum = sum + lastDigit;
            a = a / 10;
        }
        System.out.println("sum of the digits of number " + number + " is " + sum);
    }

    public static void main(String[] args) {
        Avg(15, 25, 35);

        // even/odd
        boolean res = isEven(122);
        System.out.println(res);

        // palindrome
        isPalindrome(321);

        // sum of nuber of interger
        checkSum(5246789);
    }
}
