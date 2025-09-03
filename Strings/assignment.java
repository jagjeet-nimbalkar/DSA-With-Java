import java.util.Scanner;

public class assignment {
    // Count how many times lowercase letter occurred in a String entered by the
    // user
    public static int count(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            while (i < str.length()) {
                if (str.charAt(i) == Character.toLowerCase(str.charAt(i)) && str.charAt(i) != ' ') {
                    count++;
                } else {
                    count += 0;
                }
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter text: ");
        String str = sc.nextLine();
        System.out.println(count(str));
        sc.close();
    }
}
