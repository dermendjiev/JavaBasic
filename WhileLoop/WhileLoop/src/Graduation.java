import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int year = 0;
        double grades = 0;
        int excludeCount = 0;

        while (year < 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            grades += grade;
            year++;
            if (grade < 4) {
                excludeCount++;
                if (excludeCount >= 2) {
                    System.out.printf("%s has been excluded at %d grade", name, year);
                    break;
                }
                year--;
            }
        }
        if (year == 12) {
            Double averageGrade = grades / year;
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
        }
    }
}