import java.util.ArrayList;

public class myArrayListExample {

  // add some instance variables
  public static String a = "Whoohoo";
  public static String b = "Frog";

  public static void main(String[] args) {

    // Show things with an Array
    myArrayListExample.arrayExamples();

    // Show things with an ArrayList
    myArrayListExample.theArrayLists();

  }

  static void arrayExamples() {

    // Add new objects
    String[] myArray = new String[2];
    myArray[0] = a;
    myArray[1] = b;

    // Get the length
    System.out.println("The Array lenght is: " + myArray.length);

    // Get the values
    System.out.println("The first value is: " + myArray[0]);

    // Get values
    myArray[0] = null;

    // We see that the length of an Array is onto dynamic
    System.out.println("We removed one item now the lenght is still " + myArray.length);

    // Here is how we check if some value is in it
    boolean isInArray = false;
    for (String item : myArray) {
      if (b.equals(item)) {
        isInArray = true;
        break;
      }
    }
    System.out.println("is" + b + " in the list ?\n" + isInArray);

  }

  public static void theArrayLists() {

    // Do with a Arraylis
    ArrayList<String> myArrayList = new ArrayList<String>();

    // How to add stuff
    myArrayList.add(a);
    myArrayList.add(b);

    // How to get the lenght of the array Object
    System.out.println("The Arraylist lenght is: " + myArrayList.size());

    // How to get some values
    System.out.println("The first value is: " + myArrayList.get(0));

    // How to remove stuff (note that in this case the lenght of the ArrayList
    // changes it's "Dynamic")
    myArrayList.remove(1);
    System.out
        .println("We removed one value and now we have: " + myArrayList.size() + " as the lenght of the ArrayList");

    // Here is how we check if some value is in it;
    boolean isIn = myArrayList.contains(a);
    System.out.println("is" + a + " in the list ?\n" + isIn);
  }

}
