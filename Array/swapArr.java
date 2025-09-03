public class swapArr {
    public static void swap(int num[]) {
        int temp = num[0];
        num[0] = num[1];
        num[1] = temp;
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3 };
        System.out.println(num[0] + "," + num[1]);
        swap(num);
        System.out.print(num[0] + "," + num[1]);
    }
}