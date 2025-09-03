package Functions;

// print the prime number present before the number
public class listofPrime {
    public static boolean isPrime(int num) {
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeInrange(int num) {
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primeInrange(20);
    }
}
