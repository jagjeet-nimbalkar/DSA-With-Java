package BitManuplation;

public class ithbitOperation {
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        return (n & bitMask) == 0 ? 0 : 1;
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }
    }

    public static int clearIBit(int n, int i) {
        int bitmask = (~0) << i;
        return n & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(8, 3)); // 1
        System.out.println(setIthBit(10, 1)); // 10
        System.out.println(clearIthBit(10, 1)); // 8
        System.out.println(updateIthBit(10, 2, 1)); // 14
        System.out.println(clearIBit(15, 2));
    }
}
