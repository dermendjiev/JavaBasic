import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        String inputPass = scanner.nextLine();
        while (!inputPass.equals(password)){
            inputPass = scanner.nextLine();
        }

        System.out.printf("Welcome %s!", username);
    }
}