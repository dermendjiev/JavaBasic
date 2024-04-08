import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        int pieces = rows * cols;
        boolean isFinished = false;

        String command = scanner.nextLine();

        while (!command.equals("STOP")) {
            int takenPieces = Integer.parseInt(command);

            pieces -= takenPieces;

            if (pieces <= 0) {
                isFinished = true;
                break;
            }
            command = scanner.nextLine();
        }

        if (isFinished) {
            int neededPieces = Math.abs(pieces);
            System.out.printf("No more cake left! You need %d pieces more.", neededPieces);
        } else {
            System.out.printf("%d pieces are left.", pieces);
        }
    }
}