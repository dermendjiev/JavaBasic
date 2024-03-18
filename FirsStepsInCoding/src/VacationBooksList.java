import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pageCount = Integer.parseInt(scanner.nextLine());
        int pagePerHour = Integer.parseInt(scanner.nextLine());
        int daysForBook = Integer.parseInt(scanner.nextLine());

        int totalHoursPerBook = pageCount / pagePerHour;
        int hoursPerDay = totalHoursPerBook / daysForBook;

        System.out.println(hoursPerDay);
    }
}