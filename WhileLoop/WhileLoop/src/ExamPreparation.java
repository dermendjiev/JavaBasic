import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gradeFault = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        int probCount = 0;
        double grades = 0;
        String lastProbName = "";
        int faultCount = 0;
        boolean isFault = false;


        while (!input.equals("Enough")) {
            String problemName = input;
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade <= 4){
                faultCount++;
                if (faultCount >= gradeFault){
                    isFault = true;
                    break;
                }
            }
            grades += grade;
            probCount++;
            lastProbName = problemName;



            input = scanner.nextLine();
        }

        if (!isFault) {
            double averageScore = grades / probCount;
            System.out.printf("Average score: %.2f \n" +
                    "Number of problems: %d \n" +
                    "Last problem: %s", averageScore, probCount, lastProbName);
        } else {
            System.out.printf("You need a break, %d poor grades.", faultCount);
        }
    }
}