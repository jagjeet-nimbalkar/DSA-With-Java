package Recursion;

public class fibbonacchi {

    public static int fibbo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int factprev = fibbo(n - 1);
        int factprevv = fibbo(n - 2);
        return factprev + factprevv;

    }

    // check sorted array
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    // first occurance
    public static int find(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (key == arr[i]) {
            return i;
        }
        return find(arr, key, i + 1);
    }

    // last occurance
    public static int last(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = last(arr, key, i + 1);
        if (isFound != -1) {
            return isFound;
        }
        if (arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        System.out.println(fibbo(10));
        //
        int arr[] = { 1, 2, 3, 8, 5, 8 };
        System.out.println(isSorted(arr, 0));

        System.out.println(find(arr, 8, 0));

        System.out.println(last(arr, 8, 0));
    }
}
