// Main.java


// U2L6 Extra Practice
// Yutong - 10/16/2022

public class Main {
  public static void main(String[] args) {

    // Creates and prints house, apartment, mansion
    House myHouse = new House(3, 2, 2500);
    System.out.println("House \n" + myHouse + "\n");

    Apartment myApartment = new Apartment(1, 1, 1000, true, false);
    System.out.println("Apartment \n" + myApartment + "\n");

    Mansion myMansion = new Mansion(6, 5, 5000, true, true);
    System.out.println("Mansion \n" + myMansion);
  }
}





// Apartment.java


public class Apartment extends House {
  
  // Variables that only apartment has
  private boolean hasBalcony;
  private boolean hasLaundryMachine;

  // Apartment with 5 parameters
  public Apartment(int bedrooms, int baths, int sqft, boolean hasBalcony, boolean hasLaundryMachine) {
    super(bedrooms, baths, sqft);
    this.hasBalcony = hasBalcony;
    this.hasLaundryMachine = hasLaundryMachine;
  }

  // Use toString
  public String toString() {
    return super.toString() + "\nHas Balcony: " + hasBalcony + "\nHas Laundry Machine: " + hasLaundryMachine;
  }
  
} // Apartment





// House.java


public class House {
  
  // Variables that all houses have
  private int bedrooms;
  private int baths;
  private int sqft;

  // House with 3 parameters
  public House(int bedrooms, int baths, int sqft) {
    this.bedrooms = bedrooms;
    this.baths = baths;
    this.sqft = sqft;
  }

  // Use toString
  public String toString() {
    return "Bedrooms: " + bedrooms + "\nBaths: " + baths + "\nSquare Feet: " + sqft;
  }
  
} // House





// Mansion.java


public class Mansion extends House {

  // Variables that only mansion have
  private boolean hasTheaterRoom;
  private boolean hasGameRoom;

  // Mansion with 5 parameters
  public Mansion(int bedrooms, int baths, int sqft, boolean hasTheaterRoom, boolean hasGameRoom) {
    super(bedrooms, baths, sqft);
    this.hasTheaterRoom = hasTheaterRoom;
    this.hasGameRoom = hasGameRoom;
  }

  // Use toString
  public String toString() {
    return super.toString() + "\nHas Theater: " + hasTheaterRoom + "\nHas Game Room: " + hasGameRoom;
  }
  
} // Mansion
