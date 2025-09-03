package Recursion;

// Imp
// Given a "2 x n" board and tiles of size "2 x 1", count the number of ways to tile the given board using the 2 x 1 tiles.
// (A tile can either be placed horizontally or vertically.)
public class Tiles {
    public static int find(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int vertical = find(n - 1);
        int horizontal = find(n - 2);

        int total = vertical + horizontal;
        return total;
    }

    public static void main(String[] args) {
        System.out.println(find(5));
    }
}
