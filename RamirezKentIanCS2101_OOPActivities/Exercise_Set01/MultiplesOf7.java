import java.util.Scanner;

public class MultiplesOf7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of multiples of 7 you want: ");
    int numMultiples = scanner.nextInt();
    
    boolean tab = false;
    int startRed = 255;
    int startGreen = 0; 
    int startBlue = 0; 
    int endRed = 0; 
    int endGreen = 255; 
    int endBlue = 0;

    for (int i = 1; i <= numMultiples; i++) {
      int multiple = i * 7;
      int r = (int) (startRed + (endRed - startRed) * (i - 1) / (numMultiples - 1.0));
      int g = (int) (startGreen + (endGreen - startGreen) * (i - 1) / (numMultiples - 1.0));
      int b = (int) (startBlue + (endBlue - startBlue) * (i - 1) / (numMultiples - 1.0));

      String colorCode = "\u001B[38;2;" + r + ";" + g + ";" + b + "m";

      if (tab) {
        System.out.println(colorCode + "\t" + multiple + "\u001B[0m");
      } else {
        System.out.println(colorCode + multiple + "\u001B[0m");
      }
      tab = !tab;
    }

    scanner.close();
  }
}