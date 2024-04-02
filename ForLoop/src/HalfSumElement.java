import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;
            if (num > maxNumber){
                maxNumber = num;
            }
        }
        if (sum - maxNumber == maxNumber){
            System.out.printf("Yes\n" +
                    "Sum = %d", maxNumber);
        } else {
            int diff = Math.abs(sum - maxNumber - maxNumber);
            System.out.printf("No\n" +
                    "Diff = %d", diff);
        }
    }
}