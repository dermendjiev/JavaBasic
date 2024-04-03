import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        int daysCount = 0;
        int spendDaysCount = 0;
        boolean isSave = true;

        while (vacationPrice > availableMoney) {
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            if (command.equals("spend")) {
                availableMoney -= money;
                if (availableMoney < 0) {
                    availableMoney = 0;
                }
                daysCount++;
                spendDaysCount++;
                if (spendDaysCount >= 5) {
                    isSave = false;
                    break;
                }
            } else if (command.equals("save")) {
                availableMoney += money;
                daysCount++;
                if (availableMoney >= vacationPrice) {
                    break;
                }
                spendDaysCount = 0;
            }
        }
        if (isSave) {
            System.out.printf("You saved the money for %d days.", daysCount);
        } else {
            System.out.printf("You can't save the money. %n%d", daysCount);
        }

    }
}
