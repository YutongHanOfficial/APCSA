// U1#5 - Convert Seconds
// Yutong - 8/30/2022

// Import the scanner
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // Create the scanner
    Scanner in = new Scanner(System.in);

    // Ask and store seconds
    System.out.println("How many seconds would you like to convert?");
    int userInput = in.nextInt();

    // Close the scner
    in.close();

    // Divide input by 3600 to get hours
    int hours = userInput / 3600;

    // Get remainder and divide by 60 to get minutes
    int minutes = (userInput % 3600) / 60;

    // Get final remainder
    int seconds = userInput % 60;

    // Print hours, minutes, and seconds
    System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds.");
  }
}
