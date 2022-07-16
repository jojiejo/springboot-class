public class VocalConsonantCounter {    
    public static void main(String[] args) {    
        int vocalCounter = 0;
        int consonantCounter = 0;     
        String stringGiven = "Alterra Indonesia"; 
        stringGiven = stringGiven.toLowerCase();
        int totalCharacter = stringGiven.length();  
            
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