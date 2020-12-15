import java.util.Scanner;

public class ReversedChars_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Character n1 = scanner.nextLine().charAt(0);
        Character n2 = scanner.nextLine().charAt(0);
        Character n3 = scanner.nextLine().charAt(0);

        System.out.printf("%c %c %c",n3,n2,n1);

    }
}
