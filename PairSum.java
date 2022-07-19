import java.util.*;

public class PairSum {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        System.out.println("Masukkan array (masukkan angka minus untuk terminasi): ");
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            if (input < 0) {
                break;
            }
            arrayList.add(input);
        }
        System.out.println("Masukkan hasil dari penjumlahan: ");
        int target = scanner.nextInt();
        scanner.close();

        Collections.sort(arrayList);
        int lowerIndex = 0;
        int higherIndex = arrayList.size() - 1;

        while (lowerIndex < higherIndex)
        {
            if (arrayList.get(lowerIndex) + arrayList.get(higherIndex) == target)
            {
                System.out.println("Penjumlahan angka dari index " + lowerIndex + " dan " + higherIndex + " menghasilkan " + target + 
                    " : " + arrayList.get(lowerIndex) + "+" + arrayList.get(higherIndex) + "=" + target);
                return;
            }
 
            if (arrayList.get(lowerIndex) + arrayList.get(higherIndex) < target) lowerIndex++;
            else higherIndex--;
        }
    }    
}   