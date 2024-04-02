import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupsCount = Integer.parseInt(scanner.nextLine());

        int totalClimbersCount = 0;

        int musalaClimbers = 0;
        int monBlancClimbers = 0;
        int kilimanjaroClimbers = 0;
        int k2Climbers = 0;
        int everestClimbers = 0;

        for (int i = 0; i < groupsCount; i++) {
            int climbersCount = Integer.parseInt(scanner.nextLine());

            totalClimbersCount += climbersCount;

            if (climbersCount <= 5) {
                musalaClimbers += climbersCount;
            } else if (climbersCount <= 12) {
                monBlancClimbers += climbersCount;
            } else if (climbersCount <= 25) {
                kilimanjaroClimbers += climbersCount;
            } else if (climbersCount <= 40) {
                k2Climbers += climbersCount;
            } else {
                everestClimbers += climbersCount;
            }

        }

        double musalaPercent = ((double) musalaClimbers / totalClimbersCount) * 100;
        double monBlancPercent = ((double) monBlancClimbers / totalClimbersCount) * 100;
        double kilimanjaroPercent = ((double) kilimanjaroClimbers / totalClimbersCount) * 100;
        double k2Percent = ((double) k2Climbers / totalClimbersCount) * 100;
        double everestPercent = ((double) everestClimbers / totalClimbersCount) * 100;

        System.out.printf("%.2f%%\n" +
                "%.2f%%\n" +
                "%.2f%%\n" +
                "%.2f%%\n" +
                "%.2f%%", musalaPercent, monBlancPercent, kilimanjaroPercent, k2Percent, everestPercent);
    }
}