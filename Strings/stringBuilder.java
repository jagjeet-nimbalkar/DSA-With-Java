public class stringBuilder {
    // convert the first letter to uppercase
    public static void toUpercase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (char i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i <= str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }

    // compress the string aaabbcc=a3b2c2
    public static String compress(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);

            if (count > 1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("");
        for (char i = 'a'; i <= 'z'; i++) {
            str.append(i);
        }
        System.out.println(str);
        String quote = "hi, i am jaggu";
        toUpercase(quote);

        //
        String strgs = "aaabbcccd";
        System.out.println(compress(strgs));
    }
}
