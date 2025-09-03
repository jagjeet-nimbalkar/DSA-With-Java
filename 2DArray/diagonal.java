public class diagonal {
    public static int sum(int martix[][]) {
        int sum = 0;
        // for (int i = 0; i <= martix.length; i++) {
        // for (int j = 0; j < martix[0].length; j++) {
        // if (i == j) {
        // sum += martix[i][j];
        // } else if (i + j == martix.length - 1) {
        // sum += martix[i][j];
        // }
        // }
        // }

        for (int i = 0; i < martix.length; i++) {
            sum += martix[i][i];
            //
            if (i != martix.length - 1 - i)
                sum += martix[i][martix.length - 1 - i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int martix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        System.out.println(sum(martix));
    }
}
