import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("\u001B[33mThis program finds the greater character between two inputted characters.\u001B[0m");
            System.out.println();

            System.out.print("Enter first character: ");
            char char1 = scanner.next().charAt(0);
            scanner.nextLine();

            System.out.print("Enter second character: ");
            char char2 = scanner.next().charAt(0);
            scanner.nextLine();

            char greaterChar = (char) Math.max(char1, char2);

            System.out.println();
            System.out.printf("\u001B[31mThe greater character is: %c%n\u001B[0m", greaterChar);
            System.out.println();

            System.out.printf("\u001B[34mThe ASCII Code of '%c' is: '%d'%n\u001B[0m", char1, (int) char1);
            System.out.println();
            System.out.printf("\u001B[35mThe ASCII Code of '%c' is: '%d'%n\u001B[0m", char2, (int) char2);

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
}