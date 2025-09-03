package Functions;

public class primeNo {
    // the number who's only devisible by 1 and only that number is called prime
    // number
    // for(i=2 to i=n-1){n%i==0 then not prime}

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
        // aptimized code
        // for(int i=2; i<=math.sqrt(num);i++){
        // if(n%2==0){
        // return false;
        // }
        // return=true;
        // }
    }

    public static void main(String[] args) {
        boolean result = isPrime(10);
        System.out.println(result);
    }
}
