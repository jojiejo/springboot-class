import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class BuyMaxProduct {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> productPrices = new ArrayList<Integer>();

        System.out.println("Masukkan uang yang dimiliki: ");
        int money = scanner.nextInt();
        System.out.println("Masukkan array harga (masukkan angka minus untuk terminasi): ");
        while (scanner.hasNext()) {
            int givenNumber = scanner.nextInt();
            if (givenNumber < 0) {
                break;
            }
            productPrices.add(givenNumber);
        }
        scanner.close();
        Collections.sort(productPrices);
        
        int boughtItem = 0;
        for (Integer price : productPrices) { 		      
            if(money >= price) {
                boughtItem++;
                money = money - price;
            } else break;
       }

       System.out.println("Output");
       System.out.println("Barang yang bisa dibeli adalah sebanyak: " + boughtItem);
    }    
}   