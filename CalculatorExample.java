import java.util.*;

class Calculator {
    private float firstValue;
    private float secondValue;

    public Calculator(float firstValue, float secondValue){
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public float add(){
        return firstValue + secondValue;
    }

    public float subtract(){
        return firstValue - secondValue;
    }

    public float multiply(){
        return firstValue * secondValue;
    }

    public float divide(){
        return firstValue / secondValue;
    }
}

public class CalculatorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("+++++++++++++++++ CALCULATOR +++++++++++++++++");
        System.out.println("1: Open Calculator");
        System.out.println("99: Exit");

        System.out.print("Masukkan pilihan anda: ");
        int firstInput = scanner.nextInt();
        if(firstInput == 99) System.exit(0);

        System.out.println("+++++++++++++++++ CALCULATOR +++++++++++++++++");
        System.out.print("Masukkan value 1: ");
        float secondInput = scanner.nextInt();
        System.out.print("Masukkan value 2: ");
        float thirdInput = scanner.nextInt();

        System.out.println("+++++++++++++++++ CALCULATOR +++++++++++++++++");
        System.out.println("Masukkan operasi: ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Masukkan pilihan anda: ");
        int fourthInput = scanner.nextInt();
        scanner.close();

        Calculator objCalculator = new Calculator(secondInput, thirdInput);
        switch(fourthInput) {
            case 1:
                System.out.println("Hasil: " + objCalculator.add());
                break;
            case 2:
                System.out.println("Hasil: " + objCalculator.subtract());
                break;
            case 3:
                System.out.println("Hasil: " + objCalculator.multiply());
                break;
            case 4:
                System.out.println("Hasil: " + objCalculator.divide());
                break;
            default:
                System.out.println("Hasil tidak terdefinisi, anda tidak memasukkan pilihan operasi yang benar");
        }
    }
}
