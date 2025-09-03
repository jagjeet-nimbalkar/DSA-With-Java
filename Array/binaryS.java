public class binaryS {
    public static int search(int arr[], int no) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == no) {
                return mid;
            }
            if (arr[mid] < no) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int no = 2;
        System.out.println("index for no is " + search(arr, no));
    }
}