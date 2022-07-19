import java.util.*;

public class UniqueArray {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> firstArray = new ArrayList<Integer>();
        ArrayList<Integer> secondArray = new ArrayList<Integer>();

        System.out.println("Masukkan array pertama (masukkan angka minus untuk terminasi): ");
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            if (input < 0 ) {
                break;
            }
            firstArray.add(input);
        }

        System.out.println("Masukkan array kedua (masukkan angka minus untuk terminasi): ");
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            if (input < 0 ) {
                break;
            }
            secondArray.add(input);
        }
        scanner.close();

        ArrayList<Integer> uniqueNumbers = new ArrayList<Integer>();
        for (int i = 0; i < firstArray.size(); i++){
            if(!secondArray.contains(firstArray.get(i))) uniqueNumbers.add(firstArray.get(i));
        }

        System.out.println("Output: " + uniqueNumbers);
    }    
}   