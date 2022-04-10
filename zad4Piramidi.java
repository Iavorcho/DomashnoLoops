import java.util.Scanner; // Прекрасна пирамида, но директно преписана.
public class zad4Piramidi {
    public static void main(String[] args) {
        int size;
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        size = scan.nextInt();
        for(int i = size; i >= 1; --i) {
            for(int space = 1; space <= size - i; ++space) {
                System.out.print("  ");
            }

            for(int j=i; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }

            for(int j = 0; j < i - 1; ++j) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}