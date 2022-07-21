public class PrimeNumber {
    public static boolean checkPrimeNumber(long number, long divisor) {
        if (number < 2) return false;
        if (number % 2 == 0) return (number == 2);
        if (number * divisor > number) return true;
        if (number % divisor == 0) return false;
    
        return checkPrimeNumber(number, divisor + 1);
    }

    public static boolean primeNumber(long n) {
        return checkPrimeNumber(n, 2);
    }
     
    public static void main(String[] args)
    {
        System.out.println("1000000007 is prime number? " + primeNumber(1000000007));
        System.out.println("13 is prime number? " + primeNumber(13));
        System.out.println("17 is prime number? " + primeNumber(17));
        System.out.println("20 is prime number? " + primeNumber(20));
        System.out.println("35 is prime number? " + primeNumber(35));

    }
}
