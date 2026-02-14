// Variables can be stored in two groups; PRIMITIVES & REFERENCES-(Object reference)

// PRIMITIVE TYPES

import java.util.Arrays;

class PrimitiveTypes {
  void showNonNumeric() {

    // Boolean
    boolean myBoolean = true; // Hold only the values "true" or "false"
    System.out.println("Boolean");
    System.out.println("Size: can vary depending on the JVM");
    System.out.println(myBoolean);
    System.out.println();

    // Char (Character)
    char myChar = 'A'; // Holds only one character from hex in string type "a" "Z" or "%"...
    System.out.println("Char (Character)");
    System.out.println("Size: 16 bits");
    System.out.println(myChar);
    System.out.println();
  }

  void showNumeric() {

    // Byte
    byte myByte = 126; // Hold a numeric value (integer) from -128 to 127
    System.out.println("Byte");
    System.out.println("Size: 8 bits");
    System.out.println(myByte);
    System.out.println();

    // Short
    short myShort = 32766; // Hold a numeric value (integer) from -32768 to 32767
    System.out.println("Short");
    System.out.println("Size: 16 bits");
    System.out.println(myShort);
    System.out.println();

    // int
    int myInt = 100;
    System.out.println("*.Integer"); // Hold a numeric value (integer) from -2.1 million to 2.1 million
    System.out.println("*.Size: 32 bits");
    System.out.println(myInt);
    System.out.println();

    // long
    long myLong = 200000000;
    System.out.println("*.Long"); // Hold - to + quintillions
    System.out.println("*.Size: 64 bits");
    System.out.println(myLong);
    System.out.println();

    // float
    float myFloat = 23.446f;
    System.out.println("*.Float"); // Hold values from semi large floar decimals - and +
    System.out.println("Size: 32 bits");
    System.out.println(myFloat);
    System.out.println();

    // double
    double myDoble = 23.4482937466d;
    System.out.println("Double"); // Hold values from semi large floar decimals - and +
    System.out.println("Size: 64 bits");
    System.out.println(myDoble);
    System.out.println();

  }
}

class nonPrimitiveTypes {
  void objectReference() {

    // Reference type values are a collection of bits that shows the way to get an
    // object and their methods.
    PrimitiveTypes myReferenceValue = new PrimitiveTypes();

    // By having the bits for the object's "address" we can now access and use the
    // object's location in the (Garbage-collectable heap) to run it's methods or
    // access; it's intant variables
    myReferenceValue.showNonNumeric();
  }

  public void arrays() {
    // ARREYS
    // declaring and assigning the integer array
    int[] nums = new int[7];

    // assigning a value to each variable whin the integer array
    nums[0] = 1;
    nums[1] = 2;
    nums[2] = 3;
    nums[3] = 4;
    nums[4] = 5;
    nums[5] = 6;
    nums[6] = 7;

    // printing the values of the integer array.
    // by tranforming the Array into a string.
    System.out.println(Arrays.toString(nums));

    // Declaring and ssigning another array of floats for Ex.
    float[] contants = { 3.1416f, 2.718f };

    // Printing the array information
    System.out.println(contants[0]);

  }
}

public class javaTypes {
  public static void main(String[] args) {

    // Creating primitive types
    // PrimitiveTypes myPrimitiveTypes = new PrimitiveTypes();
    // myPrimitiveTypes.showNonNumeric();
    // myPrimitiveTypes.showNumeric();

    nonPrimitiveTypes object = new nonPrimitiveTypes();
    object.arrays();
  }
}
