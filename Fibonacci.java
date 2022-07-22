import java.util.Scanner;

public class Fibonacci {    
    static int getFibbonaci(int n) {
        int[] fibArr = new int[n+1];
        fibArr[1] = 1;
        for (int i = 2; i <= n; i++){
            fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
        }
        return fibArr[n];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan input: ");
        int intGiven = input.nextInt();
        input.close();

        System.out.println("Output :" + getFibbonaci(intGiven));
    }    
}   