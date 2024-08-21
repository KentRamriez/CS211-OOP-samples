import java.util.Scanner;

public class Tempconvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        scanner.close();

        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("\033[31m" + celsius + "°C\033[0m" + " is equivalent to " + "\033[34m" + fahrenheit + "°F\033[0m" ); 
    }
}
