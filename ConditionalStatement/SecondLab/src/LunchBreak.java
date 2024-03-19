import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        int seriesTime = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = ((double) breakTime / 8);
        double relaxTime = ((double) breakTime / 4);

        double totalTime = seriesTime + lunchTime + relaxTime;

        if (totalTime > breakTime) {
            double neededTime = Math.ceil(totalTime - breakTime);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", seriesName, neededTime);
        } else {
            double leftTime = Math.ceil(breakTime - totalTime);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", seriesName, leftTime);
        }
    }
}