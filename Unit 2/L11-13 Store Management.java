// Main.java


// U2 L11-13 Store Management Project
// Main.java
// Yutong Han 11/6/2022
// Colored text uses ANSI. Documentation I created > https://bit.ly/FontEffects

import java.util.*;

public class Main {
  public static void main(String[] args) {

    // Create scanner
    Scanner scan = new Scanner(System.in);

    // Infinite loop
    while (true) {
      
      System.out.print((char)27 + "[33m"); // Sets to gold
      // Print Options
      System.out.println("Welcome to Yutong's Estates!");
      System.out.println("What action would you like to do?\n");
      System.out.print((char)27 + "[36m"); // Sets to cyan
      System.out.println("[1] Look at properties.");
      System.out.println("[2] Buy a house.");
      System.out.println("[3] Buy an apartment.");
      System.out.println("[4] Buy a mansion.");
      System.out.println("[5] Ask for a price drop.");
      System.out.println("[0] Leave.");

      // Get user input
      int input = scan.nextInt();

      // Make sure input is valid
      if (input > 5 || input < 0) {
        System.out.print((char)27 + "[31m"); // Red
        System.out.println("Invalid input.");
      }

      // Option 1
      else if(input == 1) {
        System.out.print((char)27 + "[31m"); // Red color
        System.out.println("\nCurrently we have 3 properties listed.\n");
    
        // Creates and prints house, apartment, mansion
        House myHouse = new House(3, 2, 2500, 250000);
        System.out.println("House \n" + myHouse + "\n");

        Apartment myApartment = new Apartment(1, 1, 1000, 1000, true, false);
        System.out.println("Apartment \n" + myApartment + "\n");

        Mansion myMansion = new Mansion(6, 5, 5000, 2000000, true, true);
        System.out.println("Mansion \n" + myMansion + "\n");
      }

      else if(input == 2) {
        System.out.print((char)27 + "[95m"); // Pink
        System.out.println("\nSuccessfully bought a house!\n");
      } else if(input == 3) {
        System.out.print((char)27 + "[95m"); // Pink
        System.out.println("\nSuccessfully bought an apartment!\n");
      } else if(input == 4) {
        System.out.print((char)27 + "[95m"); // Pink
        System.out.println("\nSuccessfully bought a mansion!\n");
      }

      else if(input == 5) {
        System.out.print((char)27 + "[92m"); // Bright green
        System.out.println("\nAll properties are now 10% off!\n");
      }

      // Exit the loop
      // LakshanF: Since you have this check, you can have the loop as while(true), which is the convention for this type of loop
      // Yutong: I changed it. Could you help me with adding a price discount?
        // LakshanF: Sure, show me the problem
        // Yutong: I'm not sure how to change the parameter
        // LakshanF: One option is for you to add a new method in House that when you call, will reduce the original price by a certain amount. You can call that method in option 5. All classes will inherit that method since House is the parent
        // Yutong: Thank you
      else if(input == 0) {
        System.out.print((char)27 + "[92m"); // Bright green
        System.out.println("\nGoodbye, come back soon!");
        break; // Ends the loop
      }
    }

    // Close the scanner
    scan.close();
  }
}





// Apartment.java


// U2 L11-13 Store Management Project
// Apartment.java
// Yutong Han 11/6/2022

public class Apartment extends House {
  
  // Variables that only apartment has
  private boolean hasBalcony;
  private boolean hasLaundryMachine;

  // No-Argument Constructor
  public Apartment() {
    super();
    hasBalcony = true;
    hasLaundryMachine = false;
  }

  // Apartment with 6 parameters
  // USING this constructor
  public Apartment(int bedrooms, int baths, int sqft, int price, boolean hasBalcony, boolean hasLaundryMachine) {
    super(bedrooms, baths, sqft, price);
    this.hasBalcony = hasBalcony;
    this.hasLaundryMachine = hasLaundryMachine;
  }

  // Accessors
  public boolean hasBalcony() {
    return hasBalcony;
  }
  public boolean hasLaundryMachine() {
    return hasLaundryMachine;
  }

  // Mutators
  public void setBalcony(boolean newBalcony) {
    hasBalcony = newBalcony;
  }
  public void setLaundryMachine(boolean newLaundryMachine) {
    hasLaundryMachine = newLaundryMachine;
  }

  // Use toString
  public String toString() {
    return super.toString() + "\nHas Balcony: " + hasBalcony + "\nHas Laundry Machine: " + hasLaundryMachine;
  }
  
} // Apartment





// House.java


// U2 L11-13 Store Management Project
// House.java
// Yutong Han 11/6/2022

public class House {
  
  // Variables that all houses have
  private int bedrooms;
  private int baths;
  private int sqft;
  private int price;

  // Default house values
  public House() {
    bedrooms = 3;
    baths = 2;
    sqft = 2500;
    price = 250000;
  }

  // House with 4 parameters
  // NOT using this constructor
  public House(int newBedrooms, int newBaths, int newSqft, int newPrice) {
    bedrooms = newBedrooms;
    baths = newBaths;
    sqft = newSqft;
    price = newPrice;
  }

  // Getters for variables
  public int getBedrooms() {
    return bedrooms;
  }
  public int getBaths() {
    return baths;
  }
  public int getSqft() {
    return sqft;
  }
  public int getPrice() {
    return price;
  }

  // Setters for variables
  public void setBedrooms(int newBedrooms) {
    bedrooms = newBedrooms;
  }
  public void setBaths(int newBaths) {
    baths = newBaths;
  }
  public void setSqft(int newSqft) {
    sqft = newSqft;
  }
  public void setPrice(int newPrice) {
    price = newPrice;
  }

  // Use toString
  public String toString() {
    return "Bedrooms: " + bedrooms + "\nBaths: " + baths + "\nSquare Feet: " + sqft + "\nPrice: " + price;
  }
} // House





// Mansion.java


// U2 L11-13 Store Management Project
// Mansion.java
// Yutong Han 11/6/2022

public class Mansion extends House {

  // Variables that only mansion have
  private boolean hasTheaterRoom;
  private boolean hasGameRoom;

  // No-Argument Constructor
  public Mansion() {
    super();
    hasTheaterRoom = true;
    hasGameRoom = true;
  }

  // Mansion with 6 parameters
  // USING this constructor
  public Mansion(int bedrooms, int baths, int sqft, int price, boolean hasTheaterRoom, boolean hasGameRoom) {
    super(bedrooms, baths, sqft, price);
    this.hasTheaterRoom = hasTheaterRoom;
    this.hasGameRoom = hasGameRoom;
  }

  // Accessors
  public boolean hasTheaterRoom() {
    return hasTheaterRoom;
  }
  public boolean hasGameRoom() {
    return hasGameRoom;
  }

  // Mutators
  public void setTheaterRoom(boolean newTheaterRoom) {
    hasTheaterRoom = newTheaterRoom;
  }
  public void setGameRoom(boolean newGameRoom) {
    hasGameRoom = newGameRoom;
  }

  // Use toString
  public String toString() {
    return super.toString() + "\nHas Theater: " + hasTheaterRoom + "\nHas Game Room: " + hasGameRoom;
  }
  
} // Mansion
