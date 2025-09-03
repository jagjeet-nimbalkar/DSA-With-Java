package Functions;

// binary to decimal
public class decimalConv {
    public static void decConv(int n) {
        int binNo = n;
        int decimal = 0;
        int power = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            decimal = decimal + (lastdigit * (int) Math.pow(2, power));
            power++;
            n = n / 10;
        }
        System.out.println("decimal of " + binNo + "=" + decimal);
    }

    // decimal to binary
    public static void dectobin(int decno) {
        int decimal = decno;
        int power = 0;
        int binno = 0;
        while (decno > 0) {
            int reminder = decno % 2;
            binno = binno + (reminder * (int) Math.pow(10, power));
            power++;
            decno = decno / 2;
        }
        System.out.println("binary no of " + decimal + " is = " + binno);
    }

    public static void main(String[] args) {
        int binNo = 101;
        decConv(binNo);
        dectobin(7);
    }
}
