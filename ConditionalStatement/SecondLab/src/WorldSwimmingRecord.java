import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        double additionalTime = Math.floor(meters / 15) * 12.5;
        double timeToSwim = meters * secondsPerMeter;

        double totalTime = timeToSwim + additionalTime;

        if (totalTime < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            double extraTime = totalTime - record;
            System.out.printf("No, he failed! He was %.2f seconds slower.", extraTime);

        }
        System.out.println();
    }
}