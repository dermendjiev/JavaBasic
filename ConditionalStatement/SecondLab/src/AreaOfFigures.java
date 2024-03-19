import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area = 0;

        String figureType = scanner.nextLine();

        if (figureType.equals("square")) {

            double side = Double.parseDouble(scanner.nextLine());

            area = Math.pow(side, 2);

        } else if (figureType.equals("rectangle")) {

            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());

            area = sideA * sideB;

        } else if (figureType.equals("circle")) {

            double radius = Double.parseDouble(scanner.nextLine());

            area = Math.PI * Math.pow(radius, 2);

        } else if (figureType.equals("triangle")) {

            double side = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());

            area = side * height / 2;
        }

        System.out.printf("%.3f", area);
    }
}