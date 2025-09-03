package ArrayPart_II.Assignment;

//Given an integer array nums, return all the triplets [nums[i], nums[j],  nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.Notice that the solution set must not contain duplicate triplets
public class A3 {
    public static void solve(int arr[], int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {

            int currTarget = target - arr[i];

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currSum = arr[left] + arr[right];

                if (currSum == currTarget) {
                    System.out.println(i + " " + left + " " + right + "=" + target);
                    left++;
                    right--;
                } else if (currSum < currTarget) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        int target = 23;
        solve(arr, target);
    }
}
