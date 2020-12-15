import java.util.Scanner;

public class ConvertMetersToKilometers_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numbers = Integer.parseInt(scanner.nextLine());

        System.out.printf(" %.2f",(double)  numbers / 1000);
    }
}
