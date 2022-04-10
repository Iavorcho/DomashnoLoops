import java.util.Scanner;
public class Zad1numbersInputLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chisloDoSto;

        System.out.printf("Please input numbers from 1 to 100.%nIf you enter 0 the sequence will end and you will receive the sum of all your numbers.");
        int sbor = 0;
        do {
            System.out.printf("%nPlease enter the number: ");
            chisloDoSto = scan.nextInt();
            sbor = sbor + chisloDoSto;
        }
        while(chisloDoSto != 0);
        System.out.println("The sum of your numbers is: " + sbor);
    }
}
