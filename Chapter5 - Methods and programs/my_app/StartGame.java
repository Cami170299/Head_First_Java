import java.util.Random;
import java.util.Scanner;

public class StartGame {
  public static void main(String[] args) {

    // Start a new session for the user
    SimpleStartup playing = new SimpleStartup();

    // Set startup locations
    Random random = new Random();
    int randomNumber = (int) (random.nextInt(3));
    int[] locations = { randomNumber, randomNumber + 1, randomNumber + 2 };
    playing.setLocation(locations);

    // playing the game by gessing until you succeed
    while (true) {
      // get user's input
      Scanner input = new Scanner(System.in);
      int usersGuess = input.nextInt();
      // Check the if the input is a hit.
      String howAreWeDoing = playing.checkYourself(usersGuess);
      if (howAreWeDoing.equals("Kill")) {
        break;
      }
    }

  }
}
