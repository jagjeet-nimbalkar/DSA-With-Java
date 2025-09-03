public class third {
   public static String subString(String str, int sid, int lid) {
      String substr = "";
      for (int i = sid; i < lid; i++) {
         substr += str.charAt(i);
      }
      return substr;
   }

   public static String check(String fruits[]) {
      String largest = fruits[0];
      for (int i = 1; i < fruits.length; i++) {
         if (largest.compareToIgnoreCase(fruits[i]) < 0) { // compareTO()-used to check largest word by
                                                           // lexicographically
            largest = fruits[i];
         }
      }
      return largest;
   }

   public static void main(String[] args) {
      String name = "helloworld";
      System.out.println(subString(name, 0, 6));
      // inbuilt
      System.out.println(name.substring(0, 5));

      String fruits[] = { "applE", "Mango", "banana" };
      System.out.println(check(fruits));
   }
}
