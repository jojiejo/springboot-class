import java.util.*;

public class DragonOfLoowater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> dragonHead = new ArrayList<Integer>();
        System.out.println("Masukkan diameter kepala naga (masukkan angka minus untuk terminasi): ");
        while (scanner.hasNext()) {
            int givenInt = scanner.nextInt();
            if (givenInt < 0) {
                break;
            }
            dragonHead.add(givenInt);
        }
        Collections.sort(dragonHead);

        ArrayList<Integer> knightHeight = new ArrayList<Integer>();
        System.out.println("Masukkan tinggi ksatria (masukkan angka minus untuk terminasi): ");
        while (scanner.hasNext()) {
            int givenInt = scanner.nextInt();
            if (givenInt < 0) {
                break;
            }
            knightHeight.add(givenInt);
        }
        Collections.sort(knightHeight);
        scanner.close();

        System.out.println("Output");
        int cost = 0, k = 0, h = 0;
        while (h < dragonHead.size() && k < knightHeight.size()) {
            if (dragonHead.get(h) <= knightHeight.get(k)) {
                cost += knightHeight.get(k);
                h++;
                k++;
            } else if (dragonHead.get(h) > knightHeight.get(k)) k++;
        }

        if (h < dragonHead.size()) System.out.println("knight fall");
        else System.out.println(cost);
    }    
}   