import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ArrayMerge {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> firstArray = new ArrayList<String>();
        ArrayList<String> secondArray = new ArrayList<String>();

        System.out.println("Masukkan array pertama (masukkan STOP untuk terminasi): ");
        while (scanner.hasNext()) {
            String givenString = scanner.nextLine();
            if (givenString.equalsIgnoreCase("STOP")) {
                break;
            }
            firstArray.add(givenString);
        }

        System.out.println("Masukkan array kedua (masukkan STOP untuk terminasi): ");
        while (scanner.hasNext()) {
            String givenString = scanner.nextLine();
            if (givenString.equalsIgnoreCase("STOP")) {
                break;
            }
            secondArray.add(givenString);
        }
        scanner.close();

        HashSet<String> firstHashSet = new HashSet<String>(firstArray);
        HashSet<String> secondHashSet = new HashSet<String>(secondArray);
        HashSet<String> mergedHashSet = new HashSet<String>();
        mergedHashSet.addAll(firstHashSet);
        mergedHashSet.addAll(secondHashSet);

        System.out.println("Output: " + mergedHashSet);
    }    
}   