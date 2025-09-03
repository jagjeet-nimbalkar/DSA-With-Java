public class subArray {
    public static void subarr(int number[]) {
        for (int i = 0; i < number.length; i++) {
            int start = i;
            int sum = number[i];
            for (int j = i + 1; j < number.length; j++) {
                int end = j;
                sum = sum + number[j];
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                }
                System.out.print("= " + sum);
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int number[] = { 2, -4, 6, -8, 10 };
        subarr(number);
    }
}
