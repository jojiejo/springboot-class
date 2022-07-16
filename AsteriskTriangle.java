import java.util.Scanner;

public class AsteriskTriangle {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        int height = input.nextInt();
        input.close();
        
        System.out.println("Output: ");
        for(int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}   