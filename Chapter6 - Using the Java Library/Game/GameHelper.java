import java.util.Scanner;

public class GameHelper {
  public int getUserInput(String prompt) {
    System.out.println(prompt + " ");
    Scanner in = new Scanner(System.in);
    int userReply = in.nextInt();
    in.close();
    return userReply;
  }
}
