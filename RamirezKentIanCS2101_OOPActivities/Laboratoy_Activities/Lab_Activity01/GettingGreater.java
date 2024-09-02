import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\u001B[33mThis program finds the greater character between two inputted characters.\u001B[0m");
        System.out.println();

        System.out.print("Enter first character: ");
        char char1 = scanner.next().charAt(0);

        System.out.print("Enter second character: ");
        char char2 = scanner.next().charAt(0);

        char greaterChar = (char) Math.max(char1, char2);


        System.out.println();
        System.out.printf("\u001B[31mThe greater character is: %c%n\u001B[0m", greaterChar);
        System.out.println();



        System.out.printf("\u001B[34mThe ASCII Code of '%c' is: '%d'%n\u001B[0m", char1, (int)char1);
        System.out.println();
        System.out.printf("\u001B[35mThe ASCII Code of '%c' is: '%d'%n\u001B[0m", char2, (int)char2);

        scanner.close();
    }
}
