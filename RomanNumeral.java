import java.util.*;

public class RomanNumeral {
    public static String integerToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();

        for(int i = 0; i < values.length; i++) {
            while(num >= values[i]) {
                num -= values[i];
                roman.append(romanLiterals[i]);
            }
        }

        return roman.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Masukkan nilai yang ingin di-convert: ");
        int valueToConvert = scanner.nextInt();
        scanner.close();

        System.out.println("Output");
        System.out.println(integerToRoman(valueToConvert));
    }    
}   