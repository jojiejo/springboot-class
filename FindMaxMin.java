import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class FindMaxMin {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        System.out.println("Masukkan array pertama (masukkan 99999 untuk terminasi): ");
        while (scanner.hasNext()) {
            int givenNumber = scanner.nextInt();
            if (givenNumber >= 99999) {
                break;
            }
            arrayList.add(givenNumber);
        }
        scanner.close();

        System.out.println("Output");
        int max = Collections.max(arrayList);
        int min = Collections.min(arrayList);
        System.out.println("Maximum: " + max);
        System.out.println("Maximum Index: " + arrayList.indexOf(max));
        System.out.println("Minimum: " + min);
        System.out.println("Minimum Index: " + arrayList.indexOf(min));
    }    
}   