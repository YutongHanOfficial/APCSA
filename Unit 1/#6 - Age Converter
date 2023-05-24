// U1#6 - Age Converter
// Yutong - 9/12/2022

// Import Gregorian calendar
// import java.time.LocalDateTime;  
// import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

// Import the scanner
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // Create the scanner
    Scanner in = new Scanner(System.in);

    // Ask and store month
    System.out.println("Enter the month you were born. (as a number)");
    int MonthBorn = in.nextInt();

    // Ask and store day
    System.out.println("Enter the day you were born. (as a number)");
    int DayBorn = in.nextInt();

    // Ask and store year
    System.out.println("Enter the year you were born. (as a number)");
    int YearBorn = in.nextInt();

    // Close the scanner
    in.close();

    // How old they are (years)
    int YearAge = (2022 - YearBorn) - 1;

    // What day of the month calculator is using
    int DayMonth = 15;

    // What month of the year calculator is using
    int Month = 9;

    // User month and day age
    int MonthAge = Month - MonthBorn;
    int DayAge = DayMonth - DayBorn;

    // Checking if birth month is earlier than set month
    if (Month == MonthBorn) {
      if (DayMonth < DayBorn) {
        MonthAge = MonthAge - 1;
      }
    } else if (Month < MonthBorn) {
      MonthAge = MonthAge - 1;
    }

    // Checking their birthday with set date
    if (MonthBorn < 9 || (MonthBorn == 9 && DayBorn <= 15)) {
      YearAge = YearAge + 1;
    }

    // Convert total to days, hours, and seconds
    int Days = (YearAge * 365 + MonthAge * 12 + DayAge);
    int Hours = Days * 24;
    int Seconds = Hours * 3600;

    // Print everything
    System.out.println("You are " + YearAge + " years old as of September 15, 2022.");
    System.out.println("You have lived for a total of " + YearAge + " years, " + MonthAge + " months, " + DayAge + " days.");
    System.out.println("That is a total of " + Days + " days.");
    System.out.println("That is a total of " + Hours + " hours.");
    System.out.println("That is a total of " + Seconds + " seconds.");
  }
}
