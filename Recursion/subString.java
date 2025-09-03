package Recursion;

public class subString {
    public static int countStr(String str, int start, int end) {
        if (start == str.length()) {
            return 0;
        }
        if (end == str.length()) {
            return countStr(str, start + 1, start + 1);
        }
        int count = 0;
        if (str.charAt(start) == str.charAt(end)) {
            count = 1;
            System.out.println(str.substring(start, end + 1));
        }
        return count + countStr(str, start, end + 1);

    }

    public static void main(String[] args) {
        String str = "abcab";
        System.out.println(countStr(str, 0, 0));
    }
}
