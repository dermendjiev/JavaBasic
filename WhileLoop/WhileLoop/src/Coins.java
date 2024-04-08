import java.math.BigDecimal;
import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal coins = new BigDecimal(scanner.next());

        int coinsCount = 0;

        while (coins.compareTo(new BigDecimal("2")) >= 0) {
            coins = coins.subtract(new BigDecimal("2"));
            coinsCount++;
        }
        while (coins.compareTo(new BigDecimal("1")) >= 0) {
            coins = coins.subtract(new BigDecimal("1"));
            coinsCount++;
        }
        while (coins.compareTo(new BigDecimal("0.5")) >= 0) {
            coins = coins.subtract(new BigDecimal("0.5"));
            coinsCount++;
        }
        while (coins.compareTo(new BigDecimal("0.2")) >= 0) {
            coins = coins.subtract(new BigDecimal("0.2"));
            coinsCount++;
        }
        while (coins.compareTo(new BigDecimal("0.1")) >= 0) {
            coins = coins.subtract(new BigDecimal("0.1"));
            coinsCount++;
        }
        while (coins.compareTo(new BigDecimal("0.05")) >= 0) {
            coins = coins.subtract(new BigDecimal("0.05"));
            coinsCount++;
        }
        while (coins.compareTo(new BigDecimal("0.02")) >= 0) {
            coins = coins.subtract(new BigDecimal("0.02"));
            coinsCount++;
        }
        while (coins.compareTo(new BigDecimal("0.01")) >= 0) {
            coins = coins.subtract(new BigDecimal("0.01"));
            coinsCount++;
        }

        System.out.println(coinsCount);

    }
}