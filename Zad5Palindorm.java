import java.util.Scanner;
public class Zad5Palindorm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputWord;
        String StringForManipulation;
        String mirroredString;
        int compareStrings;

        System.out.println("Please enter a word: ");
        inputWord = scanner.next();
        StringBuilder sb = new StringBuilder(inputWord);
        mirroredString = sb.reverse().toString();

        compareStrings = inputWord.compareToIgnoreCase(mirroredString);

        System.out.println(mirroredString); // Visual check :)
        if (compareStrings == 0){
            System.out.println("The word is a palindrome");
        } else {
            System.out.println("The word is NOT a palindrome");

        }





    }
}
