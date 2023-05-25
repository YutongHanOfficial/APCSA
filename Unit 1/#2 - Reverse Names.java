// U1#2 - Reverse Names
// Yutong - 8/29/2022

// Import the scanner
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // Create the scanner
    Scanner in = new Scanner(System.in);

    // Ask and store name one
    System.out.println("Type name one.");
    String nameOne = in.nextLine();

    // Ask and store name two
    System.out.println("Type name two.");
    String nameTwo = in.nextLine();

    // Ask and store name three
    System.out.println("Type name three.");
    String nameThree = in.nextLine();

    // Close the scanner
    in.close();

    // Print their names in reverse order
    System.out.println("Hello " + nameThree + ", " + nameTwo + ", " + nameOne + ".");
  }
}
