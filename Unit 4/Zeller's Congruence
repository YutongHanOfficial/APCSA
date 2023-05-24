// U4 - Zeller's Congruence
// Main.java
// Yutong Han 1/6/2023

// Import everything in util
import java.util.*;

public class Main {
  public static void main(String[] args) {

    // Create the scanner
    Scanner scan = new Scanner(System.in);

    // Ask for the year, month, day
    System.out.print("Enter the year (yyyy): ");
    int year = scan.nextInt();

    System.out.print("Enter the month (1-12): ");
    int month = scan.nextInt();

    System.out.print("Enter the day (1-31): ");
    int day = scan.nextInt();

    scan.close();

    // Makes sure that the input is a valid date
    if (year < 1 || month > 12 || month < 1 || day > 31 || day < 1) {
      System.out.println("Invalid input, re-run the program.");
      System.exit(0);
    }

    // Made with March as 1st month
    if (month < 3) {
      month += 12;
      year -= 1;
    }

    // Zeller's Congruence
    int k = year % 100;
    int j = year / 100;
    int h = (day + (13 * (month + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;

    // Prints day of the week
    String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    System.out.println("The day of the week is: " + days[h]);
  }
}





















// // Import everything in util
// import java.util.*;

// public class Main {
//   public static void main(String[] args) {

//     // Create scanner
//     Scanner scan = new Scanner(System.in);

//     // Formula
//     /*
//       h = (day + (13(month+1))/5 + year + year/4 + 20/4 + 100) % 7
//     */

//     // Ask for year, month, day
//     System.out.print("Enter the year: ");
//     int year = scan.nextInt();
//     System.out.print("Enter the month: ");
//     int month = scan.nextInt();
//     System.out.print("Enter the day: ");
//     int day = scan.nextInt();

//     if (year < 1 || month > 12 || month < 1 || day > 31 || day < 1) {
//       System.out.println("Invalid input, re-run the program.");
//     }

//     int answer = (int)((day + (13*(month+1))/5) + year + (year/4) + 105) % 7;

//     String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
//     return days[answer];
//   }
// }
