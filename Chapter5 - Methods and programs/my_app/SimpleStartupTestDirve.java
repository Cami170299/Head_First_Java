public class SimpleStartupTestDirve {
  public static void main(String[] args) {

    // Create a new object.
    SimpleStartup dot = new SimpleStartup();

    // Create and seat testing locations>
    int[] locations = { 2, 3, 4 };
    dot.setLocation(locations);

    // Recrating a "hit"
    int usersGuess = 2;
    String result = dot.checkYourself(usersGuess);

    // Validate the answer expected from the object and provide a result.
    String testResult = "Failed";
    if (result == "Hit") {
      testResult = "Passed";
    }

    // Print the final result
    System.out.println("Hit Test " + testResult);

    usersGuess = 0;
    result = dot.checkYourself(usersGuess);

    testResult = "Failed";
    if (result == "Miss") {
      testResult = "Passed";
    }

    System.out.println("Miss Test " + testResult);

    // add new on to test kill a startup too soon ..
  }
}
