import java.util.Scanner;
import java.util.ArrayList;

public class PrimeNumberChecker {    
    static boolean isPrime(int n){
        if(n==1||n==0)return false;
        for(int i=2; i<n; i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static ArrayList<Integer> populatePrimeNumber(int limit){
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        int i = 1;
        while(primeNumbers.size() <= limit){
            if(isPrime(i)) primeNumbers.add(i);
            i++;
        }
        return primeNumbers;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan input: ");
        int intGiven = input.nextInt();
        input.close();

        ArrayList<Integer> primeNumbers = new ArrayList<Integer>(populatePrimeNumber(intGiven));
        System.out.println("Urutan ke-" + intGiven + " dalam bilangan prima adalah " + primeNumbers.get(intGiven - 1));
    }    
}   