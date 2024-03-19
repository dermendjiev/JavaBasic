import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int seconds = Integer.parseInt(scanner.nextLine());

        int newSeconds = seconds + 15;
        int newHours = hours;
        if (newSeconds > 59) {
            newSeconds = newSeconds - 60;
            newHours += 1;
        }

        if (newHours > 23) {
            newHours = newHours - 24;
//            newHours = 0;
        }

        System.out.printf("%d:%02d", newHours, newSeconds);
    }
}