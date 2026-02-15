import java.lang.reflect.Array;
import java.util.ArrayList;

public class StartupBust {

  private GameHelper helper = new GameHelper();
  private ArrayList<Startup> startups = new ArrayList<Startup>();
  private int numOfGuesses = 0;

  private void setUpGame() {
    // Make some startups and give them a location

    Startup one = new Startup();
    one.setName("Poniez");
    Startup two = new Startup();
    two.setName("Hacqi");
    Startup three = new Startup();
    three.setName("Cabista");

    // Adding each of the previously created startups into the ArrayList "startups"
    startups.add(one);
    startups.add(two);
    startups.add(three);

    // Print the obhective of the game to the user
    System.out.println("Your goal is to sink all 3 Startups");
    System.out.println("Poniez, Hacqi & Cabista");
    System.out.println("Poniez, Hacqi & Cabista");

    for (Startup startup : startups) {
      // Creating a random location
      ArrayList<String> newLocation = helper.placeStartup(3);
      // setting the location for each startup (mutating the instance of the objext)
      startup.setLocationCells(newLocation);
    }
  }

  public void CheckUserGuess(String userGuess) {
    // Add +1 everytime that we do a guess check
    numOfGuesses++;
    // Assume that the result is always a miss
    String result = "Miss";

    for (Startup startupToTest : startups) {
      // We are iterating over every startup and useing their "checkYourself" method
      // to see if it is s match
      result = startupToTest.checkYourself(userGuess);

      // If it is a "Hit" we will brack the for loop
      if (result.equals("Hit")) {
        break;
      }
      // We see if the guess is a "Kill", if it is we remove the startup from the
      // ArrayList
      if (result.equals("Kill")) {
        startups.remove(startupToTest);
        break;
      }
    }
    System.out.println(result);
  }

  private void finishkGame() {
    System.out.println("All Startus are dead! Your stock is worthless");
    if (numOfGuesses <= 18) {
      System.out.println("It only took you " + numOfGuesses + " guesses");
      System.out.println("You bailed before it was too late,congrats");
    } else {
      System.out.println("It only took you " + numOfGuesses + " guesses");
      System.out.println("You lost your money !!");
    }
  }

  private void startPlaying() {
    while (!startups.isEmpty()) {
      String userGuess = helper.getUserInput("Enter a Guess");
      CheckUserGuess(userGuess);
    }
    finishkGame();
  }

  public static void main(String[] args) {
    StartupBust game = new StartupBust();
    game.setUpGame();
    game.startPlaying();

  }
}
