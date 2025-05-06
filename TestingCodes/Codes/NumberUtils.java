package TestingCodes.Codes;

public class NumberUtils {
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isPrime(int n) {
        if(n < 1 ) {
            return false;
        }
        for(int i = 2; i < Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
