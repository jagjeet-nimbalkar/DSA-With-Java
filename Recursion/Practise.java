package Recursion;

public record Practise() {
    // For a given integer array of size N.You have to find all the
    // occurrences(indices) of a given element (Key)and print them.Use a recursive
    // function to solve this problem
    public static void Occur(int arr[], int idx, int key) {
        // base case
        if (idx == 0) {
            return;
        }
        // kaam
        Occur(arr, idx - 1, key);
        if (key == arr[idx]) {
            System.out.println(idx);
        }
    }

    // Write a program to findLength of a String using Recursion
    public static int strLength(String str, int idx) {
        // base case
        if (idx == str.length()) {
            return 0;
        }
        // kaam
        return 1 + strLength(str, idx + 1);

    }

    // You are given a number (eg - 2019), convert it into a String of english like
    // “two zero one nine”. Use a recursive function to solve this problem
    public static String prints(int n) {
        String[] words = { "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine" };

        if (n == 0) {
            return "zero";
        }
        // kaam
        if (n < 10) {
            return words[n];
        } else {
            return prints(n / 10) + " " + words[n % 10];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int key = 2;
        Occur(arr, arr.length - 1, key);

        String str = "abcde";
        System.out.println("lenght of string is " + strLength(str, 0));

        int n = 2000;
        System.out.println(prints(n));
    }
}
