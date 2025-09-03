import java.util.Arrays;

public class assgnQ4 {
    // Determine if 2 Strings are an anagrams of each other
    public static void anagram(String str1, String str2) {
        if (str1.length() == str2.length()) {
            char str1array[] = str1.toCharArray();
            char str2array[] = str2.toCharArray();

            Arrays.sort(str1array);
            Arrays.sort(str2array);

            boolean result = Arrays.equals(str1array, str2array);
            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams");
            } else {
                System.out.println("not anagrams");
            }
        } else {
            System.out.println("not an anagrams");
        }
    }

    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "hearts";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        anagram(str1, str2);
    }
}
