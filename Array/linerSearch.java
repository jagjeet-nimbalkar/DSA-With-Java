
public class linerSearch {
    public static int linearSearch(int data[], int key) {
        for (int i = 1; i < data.length; i++) {
            if (data[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int data[] = { 1, 5, 8, 6, 4, 7, 9, 3, 2, 9 };
        int key = 9;
        int index = linearSearch(data, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println(index);
        }
    }
}
