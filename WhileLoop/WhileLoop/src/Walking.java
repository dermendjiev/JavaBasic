import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSteps = 0;
        boolean isGoal = false;

        String input = scanner.nextLine();

        while (!input.equals("Going home")) {
            int steps = Integer.parseInt(input);
            totalSteps += steps;
            if (totalSteps >= 10000) {
                isGoal = true;
                break;
            }
            input = scanner.nextLine();
        }

        if (input.equals("Going home")) {
            int stepsToHome = Integer.parseInt(scanner.nextLine());
            totalSteps += stepsToHome;
            if (totalSteps >= 10000) {
                isGoal = true;
            }
        }

        int diff = 0;

        if (isGoal) {
            diff = totalSteps - 10000;
            System.out.printf("Goal reached! Good job!\n" +
                    "%d steps over the goal!", diff);
        } else {
            diff = 10000 - totalSteps;
            System.out.printf("%d more steps to reach goal.", diff);
        }
    }
}