import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        char symbol = scanner.nextLine().charAt(0);

        double result = 0;

        switch (symbol) {
            case '+':
                result = n1 + n2;
                if (result % 2 == 0){
                    System.out.printf("%d + %d = %.0f - even", n1, n2, result);
                } else {
                    System.out.printf("%d + %d = %.0f - odd", n1, n2, result);
                }
                break;
            case '-':
                result = n1 - n2;
                if (result % 2 == 0){
                    System.out.printf("%d - %d = %.0f - even", n1, n2, result);
                } else {
                    System.out.printf("%d - %d = %.0f - odd", n1, n2, result);
                }
                break;
            case '*':
                result = n1 * n2;
                if (result % 2 == 0){
                    System.out.printf("%d * %d = %.0f - even", n1, n2, result);
                } else {
                    System.out.printf("%d * %d = %.0f - odd", n1, n2, result);
                }
                break;
            case '/':
                if (n2 == 0){
                    System.out.printf("Cannot divide %d by zero", n1);
                    break;
                }
                result = (double) n1 / n2;
                 if (result % 2 == 0){
                    System.out.printf("%d / %d = %.2f", n1, n2, result);
                } else {
                    System.out.printf("%d / %d = %.2f", n1, n2, result);
                }
                break;
            case '%':
                if (n2 == 0){
                    System.out.printf("Cannot divide %d by zero", n1);
                    break;
                }
                result = n1 % n2;
                 if (result % 2 == 0){
                    System.out.printf("%d %% %d = %.0f", n1, n2, result);
                } else {
                    System.out.printf("%d %% %d = %.0f", n1, n2, result);
                }
                break;
        }
    }
}