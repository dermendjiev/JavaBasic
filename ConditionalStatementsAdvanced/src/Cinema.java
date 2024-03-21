import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projectionType = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int col = Integer.parseInt(scanner.nextLine());

        int seats = row * col;

        double income = 0;

        switch (projectionType) {
            case "Premiere":
                income = seats * 12;
                break;
            case "Normal":
                income = seats * 7.5;
                break;
            case "Discount":
                income = seats * 5;
                break;
        }
        System.out.printf("%.2f leva", income);
    }
}