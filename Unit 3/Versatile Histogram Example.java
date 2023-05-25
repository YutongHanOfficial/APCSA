// Versatile version of the histogram

import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws FileNotFoundException {
    System.out.println("Histogram of Scores");
    
    Map<Integer, Integer> counts = new HashMap<>(); // Stores the scores and their counts

    Scanner scannerName = new Scanner(new File("numbers.txt")); // Scans the numbers.txt file

    while (scannerName.hasNextInt()) { // Read numbers.txt in counts map
      int score = scannerName.nextInt();
      counts.put(score, counts.getOrDefault(score, 0) + 1); // Counts the amount of scores
    }

    // Sort the scores in ascending order
    List<Integer> scores = new ArrayList<>(counts.keySet());
    Collections.sort(scores);

    for (int score : scores) {
      int count = counts.get(score);
      
      if (count > 0) { // Only display scores that were recorded in the input file
        System.out.print(score + ": ");
        for (int j = 0; j < count; j++) {
          System.out.print("*"); // Prints a star for every score of the value
        }
        System.out.print(" " + count + " scores"); // Lists the number of scores for each value
        System.out.println(); // Line break
      }
    }
  }
}
