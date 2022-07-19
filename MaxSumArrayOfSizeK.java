import java.util.*;

public class MaxSumArrayOfSizeK {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        System.out.println("Masukkan array (masukkan angka minus untuk terminasi): ");
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            if (input < 0 ) {
                break;
            }
            arrayList.add(input);
        }
        System.out.println("Masukkan banyak elemen yang akan dijumlahkan: ");
        int elementCount = scanner.nextInt();
        scanner.close();

        int maxResult = 0;
        for (int i = 0; i <= arrayList.size() - elementCount; i++) {
            int currentResult = 0;
            for (int j = i; j < i + elementCount; j++) {
                currentResult += arrayList.get(j);
            }
            maxResult = Math.max(maxResult, currentResult);
        }

        System.out.println("Output: " + maxResult);
    }    
}   