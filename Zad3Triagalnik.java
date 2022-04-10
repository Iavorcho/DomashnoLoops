import java.util.Scanner;
public class Zad3Triagalnik {
    public static void main(String[] args) {
        int size = 5;

        for (int n = size; n >= 0; --n) {
        //    System.out.print("Proverka" + (size - n) + " ");
            for (int z = 1; z <= n; ++z) {
                System.out.print(z + " ");
            }
            System.out.println();//С много проби и грешки все още не мога напълно да схвана какво се случва в цикъла.
        }

    }
}



