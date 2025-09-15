package DivideC;

public class QuickSort {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int idx, int ldx) {
        if (idx >= ldx) {
            return;
        }

        int Pidx = partition(arr, idx, ldx);
        quickSort(arr, idx, Pidx - 1); // left
        quickSort(arr, Pidx + 1, ldx); // right
    }

    public static int partition(int arr[], int idx, int ldx) {
        int pivot = arr[ldx];
        int i = idx - 1; // make place for element smaller that pivote

        for (int j = idx; j < ldx; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pivot;
        arr[ldx] = arr[i];
        arr[i] = temp;
        return i;

    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        quickSort(arr, 0, arr.length - 1);
        print(arr);
    }
}
