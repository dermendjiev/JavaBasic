import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double chickenMenuPrice = 10.35;
        double fishMenuPrice = 12.40;
        double vegMenuPrice = 8.15;
        double deliveryPrice = 2.50;

        int chickenMenuCount = Integer.parseInt(scanner.nextLine());
        int fishMenuCount = Integer.parseInt(scanner.nextLine());
        int vegMenuCount = Integer.parseInt(scanner.nextLine());

        double menusPrice = chickenMenuCount * chickenMenuPrice + fishMenuCount * fishMenuPrice + vegMenuCount * vegMenuPrice;
        double dessertPrice = menusPrice * 0.2;

        double totalPrice = menusPrice + dessertPrice + deliveryPrice;

        System.out.println(totalPrice);
    }
}