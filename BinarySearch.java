import java.util.*;

public class BinarySearch {
    public static int runBinarySearch(ArrayList<Integer> sortedArray, int key) {
        int index = -1;
        int low = 0;
        int high = sortedArray.size() -1;
        
        while (low <= high) {
            int mid = low  + ((high - low) / 2);
            if (sortedArray.get(mid) < key) low = mid + 1;
            else if (sortedArray.get(mid) > key) high = mid - 1;
            else if (sortedArray.get(mid) == key) {
                index = mid;
                break;
            }
        }

        return index;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        System.out.println("Masukkan daftar angka (masukkan angka minus untuk terminasi): ");
        while (scanner.hasNext()) {
            int givenInt = scanner.nextInt();
            if (givenInt < 0) {
                break;
            }
            numberList.add(givenInt);
        }
        Collections.sort(numberList);

        System.out.printf("Masukkan diameter nilai yang ingin dicari: ");
        int valueToSearch = scanner.nextInt();
        scanner.close();

        System.out.println("Output");
        System.out.println(runBinarySearch(numberList, valueToSearch));
    }    
}   