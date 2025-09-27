import java.util.Scanner;

public class Freebuz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Freebuz");
        } else if (number % 3 == 0) {
            System.out.println("Free");
        } else if (number % 5 == 0) {
            System.out.println("Buz");
        } else {
            System.out.println(number);
        }

        scanner.close();
    }

    
}
