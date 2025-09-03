package ArrayPart_II;

public class maxSum {
    public static void CalSum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.print("sum: " + sum);

                if (sum > maxSum) {
                    maxSum = sum;
                }
                System.out.println();
            }
        }

        System.out.println("Maximum sum: " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 6 };
        CalSum(arr);
    }
}
