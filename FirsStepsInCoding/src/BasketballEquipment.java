import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearsTax = Integer.parseInt(scanner.nextLine());

        double sneakersPrice = yearsTax * 0.6;
        double clothesPrice = sneakersPrice * 0.8;
        double ballPrice = clothesPrice / 4;
        double accessoryPrice = ballPrice / 5;

        double totalPrice = yearsTax + sneakersPrice + clothesPrice + ballPrice + accessoryPrice;

        System.out.println(totalPrice);
    }
}