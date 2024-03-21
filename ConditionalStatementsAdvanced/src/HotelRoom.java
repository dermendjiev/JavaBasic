import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double nightPriceStudio = 0;
        double nightPriceApartment = 0;
        double totalPriceStudio = 0;
        double totalPriceApartment = 0;

        switch (month) {
            case "May":
            case "October":
                nightPriceStudio = 50;
                nightPriceApartment = 65;

                totalPriceStudio = nightPriceStudio * nights;
                totalPriceApartment = nightPriceApartment * nights;

                if (nights > 14) {
                    totalPriceStudio *= 0.7;
                    totalPriceApartment *= 0.9;
                } else if (nights > 7) {
                    totalPriceStudio *= 0.95;
                }

                break;
            case "June":
            case "September":
                nightPriceStudio = 75.20;
                nightPriceApartment = 68.70;

                totalPriceStudio = nightPriceStudio * nights;
                totalPriceApartment = nightPriceApartment * nights;

                if (nights > 14) {
                    totalPriceStudio *= 0.8;
                    totalPriceApartment *= 0.9;
                }
                break;
            case "July":
            case "August":
                nightPriceStudio = 76;
                nightPriceApartment = 77;

                totalPriceStudio = nightPriceStudio * nights;
                totalPriceApartment = nightPriceApartment * nights;

                if (nights > 14) {
                    totalPriceApartment *= 0.9;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.\n" +
                "Studio: %.2f lv.", totalPriceApartment, totalPriceStudio);
    }
}