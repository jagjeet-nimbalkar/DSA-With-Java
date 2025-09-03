import java.util.Scanner;

public class basic {
    public static void printLetter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " "); // chatAt-
        }
    }

    // palindrome
    public static boolean palindrome(String str) {
        int n = str.length();
        boolean isPalindrome = true;

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) == str.charAt(n - i - 1)) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
            }
        }

        if (isPalindrome) {
            System.out.println("The word \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + str + "\" is not a palindrome.");
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        // String str = "abcd";

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.err.println(name.length());

        // concatination

        // String lastName=sc.next();
        // System.out.println("fullname:"+ name+" "+lastName);

        // find letter of word or sentance
        // printLetter(name);

        // palindrome
        System.out.print(palindrome("m00m"));
        sc.close();

    }
}