import java.util.Scanner;

public class ExponentCalculator {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan x: ");
        int x = input.nextInt();
        System.out.print("Masukkan n: ");
        int n = input.nextInt();
        input.close();

        int exponentialResult = 1;
        if(x == 0) {
            System.out.println("Output: 0");
            return;
        }
        
        for(int i = 1; i <= n; i++) {
            exponentialResult *= x;
        }

        System.out.println("Output: " + exponentialResult);
    }    
}   