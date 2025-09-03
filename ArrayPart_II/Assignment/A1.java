package ArrayPart_II.Assignment;

public class A1 {
    // Given an integer array nums, return true if any value appears at least twice
    // in the array, and return false if every element is distinct
    public static boolean solve(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 1 };
        System.out.print(solve(number));
    }
}
