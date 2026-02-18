import java.util.Scanner;
import java.util.ArrayList;

public class GameHelper {

  public String getUserInput(String prompt) {
    System.out.println(prompt + ": ");
    Scanner in = new Scanner(System.in);
    String userReply = in.nextLine();
    in.close();
    return userReply;
  }

  public ArrayList<String> placeStartup(int value) {
    ArrayList<String> myValue = new ArrayList<String>();
    myValue.add("Hello");
    return myValue;
  }
}
