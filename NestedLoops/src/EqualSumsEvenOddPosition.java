import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        for (int i = n1; i <= n2; i++) {
            String currentNum = "" + i;
            int evenSum = 0;
            int oddSum = 0;
            for (int j = 0; j < currentNum.length(); j++) {
                int currentDigit = Integer.parseInt(String.valueOf(currentNum.charAt(j)));
                if (j % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }
            }
            if (evenSum == oddSum) {
                System.out.printf("%s ", currentNum);
            }
        }
    }
}