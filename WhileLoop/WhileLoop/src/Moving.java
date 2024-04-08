import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int totalVolume = width * length * height;

        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            int packages = Integer.parseInt(command);

            totalVolume -= packages;

            if (totalVolume <= 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(totalVolume));
                break;
            }

            command = scanner.nextLine();
        }
        if (totalVolume > 0) {
            System.out.printf("%d Cubic meters left.", totalVolume);
        }
    }
}