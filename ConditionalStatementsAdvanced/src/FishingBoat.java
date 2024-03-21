import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());

        double rent = 0;

        switch (season) {
            case "Spring":
                rent = 3000;
                if (fishers <= 6) {
                    rent *= 0.9;
                } else if (fishers <= 11) {
                    rent *= 0.85;
                } else {
                    rent *= 0.75;
                }

                if (fishers % 2 == 0){
                    rent *= 0.95;
                }
                break;
            case "Summer":
                rent = 4200;
                if (fishers <= 6) {
                    rent *= 0.9;
                } else if (fishers <= 11) {
                    rent *= 0.85;
                } else {
                    rent *= 0.75;
                }

                if (fishers % 2 == 0){
                    rent *= 0.95;
                }
                break;
            case "Autumn":
                rent = 4200;
                if (fishers <= 6) {
                    rent *= 0.9;
                } else if (fishers <= 11) {
                    rent *= 0.85;
                } else {
                    rent *= 0.75;
                }
                break;
            case "Winter":
                rent = 2600;
                if (fishers <= 6) {
                    rent *= 0.9;
                } else if (fishers <= 11) {
                    rent *= 0.85;
                } else {
                    rent *= 0.75;
                }

                if (fishers % 2 == 0){
                    rent *= 0.95;
                }
                break;
        }
        if (budget >= rent) {
            double leftMoney = budget - rent;
            System.out.printf("Yes! You have %.2f leva left.", leftMoney);
        } else {
            double neededMoney = rent - budget;
            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
        }
    }
}