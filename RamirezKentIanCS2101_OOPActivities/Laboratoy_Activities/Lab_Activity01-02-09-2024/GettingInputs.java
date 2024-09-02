import java.util.InputMismatchException;
import java.util.Scanner;

public class GettingInputs {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("\u001B[33mThis program focuses on taking inputs and displaying it as outputs.\u001B[0m");
            System.out.println("\u001B[37mTheme: Music\u001B[0m");
            System.out.println();

            int year = getYearInput(scanner);

            System.out.print("Enter the genre: ");
            String genre = scanner.nextLine();

            System.out.print("Enter the album: ");
            String album = scanner.nextLine();

            System.out.print("Enter the song title: ");
            String title = scanner.nextLine();

            System.out.print("Enter the artist: ");
            String artist = scanner.nextLine();

            System.out.println("\nYou entered:");
            System.out.println("+------+--------+----------+------------+----------+");
            System.out.println("| Year | Genre  | Album    | Song Title | Artist   |");
            System.out.println("+------+--------+----------+------------+----------+");
            System.out.println("| " + year + "  | " + genre + " | " + album + " | " + title + " | " + artist + " |");
            System.out.println("+------+--------+----------+------------+----------+");

            System.out.println();
            boolean validResponse = false;
            while (!validResponse) {
                System.out.println("Do you want to continue? (Y/N) or type 'exit' to terminate the program: ");
                String response = scanner.nextLine();

                if (response.equalsIgnoreCase("Y")) {
                    validResponse = true;
                } else if (response.equalsIgnoreCase("N") || response.equalsIgnoreCase("exit")) {
                    System.out.println();
                    System.out.println("\u001B[36mThank you for using my humble program!\u001B[0m");
                    validResponse = true;
                    continueProgram = false;
                } else {
                    System.out.println("\u001B[30mInvalid response. 'Y' or 'N' or 'exit' are the only valid values\u001B[0m");
                }
            }
        }

        scanner.close();
    }

    private static int getYearInput(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Enter the year: ");
                int year = scanner.nextInt();
                scanner.nextLine();
                return year;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid year.");
                scanner.next(); 
            }
        }
    }
}