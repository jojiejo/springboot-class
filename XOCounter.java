import java.util.Scanner;

public class XOCounter {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan input: ");
        String stringGiven = input.nextLine();
        input.close();

        int xCounter = 0;
        int oCounter = 0;     
        int totalCharacter = stringGiven.length();
        stringGiven = stringGiven.toLowerCase();
            
        for(int i = 0; i < totalCharacter; i++) {    
            if(stringGiven.charAt(i) == 'x') xCounter++;      
            else if(stringGiven.charAt(i) == 'o') oCounter++;
        }

        if (xCounter == oCounter) System.out.println("Output: true");
        else System.out.println("Output: false") ;
    }    
}   