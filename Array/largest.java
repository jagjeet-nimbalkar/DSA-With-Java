public class largest {
    public static int largests(int arr[]) {

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println("samllest value is :" + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 9, 6, 3, 45 };
        int largeNo = largests(arr);
        System.out.println(largeNo + " ");

    }

}
