import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinutes = Integer.parseInt(scanner.nextLine());

        int totalTimeExam = examHour * 60 + examMinutes;
        int totalTimeArrive = arriveHour * 60 + arriveMinutes;

        if (totalTimeExam == totalTimeArrive) {
            System.out.println("On time");
        } else if (totalTimeExam < totalTimeArrive) {

            int hoursLate = (totalTimeArrive - totalTimeExam) / 60;
            int minutesLate = (totalTimeArrive - totalTimeExam) % 60;

            if (hoursLate == 0) {
                System.out.printf("Late%n%d minutes after the start", minutesLate);
            } else {
                System.out.printf("Late%n%d:%02d hours after the start", hoursLate, minutesLate);
            }
        } else if (totalTimeExam - totalTimeArrive <= 30) {
            System.out.printf("On time\n" +
                    "%d minutes before the start", totalTimeExam - totalTimeArrive);
        } else if (totalTimeExam - totalTimeArrive > 30) {
            int timeEarly = totalTimeExam - totalTimeArrive;
            int hoursEarly = timeEarly / 60;
            int minutesEarly = timeEarly % 60;
            if (hoursEarly == 0) {
                System.out.printf("Early\n" +
                        "%d minutes before the start", minutesEarly);
            } else {
                System.out.printf("Early\n" +
                        "%d:%02d hours before the start", hoursEarly, minutesEarly);
            }
        }
    }
}