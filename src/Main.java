import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = myScanner.nextInt();

        if (num < 0) {
            System.out.println("That's not positive!");
            System.exit(1);
        } else if (num >= 0) {
            if ((num % 5 == 0) || (num % 7 == 0)) {
                if (num % 5 == 0) {
                    System.out.println("Divisible by 5!");
                } else {
                    System.out.println("Divisible by 7!");
                }
            } else if ((num % 5 == 0) && (num % 7 ==0)) {

            }

        }

    }
}
