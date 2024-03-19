import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statistsCount = Integer.parseInt(scanner.nextLine());
        double clothsCost = Double.parseDouble(scanner.nextLine());

        double decorCost = budget * 0.1;
        double totalClothesCost = statistsCount * clothsCost;

        if (statistsCount > 150) {
            totalClothesCost = totalClothesCost * 0.9;
        }

        double filmCost = decorCost + totalClothesCost;

        if (filmCost > budget) {
            double neededMoney = filmCost - budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", neededMoney);
        } else {
            double leftMoney = budget - filmCost;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", leftMoney);
        }
    }
}