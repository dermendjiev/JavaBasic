import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depositSum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double rate = Double.parseDouble(scanner.nextLine()) / 100;

        double sum = depositSum  + months * ((depositSum * rate ) / 12);

        System.out.println(sum);
    }
}