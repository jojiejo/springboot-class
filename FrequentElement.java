import java.util.*;

public class FrequentElement {
    public static Map<String, Integer> getFrequentElement(ArrayList<String> arrayInput)
    {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String string : arrayInput) {
            if(map.keySet().contains(string)) map.put(string, map.get(string)+1);
            else map.put(string, 1);
        }

        return map;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayInput = new ArrayList<String>();

        System.out.println("Masukkan array (masukkan STOP untuk terminasi): ");
        while (scanner.hasNext()) {
            String givenString = scanner.nextLine();
            if (givenString.equalsIgnoreCase("STOP")) {
                break;
            }
            arrayInput.add(givenString);
        }
        scanner.close();
        Collections.sort(arrayInput);
        
        Map<String, Integer> map = getFrequentElement(arrayInput);

        System.out.println("Output");
        map.entrySet().stream()
            .sorted((k1, k2) -> k1.getValue().compareTo(k2.getValue()))
            .forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));
    }    
}   