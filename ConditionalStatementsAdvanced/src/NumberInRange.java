import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());

        if (num > 0 && num <= 100 || num < 0 && num >= -100) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}