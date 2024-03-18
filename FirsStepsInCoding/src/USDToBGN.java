import java.util.Scanner;

public class USDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double USD = Double.parseDouble(scanner.nextLine());
        double fixedRate = 1.79549;

        double BGN = USD * fixedRate;

        System.out.println(BGN);
    }
}