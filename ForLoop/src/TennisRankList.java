import java.util.Scanner;

public class TennisRankList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int winningPoints = 0;

        int wCount = 0;

        for (int i = 0; i < tournaments; i++) {
            String stage = scanner.nextLine();

            switch (stage) {
                case "W":
                    wCount ++;
                    winningPoints += 2000;
                    break;
                case "F":
                    winningPoints += 1200;
                    break;
                case "SF":
                    winningPoints += 720;
                    break;
            }
        }
        int totalPoints = startingPoints + winningPoints;
        double averagePoints = Math.floor((double) winningPoints / tournaments);
        double winningTournamentsPercent = (double) wCount / tournaments * 100;

        System.out.printf("Final points: %d%n", totalPoints);
        System.out.printf("Average points: %.0f%n", averagePoints);
        System.out.printf("%.2f%%", winningTournamentsPercent);
    }
}