'''Write a java program to print primes from 1 to 1000.'''
public class PrimeNumbers {

    public static void main(String[] args) {
        for (int num = 2; num <= 1000; num++) {
            boolean isPrime = true;

            
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            
            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}