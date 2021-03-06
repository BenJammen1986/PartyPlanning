// import java.io.Console;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    String userEventName;
    Integer userGuests;
    String userMeal;
    String userDrinks;
    String userEntertainment;
    String userCoupon;

    Scanner scanIn = new Scanner(System.in);

    System.out.println("Thank you for considering our party planning services!");
    System.out.println("To get an estimated price quote for your special event, please enter the following information: ");

    System.out.println("What is the name of the event that you will be hosting?");
    userEventName = scanIn.nextLine();

    System.out.println("How many guests are you planning on having in attendance?");
    userGuests = Integer.parseInt(scanIn.nextLine());

    System.out.println("Please select one of the options for a meal: none, light snacks, Steak and Potatoes, Seafood Platter");
    userMeal = scanIn.nextLine();

    System.out.println("Please select one of the options for drinks: 'none', 'sodas' (i.e.non-alcoholic), 'limited bar', or 'full bar': ");
    userDrinks = scanIn.nextLine();

    System.out.println("Please select one of the options for entertainment: none, personal, DJ, live band");
    userEntertainment = scanIn.nextLine();

    System.out.println("If you have a coupon code (ONE) you may enter it here: ");
    userCoupon = scanIn.nextLine();



    Event userEvent = new Event(userEventName, userGuests, userMeal, userDrinks, userEntertainment, userCoupon);

    System.out.println("Your total price will be: $" + userEvent.calculatePrice());


  }
}

//
// prompt the user with several questions about a party they are throwing:
//
// There will be a PROPERTY for each one of these things:
//
// - "Thank you for considering our party planning services!"

// - "Enter a bit of information to give us an idea about what kind of party you will be throwing:"

// - How many guests do you expect will be attending?

// - Please select a menu option: steak & potatoes, spam & eggs, seafood, light snacks

// - What kind of beverages would you like to provide: open full bar, limited bar, non-alcoholic drinks, budget drinks

// - What kind of entertainment would you like: DJ, live band, none;

//
// METHOD/METHODS:
// You need to create a method to evaluate these details and return an estimate cost using your own formula

// WHAT IS THIS GOING TO LOOK LIKE:
//
// You are going to have- in PartyPlanning.java
// Class and constructor
//
// - Method to "getGuests"
// - Method to "getMeal"
// - Method to "getDrinks"
// - Method to "getEntertainment"
