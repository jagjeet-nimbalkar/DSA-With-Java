package ArrayPart_II.Assignment;

public class A2 {
    // You are given an array prices where prices[i] is the price of a given stock
    // on the ith day.Return the maximum profit you can achieve from this
    // transaction. If you cannot achieve any profit, return 0

    public static int solve(int prices[]) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int price[] = { 7, 6, 4, 3, 1 };
        System.out.println(solve(price));
    }
}
