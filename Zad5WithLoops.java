import java.util.Scanner;
public class Zad5WithLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputWord;
        String mirroredString = "";
        int compareStrings;

        System.out.println("Please enter a word: ");
        inputWord = scanner.next();
        for (int i  = inputWord.length() - 1; i >= 0; i-- ){
        mirroredString = mirroredString + inputWord.charAt(i);
        }
        compareStrings = inputWord.compareToIgnoreCase(mirroredString);

        System.out.println(mirroredString); // Visual check :)
        if (compareStrings == 0){
            System.out.println("The word is a palindrome");
        } else {
            System.out.println("The word is NOT a palindrome");

        }
    }
}