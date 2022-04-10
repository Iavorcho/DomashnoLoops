import java.util.Scanner;
public class Zad2Factorials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long factorial = 1;
        int numberEntered;
        System.out.println("Please enter number: ");
        numberEntered = scanner.nextInt();

                if (numberEntered < 100 && numberEntered > 0 ){
                   for (int i = 1;
                        i <= numberEntered;
                        ++i){
                       factorial = factorial* i;}
                    System.out.println("1The factorial of the number you entered is: " + factorial);
                }
                else if (numberEntered <= 0)
                {
                    System.out.println("Please enter a positive number");
                }
                else if (numberEntered >100)
                {
                    System.out.println("Please enter a number smaller than 100");
                }

                }
            }







