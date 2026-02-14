public class PhraseOMatic {
  public static void main(String[] args) {
    String[] fruits = { "apple", "banana", "cherry", "date", "elderberry" };
    String[] verbs = { "run", "jump", "write", "read", "sing", "dance", "think", "build", "drive", "create" };
    String[] places = { "mountain", "beach", "forest", "city", "village", "desert", "island", "river", "park", "museum",
        "castle", "library", "market", "stadium", "restaurant" };
    // find the lenght of a String[] a.k.a List
    System.out.println("the Fruit list has: " + fruits.length + " Itmes");
    System.out.println("the Verbs list has: " + verbs.length + " Itmes");
    System.out.println("the Places list has: " + places.length + " Itmes");
    // assignating the value to a variable
    int fruitsLenght = fruits.length;
    int verbsLenght = verbs.length;
    int placesLenght = places.length;
    // Creating 3 random numbers
    java.util.Random randomNumber = new java.util.Random();
    int randomFruit = randomNumber.nextInt(fruitsLenght);
    int randomVerb = randomNumber.nextInt(verbsLenght);
    int randomPlace = randomNumber.nextInt(placesLenght);
    // Building phrases
    String phrase = fruits[randomFruit] + " " + verbs[randomVerb] + " " + places[randomPlace];
    // print a phrase
    System.out.println(phrase);
  }
}
