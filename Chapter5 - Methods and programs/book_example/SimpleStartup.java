// SimpleStartup
public class SimpleStartup {
  private int[] locationCells;
  private int numberOfHits = 0;

  // Set location cells
  public void setLocationCells(int[] locs) {
    locationCells = locs;
  }

  // check that the game works as spected
  public String checkYourself(int guess) {
    String result = "miss";
    for (int cell : locationCells) {
      if (guess == cell) {
        result = "hit";
        numberOfHits++;
        break;
      }
    }

    if (numberOfHits == locationCells.length) {
      result = "kill";
    }

    // Print the current status
    System.out.println(result);
    return result;
  }
}
