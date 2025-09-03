public class Assignment {
    // Print the number of 7’s that are inthe 2d array
    public static int findCount(int arr[][], int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    count++;
                }
            }
        }
        return count;
    }

    // Print out the sum of the numbers inthe second row of the “nums” array.
    public static int calSum(int arr[][]) {
        int sum = 0;
        for (int j = 0; j < arr[0].length; j++) {
            sum += arr[1][j];
        }
        return sum;
    }

    // Write a program to Find Transpose of a Matrix.
    // n X n matrix
    public static void Transpose(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    };

    // n X m matrix
    public static int[][] matrix(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;

        int transposed[][] = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transposed[j][i] = arr[i][j];
            }
        }
        return transposed;
    }

    public static void print(int nums[][]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // 1
        int arr[][] = {
                { 4, 7, 8 },
                { 8, 8, 7 }
        };
        int key = 7;
        System.out.println(findCount(arr, key));
        // 2
        int[][] nums = {
                { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 }
        };
        System.out.println(calSum(nums));
        // 3
        Transpose(nums);
        print(nums);
        System.out.println();
        //
        int transposed[][] = matrix(arr);
        print(transposed);
    }
}
