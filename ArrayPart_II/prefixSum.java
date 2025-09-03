package ArrayPart_II;

public class prefixSum {
    public static void maxSumArr(int number[]) {
        int prefix[] = new int[number.length];
        int maxSum = Integer.MIN_VALUE;
        prefix[0] = number[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }

        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                int curr = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < curr) {
                    maxSum = curr;
                }
            }
        }

        System.out.println("Max sum:" + maxSum);
    }

    public static void main(String[] args) {
        int number[] = { 1, -2, 6, -1, 3 };
        maxSumArr(number);
    }
}
