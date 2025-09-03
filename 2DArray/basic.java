// import java.util.Scanner;

// public class basic {
// public static boolean search(int matrix[][], int key) {
// for (int i = 0; i < matrix.length; i++) {
// for (int j = 0; j < matrix[0].length; j++) {
// if (matrix[i][j] == key) {
// System.out.print("found at " + i + " " + j);
// return true;
// }
// }
// }
// System.out.println("did not find the key");
// return false;
// }

// public static void find(int matrix[][]) {
// int maxNo = matrix[0][0];
// int rowIdx = -1;
// int colIdx = -1;
// for (int i = 0; i < matrix.length; i++) {
// for (int j = 0; j < matrix[0].length; j++) {
// if (maxNo < matrix[i][j]) {
// maxNo = matrix[i][j];
// rowIdx = i;
// colIdx = j;
// }
// }
// }
// System.out.print("maximum no is :" + maxNo + " at position " + (rowIdx + 1) +
// " " + (colIdx + 1));
// }

// public static void main(String[] args) {
// int matrix[][] = new int[3][3];
// int n = matrix.length;
// int m = matrix[0].length;
// Scanner sc = new Scanner(System.in);
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < m; j++) {
// matrix[i][j] = sc.nextInt();
// }
// }

// for (int i = 0; i < n; i++) {
// for (int j = 0; j < m; j++) {
// System.out.print(matrix[i][j] + " ");
// }
// System.out.println();
// }

// // search(matrix, 5);
// find(matrix);
// sc.close();
// }
// }