import java.util.Scanner;

public class Factorization {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan input: ");
        int intGiven = input.nextInt();
        input.close();
        
        System.out.println("Output: ");
        for(int i = 1; i <= intGiven; i++) {
            if (intGiven % i == 0) System.out.println(i);
        }
    }    
}   