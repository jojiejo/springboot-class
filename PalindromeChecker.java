import java.util.Scanner;

public class PalindromeChecker {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan input: ");
        String stringGiven = input.nextLine();
        input.close();

        boolean palindromeState = true;
        int stringGivenLength = stringGiven.length();
        for(int i = 0; i < stringGivenLength/2; i++) {
            if (stringGiven.charAt(i) != stringGiven.charAt(stringGivenLength - 1 - i)) palindromeState = false;
        }

        if(palindromeState) System.out.println("Output: Palindrome");
        else System.out.println("Output: Bukan Palindrome");
    }    
}   