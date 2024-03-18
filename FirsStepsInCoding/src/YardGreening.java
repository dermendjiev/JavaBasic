import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double squareMeters = Double.parseDouble(scanner.nextLine());

        double pricePerSqMeter = 7.61;
        double discount = 0.18;

        double price = squareMeters * pricePerSqMeter;
        double totalDiscount = price * discount;

        double totalPrice = price - totalDiscount;

        System.out.println("The final price is: " + totalPrice + " lv.");
        System.out.println("The discount is: " + totalDiscount + " lv.");
    }
}