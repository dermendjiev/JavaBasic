import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String holidayType = "";
        double cost = 0;


        switch (season) {
            case "summer":
                if (budget <= 100){
                    destination = "Bulgaria";
                    holidayType = "Camp";
                    cost = budget * 0.3;
                } else if (budget <= 1000) {
                    destination = "Balkans";
                    holidayType = "Camp";
                    cost = budget * 0.4;
                } else {
                    destination = "Europe";
                    holidayType = "Hotel";
                    cost = budget * 0.9;
                }
                break;
            case "winter":
                if (budget <= 100){
                    destination = "Bulgaria";
                    holidayType = "Hotel";
                    cost = budget * 0.7;
                } else if (budget <= 1000) {
                    destination = "Balkans";
                    holidayType = "Hotel";
                    cost = budget * 0.8;
                } else {
                    destination = "Europe";
                    holidayType = "Hotel";
                    cost = budget * 0.9;
                }
                break;
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", holidayType, cost);
    }
}