import java.util.*;

public class UniqueNumbers {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan input: ");
        String stringGiven = scanner.nextLine();
        scanner.close();

        HashSet<Character> hashSet = new HashSet<Character>();
        for (int i = 0; i < stringGiven.length(); i++) {
            char currentChar = stringGiven.charAt(i);
            hashSet.add(currentChar);
        }

        Iterator<Character> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Character currentCharacter = iterator.next();
            int count = 0;
            for(int i = 0; i < stringGiven.length(); i++) {
                if(stringGiven.charAt(i) == currentCharacter) count++;
            }
            if(count > 1) iterator.remove();
        }

        System.out.println("Output: " + hashSet);
    }    
}   