import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0;

        switch (product) {
            case "coffee":
                if (town.equals("Sofia")) {
                    price = quantity * 0.5;
                } else if (town.equals("Plovdiv")) {
                    price = quantity * 0.4;
                } else if (town.equals("Varna")) {
                    price = quantity * 0.45;
                }
                break;
            case "water":
                if (town.equals("Sofia")) {
                    price = quantity * 0.8;
                } else if (town.equals("Plovdiv")) {
                    price = quantity * 0.7;
                } else if (town.equals("Varna")) {
                    price = quantity * 0.7;
                }
                break;
            case "beer":
                if (town.equals("Sofia")) {
                    price = quantity * 1.2;
                } else if (town.equals("Plovdiv")) {
                    price = quantity * 1.15;
                } else if (town.equals("Varna")) {
                    price = quantity * 1.1;
                }
                break;
            case "sweets":
                if (town.equals("Sofia")) {
                    price = quantity * 1.45;
                } else if (town.equals("Plovdiv")) {
                    price = quantity * 1.3;
                } else if (town.equals("Varna")) {
                    price = quantity * 1.35;
                }
                break;
            case "peanuts":
                if (town.equals("Sofia")) {
                    price = quantity * 1.6;
                } else if (town.equals("Plovdiv")) {
                    price = quantity * 1.5;
                } else if (town.equals("Varna")) {
                    price = quantity * 1.55;
                }
                break;
        }
        System.out.println(price);
    }
}