package ArrayPart_II;

public class kadans {
    public static void kadansalgo(int num[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < num.length; i++) {
            currSum = currSum + num[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int num[] = { 4, -5, 8, 6, 3 };
        kadansalgo(num);
    }
}
