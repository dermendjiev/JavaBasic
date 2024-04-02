import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        double currentGiftSum = 10;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                sum += currentGiftSum;
                currentGiftSum += 10;
                sum -= 1;
            } else {
                sum += toyPrice;
            }
        }

        if (sum >= washingMachinePrice) {
            double leftMoney = sum - washingMachinePrice;
            System.out.printf("Yes! %.2f", leftMoney);
        } else {
            double neededMoney = washingMachinePrice - sum;
            System.out.printf("No! %.2f", neededMoney);
        }
    }
}