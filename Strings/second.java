public class second {
    public static float sortpath(String path) {
        int n = path.length();
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            char dir = path.charAt(i);
            if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'W') {
                x--;
            } else {
                x++;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String args[]) {
        String path = "WNEENESENNNS";
        System.out.print(sortpath(path));
        System.out.println();

        // compare the strings
        String name = "abcd";
        String game = "abcd";
        String boom = new String("abcd");// this values are not same
        if (name == game) {
            System.out.println("both are same");
        }
        if (name == boom) {
            System.out.println("both are same");
        } else {
            System.out.println("not same");
        }
        // So
        if (name.equals(boom)) {
            System.out.println("both are same");
        }
    }
}