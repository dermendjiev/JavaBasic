import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nylonPrice = 1.50;
        double paintPrice = 14.50;
        double paintThinnerPrice = 5;
        double extraBagPrice = 0.40;


        int nylon = Integer.parseInt(scanner.nextLine());
        int paintLiters = Integer.parseInt(scanner.nextLine());
        int paintThinnerLiters = Integer.parseInt(scanner.nextLine());
        int hoursWorking = Integer.parseInt(scanner.nextLine());

        double neededPaintLiters = paintLiters * 1.1;
        double neededNylon = nylon + 2;

        double materialsPrice = neededNylon * nylonPrice + neededPaintLiters * paintPrice + paintThinnerLiters * paintThinnerPrice + extraBagPrice;
        double totalRepaintingPrice = materialsPrice * 0.30 * hoursWorking + materialsPrice;

        System.out.println(totalRepaintingPrice);
    }
}