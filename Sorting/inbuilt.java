package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class inbuilt {
    public static void main(String[] args) {
        Integer arr[] = { 2, 5, 9, 87, 63, 1, 4 };
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
