import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0;

        String input = scanner.nextLine();

        while (!(input.equals("NoMoreMoney"))){

            double increaseBalance = Double.parseDouble(input);

            if (increaseBalance < 0){
                System.out.println("Invalid operation!");
                break;
            }

            balance += increaseBalance;

            System.out.printf("Increase: %.2f%n", increaseBalance);

            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f%n", balance);
    }
}