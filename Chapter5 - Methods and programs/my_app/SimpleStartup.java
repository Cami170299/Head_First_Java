public class SimpleStartup {

  private int[] locationCells;
  private int numOfHits = 0;

  public void setLocation(int[] locations) {
    locationCells = new int[3];
    locationCells = locations;
  }

  public String checkYourself(int usersGuess) {
    String result = "Miss";

    for (int cell : locationCells) {
      if (usersGuess == cell) {
        result = "Hit";
        numOfHits++;
        break;
      }
    }

    if (numOfHits == locationCells.length) {
      result = "Kill";
    }

    System.out.println(result);

    return result;
  }

}
