import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pensPackPrice = 5.80;
        double markersPackPrice = 7.20;
        double cleanerPricePerLiter = 1.20;

        int pensPackageCount = Integer.parseInt(scanner.nextLine());
        int markersPackageCount = Integer.parseInt(scanner.nextLine());
        int cleanerLiters = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double pensPrice = pensPackPrice * pensPackageCount;
        double markersPrice = markersPackPrice * markersPackageCount;
        double cleanerPrice = cleanerPricePerLiter * cleanerLiters;

        double price = pensPrice + markersPrice + cleanerPrice;

        double totalPrice = price - price * discount / 100;

        System.out.println(totalPrice);
    }
}