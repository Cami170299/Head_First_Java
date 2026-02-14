import java.util.ArrayList;

public class Startup {

  private ArrayList<String> locationCells;
  private String name;
  // private int[] locationCells;
  // private int numberOfHits = 0;

  // Set location cells
  public void setLocationCells(ArrayList<String> locs) {
    locationCells = locs;
  }

  public void setName(String startupName) {
    name = startupName;
  }

  // Check the user's guess
  public String checkYourself(String guess) {

    // We set a "Default" value. Assuming a miss;
    String result = "miss";
    int index = locationCells.indexOf(guess);

    if (index >= 0) {
      locationCells.remove(index);
      if (locationCells.isEmpty()) {
        result = "kill";
      } else {
        result = "hit";
      }
    }

    // Print the current status
    return result;
  }
}

// The idea would be to improve the code of by making sure we do not count a hit
// for a repeated number from the user
// The best way to achieve this is by an ArrayList one of the many available
// classes from the Java Library.
