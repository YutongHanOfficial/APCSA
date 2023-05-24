// U1#8 - Decimal to Binary Converter
// Yutong Han - 9/21/2022
// Helped by users on stackoverflow.com

// Import the scanner
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // Empty value for later use
    int number;

    // Create scanner
    Scanner in = new Scanner(System.in);

    // Ask and store number
    System.out.println("What number would you like converted to binary?");
    number = in.nextInt();

    // Close scanner
    in.close();

    // If number is negative, print error. If positive, print binary.
    if (number < 0) {
      System.out.println("The number must be positive.");
    }
    else {
      System.out.print("The number in binary is: ");
      makeBinary(number);
    }
  }

  // Math that converts decimal to binary
  private static void makeBinary(int number) {
    int remainder;

    // If less than 1, then print itself
    if (number <= 1) {
      System.out.print(number);
      return;
    }

    // Print remainder
    remainder = number % 2;
    makeBinary(number >> 1);
    System.out.print(remainder);
  }
}
