import java.util.Scanner;

public class LowerOrUpper_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Character letter = scanner.nextLine().charAt(0);

        if (letter == Character.toUpperCase(letter)){
            System.out.println("upper-case");
        } else if (letter == Character.toLowerCase(letter)){
            System.out.println("lower-case");
        }
    }
}
