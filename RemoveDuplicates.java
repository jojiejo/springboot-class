import java.util.*;

public class RemoveDuplicates {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<Integer>();

        System.out.println("Masukkan array pertama (masukkan angka minus untuk terminasi): ");
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            if (input < 0 ) {
                break;
            }
            hashSet.add(input);
        }
        scanner.close();

        System.out.println("Output: " + hashSet.size() + " : " + hashSet);
    }    
}   