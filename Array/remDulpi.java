public class remDulpi {
    // form unsorted array
    public static int remove(int arr[]) {
        int n = arr.length;
        int idx = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < idx; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr[idx] = arr[i];
                idx++;
            }
        }
        return idx;
    }

    // from sorted array
    public static void removeSort(int arr[]) {
        int n = arr.length;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[idx] != arr[i]) {
                idx++;
                arr[idx] = arr[i];
            }
        }
        for (int i = 0; i < idx + 1; i++) {
            System.out.print(arr[i] + " ");
        }
        ;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 9, 3, 1, 3, 5, 9 };
        int k = remove(arr);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int arr2[] = { 1, 1, 2, 4, 6, 6, 8 };
        removeSort(arr2);
    }
}
