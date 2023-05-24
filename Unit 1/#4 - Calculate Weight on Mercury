// U1#4 - Calculate Weight on Mercury
// Yutong - 8/29/2022

// Import the scanner
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // Create the scanner
    Scanner in = new Scanner(System.in);

    // Ask and store their weight
    System.out.println("How much do you weigh(lbs)?");
    String originalWeight = in.nextLine();

    // Close the scanner
    in.close();

    // Change from string to integer
    double weight = Integer.parseInt(originalWeight);

    // Set multiplier
    double multiMercury = 0.4;
    double multiVenus = 0.9;
    double multiEarth = 1.0;
    double multiMars = 0.38;
    double multiJupiter = 2.3;
    double multiSaturn = 1.1;
    double multiUranus = 0.92;
    double multiNeptune = 1.2;

    // Times input weight with multiplier
    double finalWeightMercury = weight * multiMercury;
    double finalWeightVenus = weight * multiVenus;
    double finalWeightEarth = weight * multiEarth;
    double finalWeightMars = weight * multiMars;
    double finalWeightJupiter = weight * multiJupiter;
    double finalWeightSaturn = weight * multiSaturn;
    double finalWeightUranus = weight * multiUranus;
    double finalWeightNeptune = weight * multiNeptune;

    // Print their final weight
    System.out.println("You would weigh " + finalWeightMercury + " lbs on Mercury.");
    System.out.println("You would weigh " + finalWeightVenus + " lbs on Venus.");
    System.out.println("You would weigh " + finalWeightEarth + " lbs on Earth.");
    System.out.println("You would weigh " + finalWeightMars + " lbs on Mars.");
    System.out.println("You would weigh " + finalWeightJupiter + " lbs on Jupiter.");
    System.out.println("You would weigh " + finalWeightSaturn + " lbs on Saturn.");
    System.out.println("You would weigh " + finalWeightUranus + " lbs on Uranus.");
    System.out.println("You would weigh " + finalWeightNeptune + " lbs on Neptune.");
  }
}
