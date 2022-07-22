import java.util.Scanner;

public class Fibonacci {    
    static int getFibbonaci(int n) {
        if (n <= 1) return n;
        return getFibbonaci(n - 1) + getFibbonaci(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan input: ");
        int intGiven = input.nextInt();
        input.close();

        System.out.println("Output :" + getFibbonaci(intGiven));
    }    
}   