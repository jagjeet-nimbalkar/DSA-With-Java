package DivideC;

public class MergeSort {
    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void mergeSort(int arr[], int idx, int ldx) {
        // base case
        if (idx >= ldx) {
            return;
        }
        // kaam
        int mid = idx + (ldx - idx) / 2;
        mergeSort(arr, idx, mid); // left
        mergeSort(arr, mid + 1, ldx); // right

        merge(arr, idx, ldx, mid);
    }

    static void merge(int arr[], int idx, int ldx, int mid) {
        // left(0,3)->4 & right(4,6)->3 -->7 size [6-0]+1=7
        int temp[] = new int[ldx - idx + 1];
        int i = idx; // left
        int j = mid + 1; // right
        int k = 0; // temp

        while (i <= mid && j <= ldx) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // left
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // right
        while (j <= ldx) {
            temp[k++] = arr[j++];
        }

        // copy temp to original
        for (k = 0, i = idx; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergeSort(arr, 0, arr.length - 1);
        print(arr);
    }
}
