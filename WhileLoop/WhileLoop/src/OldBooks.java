import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();

        String input = scanner.nextLine();

        int count = 0;
        boolean isFound = false;

        while (!input.equals("No More Books")) {

            if (input.equals(searchedBook)) {
                System.out.printf("You checked %d books and found it.", count);
                isFound = true;
                break;
            }

            count++;
            input = scanner.nextLine();
        }
        if (!isFound) {
            System.out.printf("The book you search is not here!%nYou checked %d books.", count);
        }
    }
}