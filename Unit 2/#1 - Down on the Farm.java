// Main.java


// U2#1 - Down on the Farm
// Yutong - 10/4/2022

// Import everything in util
import java.util.*;

public class Main {
  public static void main(String[] args) {

    // Create scanner
    Scanner scan = new Scanner(System.in);

    // Infinite loop
    for (int i = 1; i >= 1; i++) {
      System.out.print((char)27 + "[m"); // Sets to default (white)
      
      // Print options
      System.out.println("What action would you like to do?");
      System.out.println("Enter [1] to go to cow options.");
      System.out.println("Enter [2] to go to chicken options.");
      System.out.println("Enter [3] to go to pig options.");
      System.out.println("Enter [0] to exit the program.");
      
      // Get input
      int input = scan.nextInt();

      // Make sure input is within the boundaries
      if (input > 3 || input < 0) {
        System.out.print((char)27 + "[31m"); // Red
        System.out.println("Invalid input.");
      }

      // Breaks loop
      else if(input == 0) {
        System.out.print((char)27 + "[92m"); // Bright green
        System.out.println("Program has ended.");
        break;
      }
    }

    // Close the scanner
    scan.close();

    System.out.print((char)27 + "[m"); // Default color

    Cow myCow = new Cow("Joe", 77.5, 0, true);
    System.out.println(myCow);
    
    // Creates cow, chicken, and pig ("Name", weight, age, gender)
    Cow myCow = new Cow();
    myCow.newCow("Joe", 77.5, 0, true); // myCow.newCow("Joe", 900, 1, true); - age 1

    Chicken myChicken = new Chicken();
    myChicken.newChicken("John", 0.05, 0, true); // myCow.newCow("John", 5, 1, true); - age 1

    Pig myPig = new Pig();
    myPig.newPig("Jack", 4, 0, true); // myPig.newPig("Jack", 400, 1, true); - age 1
  }
}





// Chicken.java


public class Chicken extends Main {

  // 
  public static void newChicken(String chickenName, double chickenWeight, int chickenAge, boolean chickenGender) {

    // // Print name, age, and weight
    // System.out.println("Name: " + chickenName);
    // System.out.println("Age: " + chickenAge + " Year(s) old");
    // System.out.println("Weight: " + chickenWeight + " lbs");

    // If boolean is true, then print male. Else, print female.
    if (chickenGender == true) {
      System.out.println("Gender: Male");
    }
    else {
      System.out.println("Gender: Female");
    }
  }
}





// Cow.java


public class Cow extends Main {

  public static void newCow(String cowName, double cowWeight, int cowAge, boolean cowGender) {

    // Print name, age, and weight
    System.out.println("Name: " + cowName);
    System.out.println("Age: " + cowAge + " Year(s) old");
    System.out.println("Weight: " + cowWeight + " lbs");

    // If boolean is true, then print male. Else, print female.
    if (cowGender == true) {
      System.out.println("Gender: Male");
    }
    else {
      System.out.println("Gender: Female");
    }
  }
  
} // Cow





// Pig.java


public class Pig extends Main {
  public static void newPig(String pigName, double pigWeight, int pigAge, boolean pigGender) {

    // Print name, age, and weight
    System.out.println("Name: " + pigName);
    System.out.println("Age: " + pigAge + " Year(s) old");
    System.out.println("Weight: " + pigWeight + " lbs");

    // If boolean is true, then print male. Else, print female.
    if (pigGender == true) {
      System.out.println("Gender: Male");
    }
    else {
      System.out.println("Gender: Female");
    }
  }
}
