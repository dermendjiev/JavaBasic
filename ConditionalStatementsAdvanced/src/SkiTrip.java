import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String grade = scanner.nextLine();

        double price = 0;

        switch (room) {
            case "room for one person":
                price = (days - 1) * 18;
                break;
            case "apartment":
                price = (days - 1) * 25;
                if (days < 10) {
                    price *= 0.7;
                } else if (days <= 15) {
                    price *= 0.65;
                } else {
                    price *= 0.5;
                }
                break;
            case "president apartment":
                price = (days - 1) * 35;
                if (days < 10) {
                    price *= 0.9;
                } else if (days <= 15) {
                    price *= 0.85;
                } else {
                    price *= 0.8;
                }
                break;
        }
        if (grade.equals("positive")) {
            price *= 1.25;
        } else if (grade.equals("negative")) {
            price *= 0.9;
        }
        System.out.printf("%.2f", price);
    }
}