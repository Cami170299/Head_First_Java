import java.util.Scanner;

import jdk.internal.org.jline.terminal.impl.jna.linux.CLibrary.winsize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GameHelper {

  // Declare main variable group

  private static final String ALPHABET = "abcdefg";
  private static final int GRID_LENGTH = 7;
  private static final int MAX_ATTEMPTS = 200;
  private static final int GRID_SIZE = 49;
  static final int HORIZONTAL_INCREMENT = 1;
  static final int VERTICAL_INCREMENT = 1;

  private final int[] grid = new int[GRID_SIZE];
  private final Random random = new Random();
  private int startupCount = 0;

  public String UserInput(String prompt) {
    System.out.println(prompt + ": ");
    Scanner in = new Scanner(System.in);
    String userReply = in.nextLine().toLowerCase();
    in.close();
    return userReply;
  }

  // We will keep the User input fimction for the guesses as is.
  public ArrayList<String> placeStartup(int startupSize) {
    int[] startupCoords = new int[startupSize];
    int attempts = 0;
    boolean success = false;

    startupCount++;
    int increment = getIncrement();

    while (!success & attempts++ < MAX_ATTEMPTS) {
      int location = random.nextInt(GRID_SIZE);

      for (int i = 0; i < startupCoords.length; i++) {
        startupCoords[i] = location;
        location += increment;
      }
      System.out.println("Trying: " + Arrays.toString(startupCoords));

      if (startupFits(startupCoords, increment)) {
        success = coordsAvailable(startupCoords);
      }
    }
    savePositionToGrid(startupCoords);
    ArrayList<String> alphaCells = convertCoordsToAlphaFormat(startupCoords):
    System.out.println("Placed at: " + alphaCells);
    return alphaCells;
  }

}
