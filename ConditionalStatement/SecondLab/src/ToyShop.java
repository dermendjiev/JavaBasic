import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double puzzlePrice = 2.60;
        double dollPrice = 3;
        double bearPrice = 4.10;
        double minionPrice = 8.20;
        double truckPrice = 2;

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollCount = Integer.parseInt(scanner.nextLine());
        int bearCount = Integer.parseInt(scanner.nextLine());
        int minionCount = Integer.parseInt(scanner.nextLine());
        int truckCount = Integer.parseInt(scanner.nextLine());

        double discount = 0;
        int totalToyCount = puzzleCount + dollCount + bearCount + minionCount + truckCount;
        if (totalToyCount >= 50) {
            discount = 0.25;
        }

        double price = puzzleCount * puzzlePrice + dollCount * dollPrice + bearCount * bearPrice + minionCount * minionPrice + truckCount * truckPrice;
        double orderPrice = price - price * discount;

        double totalMoney = orderPrice * 0.9;

        if (totalMoney >= tripPrice) {
            double leftMoney = totalMoney - tripPrice;
            System.out.printf("Yes! %.2f lv left.", leftMoney);
        } else {
            double neededMoney = tripPrice - totalMoney;
            System.out.printf("Not enough money! %.2f lv needed.", neededMoney);
        }
    }
}