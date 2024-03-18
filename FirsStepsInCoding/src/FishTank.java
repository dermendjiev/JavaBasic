import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double totalVolumeCm = length * width * height;
        double totalVolume = totalVolumeCm / 1000;
        double waterVolume = totalVolume - totalVolume * percent / 100;

        System.out.println(waterVolume);
    }
}