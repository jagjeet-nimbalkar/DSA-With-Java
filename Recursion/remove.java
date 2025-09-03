package Recursion;

// remove duplicates from string
public class remove {
    public static void remove2(String str, int idx, StringBuilder newstr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }
        // kaam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            remove2(str, idx + 1, newstr, map);
        } else {
            map[currChar - 'a'] = true;
            remove2(str, idx + 1, newstr.append(currChar), map);
        }

    }

    public static void main(String[] args) {
        String text = "appnnacollage";
        remove2(text, 0, new StringBuilder(""), new boolean[26]);
    }
}