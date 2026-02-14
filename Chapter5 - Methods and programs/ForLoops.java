// There are two ways to create for loops
public class ForLoops {
  public static void main(String[] args) {
    // let say we have a one dimensional array of integers
    int[] myInts = { 1, 2, 3, 4, 5 };

    // this is the old way to do for loop before the implementation in Java 5
    for (int i = 0; i < myInts.length; i++) {
      System.out.println(myInts[i]);
    }

    for (int theInt : myInts) {
      System.out.println(theInt);
    }

    Casting myLoop = new Casting();
    myLoop.castingNums();
  }
}

class Casting {
  void castingNums() {
    long int1 = 123;
    int int2;
    // This is how you can cast a number
    int2 = (int) (int1);
    System.out.println(int2);
  }
}
