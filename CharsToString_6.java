import java.util.Scanner;

public class CharsToString_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Character n1 = scanner.nextLine().charAt(0);
        Character n2 = scanner.nextLine().charAt(0);
        Character n3 = scanner.nextLine().charAt(0);

        System.out.printf("%c%c%c",n1,n2,n3);
    }
}
