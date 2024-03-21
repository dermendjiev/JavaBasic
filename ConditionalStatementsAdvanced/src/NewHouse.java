import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double finalPrice = 0;

        switch (flowerType) {
            case "Roses":
                if (flowerCount > 80) {
                    finalPrice = flowerCount * 5 * 0.9;
                } else {
                    finalPrice = flowerCount * 5;
                }
                break;
            case "Dahlias":
                if (flowerCount > 90) {
                    finalPrice = flowerCount * 3.8 * 0.85;
                } else {
                    finalPrice = flowerCount * 3.8;
                }
                break;
            case "Tulips":
                if (flowerCount > 80) {
                    finalPrice = flowerCount * 2.8 * 0.85;
                } else {
                    finalPrice = flowerCount * 2.8;
                }
                break;
            case "Narcissus":
                if (flowerCount < 120) {
                    finalPrice = flowerCount * 3 * 1.15;
                } else {
                    finalPrice = flowerCount * 3;
                }
                break;
            case "Gladiolus":
                if (flowerCount < 80) {
                    finalPrice = flowerCount * 2.5 * 1.2;
                } else {
                    finalPrice = flowerCount * 2.5;
                }
                break;
        }
        if (budget >= finalPrice) {
            double moneyLeft = budget - finalPrice;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, moneyLeft);
        } else {
            double neededMoney = finalPrice - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
        }
    }
}