import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int ticketCount = 0;
        int studentTicketsCount = 0;
        int standardTicketsCount = 0;
        int kidTicketsCount = 0;


        while (!command.equals("Finish")) {
            String movieName = command;
            int seats = Integer.parseInt(scanner.nextLine());

            String input = scanner.nextLine();
            int movieSeatsCount = 0;

            while (!input.equals("End")) {
                String ticketType = input;

                if (ticketType.equals("student")) {
                    studentTicketsCount++;
                    ticketCount++;
                    movieSeatsCount++;
                } else if (ticketType.equals("standard")) {
                    standardTicketsCount++;
                    ticketCount++;
                    movieSeatsCount++;
                } else if (ticketType.equals("kid")) {
                    kidTicketsCount++;
                    ticketCount++;
                    movieSeatsCount++;
                }
                if (movieSeatsCount == seats) {
                    break;
                }

                input = scanner.nextLine();
            }

            double occupationPercentage = (double) movieSeatsCount / seats * 100;
            System.out.printf("%s - %.2f%% full.%n", movieName, occupationPercentage);

            command = scanner.nextLine();
        }

        double studentsPercentage = (double) studentTicketsCount / ticketCount * 100;
        double standardPercentage = (double) standardTicketsCount / ticketCount * 100;
        double kidPercentage = (double) kidTicketsCount / ticketCount * 100;

        System.out.printf("Total tickets: %d%n", ticketCount);
        System.out.printf("%.2f%% student tickets.%n", studentsPercentage);
        System.out.printf("%.2f%% standard tickets.%n", standardPercentage);
        System.out.printf("%.2f%% kids tickets.%n", kidPercentage);
    }
}