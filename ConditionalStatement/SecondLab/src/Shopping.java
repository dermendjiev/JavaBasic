import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double discount = 0;
        double videoCardPrice = 250;
        double processorPrice = videoCards * videoCardPrice * 0.35;
        double ramPrice = videoCards * videoCardPrice * 0.1;

        double totalCost = videoCards * videoCardPrice + processors * processorPrice + ram * ramPrice;

        if (videoCards > processors) {
            discount = 0.15;
            totalCost = totalCost - totalCost * discount;
        }

        if (budget >= totalCost) {
            double leftMoney = budget - totalCost;
            System.out.printf("You have %.2f leva left!", leftMoney);
        } else {
            double neededMoney = totalCost - budget;
            System.out.printf("Not enough money! You need %.2f leva more!", neededMoney);
        }
    }
}