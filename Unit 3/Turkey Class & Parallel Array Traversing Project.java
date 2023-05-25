// Main.java


// U3 Turkey Class & Parallel Array Traversing Project
// Main.java
// Yutong Han 11/21/2022

// Import everything in util 
import java.util.*;

public class Main {
  public static void main(String[] args) {

    // **** Part 1 **** //
    
    // Create scanner
    Scanner scan = new Scanner(System.in);
    
    // Original turkey
    Turkey originalTurkey = new Turkey();
    System.out.println("\n" + originalTurkey);

    // New turkey
    Turkey newTurkey = new Turkey("Bravo", 16, 5);
    System.out.println("\n" + newTurkey);

    // New turkey stats
    newTurkey.setName("Charlie");
    newTurkey.setWeight(20);
    newTurkey.setAge(6);

    // Print new turkey stats
    System.out.println("\nNew Name: " + newTurkey.getName() + "\nNew Weight: " + newTurkey.getWeight() + " lbs" + "\nNew Age: " + newTurkey.getAge() + " months\n");

    // **** Part 2 **** //
    
    // Brands and info
    String[] brands = {"Honeysuckle", "Butterball", "Kirkwood", "Shady Brook Farms", "Norbest", "Jennie-O", "Dakota Provisions", "Members Mark", "Perdue", "Jaindl Farms"};
    boolean[] cooked = {false, false, false, false, false, false, false, false, false, false};
    double[] prices = {19.94, 24.49, 22.68, 24.44, 41.85, 34.27, 55.00, 21.75, 94.99 , 67.20};
    int[] weights = {13, 21, 12, 13, 15, 12, 13, 18, 12, 23};

    // Counters for each weight category
    int weightCategory1 = 0; // 10-14 lbs
    int weightCategory2 = 0; // 14-16 lbs
    int weightCategory3 = 0; // 16-20 lbs
    int weightCategory4 = 0; // 20-24 lbs

    while (true) {

      System.out.print((char)27 + "[33m"); // Gold
      System.out.println("\nWelcome to Yutong's Turkey Shop!");
      System.out.println("What action would you like to do?\n");
      System.out.print((char)27 + "[36m"); // Cyan
      System.out.println("[1] View turkeys and their weight categories.");
      System.out.println("[2] View all stats of all turkeys.");
      System.out.println("[3] Ask for a price change.");
      System.out.println("[0] Leave.\n");

      System.out.print((char)27 + "[34m"); // Blue
      System.out.print("Input: ");
      int input = scan.nextInt();
      
      if (input > 3 || input < 0) {
        System.out.print((char)27 + "[31m"); // Red
        System.out.println("\nInvalid input.");
      }

      else if (input == 1) {
        // Iterate over the weights array
        for (int weight : weights) {
          if (weight >= 10 && weight <= 14) {
            weightCategory1++;
          } else if (weight >= 14 && weight <= 16) {
            weightCategory2++;
          } else if (weight >= 16 && weight <= 20) {
            weightCategory3++;
          } else if (weight >= 20 && weight <= 24) {
            weightCategory4++;
          }
        }

        // Print the number of turkeys in each weight category
        System.out.print((char)27 + "[97m"); // White
        System.out.println("\nNumber of turkey between 10-14 lbs: " + weightCategory1);
        System.out.println("Number of turkey between 14-16 lbs: " + weightCategory2);
        System.out.println("Number of turkey between 16-20 lbs: " + weightCategory3);
        System.out.println("Number of turkey between 20-24 lbs: " + weightCategory4);
      }
        
      else if (input == 2) {
        System.out.print((char)27 + "[97m"); // White
        System.out.println("\nFormat\nBrand: Is Cooked, Price, Weight\n");

        for (int i = 0; i < 10; i++) {
          System.out.println(brands[i] + ", "+ cooked[i] + ", " + prices[i] + ", " + weights[i]);
        }
      }

      else if (input == 3) {
        System.out.print((char)27 + "[97m"); // White
        System.out.print("\nAsking percent off(Don't add percent symbol; EX: Do 10 not 10%): ");
        Double priceChange = scan.nextDouble();
        if (priceChange >= 0 && priceChange <= 15) {
          System.out.print((char)27 + "[92m"); // Bright green
          System.out.println("\nSuccessfully given discount: " + priceChange + "%");
        }
        else if (priceChange > 15) {
          System.out.print((char)27 + "[31m"); // Red
          System.out.println("\nToo high of a percent.");
        }
      }

      else if (input == 0) {
        System.out.print((char)27 + "[92m"); // Bright green
        System.out.println("\nGoodbye, come back soon!");
        break;
      }
    }
    
    // Close scanner
    scan.close();
  }
}





// Turkey.java


// U3 Turkey Class & Parallel Array Traversing Project
// Turkey.java
// Yutong Han 11/21/2022

public class Turkey extends Main {

  // Turkey variables
  private String name;
  private int weight;
  private int age;

  // no parameter constructor
  public Turkey() {
    name = "Alpha";
    weight = 14; // lbs
    age = 4; // months
  }

  // Turkey with 3 parameters
  public Turkey(String newName, int newWeight, int newAge) {
    name = newName;
    weight = newWeight;
    age = newAge;
  }

  // Getters for variables
  public String getName() {
    return name;
  }
  public int getWeight() {
    return weight;
  }
  public int getAge() {
    return age;
  }

  // Setters for variables
  public void setName(String newName) {
    name = newName;
  }
  public void setWeight(int newWeight) {
    weight = newWeight;
  }
  public void setAge(int newAge) {
    age = newAge;
  }

  //toString method
  public String toString() {
    return "Name: " + name + "\nWeight: " + weight + " lbs" + "\nAge: " + age + " months";
  }
}
