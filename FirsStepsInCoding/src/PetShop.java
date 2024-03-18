import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dogsFoodPrice = 2.5;
        double catsFoodPrice = 4;

        int dogsFoodCount = Integer.parseInt(scanner.nextLine());
        int catsFoodCount = Integer.parseInt(scanner.nextLine());

        double totalSum = dogsFoodCount * dogsFoodPrice + catsFoodCount * catsFoodPrice;

        System.out.println(totalSum + " lv.");
    }
}