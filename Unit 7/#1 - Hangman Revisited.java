// Unit 7 Coding Projects – Hangman Revisited
// Main.java
// Yutong Han 3/14/2023

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Read the list of words from the file
        ArrayList<String> words = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("words.txt"));
            while (scanner.hasNextLine()) {
                words.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: words.txt file not found.");
            return;
        }

        // Choose a random word from the list
        Random random = new Random();
        String mysteryWord = words.get(random.nextInt(words.size()));

        // Initialize variables
        int numGuessesLeft = 5;
        ArrayList<Character> guessedLetters = new ArrayList<>();
        ArrayList<Character> revealedWord = new ArrayList<>();
        for (int i = 0; i < mysteryWord.length(); i++) {
            revealedWord.add('*');
        }

        // Main game loop
        System.out.println("Welcome to Hangman! You must guess the mystery word in 5 guesses or less.");
        while (numGuessesLeft > 0 && revealedWord.contains('*')) {
            System.out.println("Here's what you have so far: " + String.join("", revealedWord));
            System.out.println("You have " + numGuessesLeft + " guesses left");
            System.out.println("Here are the letters you have guessed so far: " + String.join(" ", guessedLetters));
            Scanner scanner = new Scanner(System.in);
            System.out.print("What letter would you like to guess next? ");
            String guessStr = scanner.nextLine().toLowerCase();
            if (guessStr.length() != 1) {
                System.out.println("Please enter a single letter.");
            } else {
                char guess = guessStr.charAt(0);
                if (guessedLetters.contains(guess)) {
                    System.out.println("You already guessed that letter!");
                } else {
                    guessedLetters.add(guess);
                    if (mysteryWord.indexOf(guess) != -1) {
                        System.out.println("Good job!");
                        for (int i = 0; i < mysteryWord.length(); i++) {
                            if (mysteryWord.charAt(i) == guess) {
                                revealedWord.set(i, guess);
                            }
                        }
                    } else {
                        System.out.println("I'm sorry...");
                        numGuessesLeft--;
                    }
                }
            }
        }

        // Print the final result
        if (!revealedWord.contains('*')) {
            System.out.println("Congratulations, you guessed the word " + mysteryWord + "!");
        } else {
            System.out.println("Sorry, you ran out of guesses. The word was " + mysteryWord + ".");
        }
    }
}





// words.txt
apple
giant
focus
speed
