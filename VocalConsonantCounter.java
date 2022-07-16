import java.util.Scanner;

public class VocalConsonantCounter {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan input: ");
        String stringGiven = input.nextLine();
        input.close();

        int vocalCounter = 0;
        int consonantCounter = 0;     
        int totalCharacter = stringGiven.length();

        stringGiven = stringGiven.toLowerCase();
            
        for(int i = 0; i < totalCharacter; i++) {    
            if(stringGiven.charAt(i) == 'a' || 
                stringGiven.charAt(i) == 'e' || 
                stringGiven.charAt(i) == 'i' || 
                stringGiven.charAt(i) == 'o' || 
                stringGiven.charAt(i) == 'u')  
                vocalCounter++;      
            else if(stringGiven.charAt(i) >= 'a' && stringGiven.charAt(i) <= 'z' ) consonantCounter++;
        }

        System.out.println("Jumlah Vokal: " + vocalCounter);    
        System.out.println("Jumlah Konsonan: " + consonantCounter);
        System.out.println("Total Karakter: " + totalCharacter);   
    }    
}   