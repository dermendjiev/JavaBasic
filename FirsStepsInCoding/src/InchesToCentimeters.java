import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inchMultiplier = 2.54;
        double inches = Double.parseDouble(scanner.nextLine());

        double centimeters = inches * inchMultiplier;

        System.out.println(centimeters);
    }
}
