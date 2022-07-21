import java.util.*;

public class MoneyChange {
    public static List<Integer> changeMoney(int money){
        int[] fractions = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 1};
        List<Integer> fractionResult = new ArrayList<Integer>();

        while(money > 0){
            for(int fraction : fractions){
                if(money - fraction >= 0){
                    fractionResult.add(fraction);
                    money -= fraction;
                    break;
                }
            }
        }

        return fractionResult;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Uang: ");
        int money = scanner.nextInt();
        scanner.close();

        System.out.println("Output");
        System.out.println(changeMoney(money));
    }    
}   