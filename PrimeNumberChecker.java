import java.util.Scanner;

public class PrimeNumberChecker {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan input: ");
        int intGiven = input.nextInt();
        input.close();

        int divisibleCounter = 0;
        
        for(int i = 1; i <= intGiven; i++) {
            if (intGiven % i == 0) divisibleCounter++;
        }

        if(divisibleCounter == 2) System.out.println("Output: Bilangan Prima");
        else System.out.println("Output: Bukan Bilangan Prima");
    }    
}   