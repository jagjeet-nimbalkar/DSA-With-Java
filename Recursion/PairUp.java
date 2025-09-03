package Recursion;

public class PairUp {

    public static int FriendsPairing(int n) {

        // base case
        if (n == 1 || n == 2) {
            return n;
        }
        // single
        int fnm1 = FriendsPairing(n - 1);
        // pair
        int fnm2 = FriendsPairing(n - 2);
        // paires ways
        int Pairs = (n - 1) * fnm2;

        //
        int total = fnm1 + Pairs;

        return total;

    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(FriendsPairing(n));
    }
}
