import java.util.*;

public class SimpleEquation {
    public static void calculateEquation(long A, long B, long C){
        int[] sign= {1,-1};
        for (long i = 0;i * i <= C ;i++) {
            for (long j = 0; i * i + j * j <= B; j++) {
                long k = (long) Math.sqrt(C - i * i - j * j);
                if (i * i + j * j + k * k != C) continue;
                long multiply = i * j * k;
                if (multiply != Math.abs(B)) continue;
                for (int signA: sign) {
                    for (int signB: sign) {
                        for (int signC: sign) {
                            if (signA * i == signB * j || signA * i == signC * k || signB * j == signC * k) continue;
                            long sum = signA * i + signB * j + signC * k;
                            multiply = signA * i * signB * j * signC * k;
                            if (sum == A && multiply == B) {
                                System.out.println(i * signA+ " " + j * signB + " " + k * signC);
                                return;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("No solution.");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan A: ");
        long A = scanner.nextLong();
        System.out.print("Masukkan B: ");
        long B = scanner.nextLong();
        System.out.print("Masukkan C: ");
        long C = scanner.nextLong();
        scanner.close();

        System.out.println("Output");
        calculateEquation(A, B, C);
    }    
}   