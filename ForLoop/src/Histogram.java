import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int under200Count = 0;
        int under399Count = 0;
        int under599Count = 0;
        int under799Count = 0;
        int over800Count = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 200) {
                under200Count++;
            } else if (number < 400) {
                under399Count++;
            } else if (number < 600) {
                under599Count++;
            } else if (number < 800) {
                under799Count++;
            } else {
                over800Count++;
            }
        }
        System.out.printf("%.2f%%%n",(double)under200Count / n * 100);
        System.out.printf("%.2f%%%n",(double)under399Count / n * 100);
        System.out.printf("%.2f%%%n",(double)under599Count / n * 100);
        System.out.printf("%.2f%%%n",(double)under799Count / n * 100);
        System.out.printf("%.2f%%%n",(double)over800Count / n * 100);
    }
}