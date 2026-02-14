// Creating a dog Class
// import java.util.Arrays;

class Dog {
  String doggieName;
  int doggieAge;

  void bark() {
    System.out.println("barking laud !!");
  }

  void chase() {
    System.out.println("running after a cat !!");
  }
}

public class myArrays {
  public static void main(String[] args) {
    // We create an array that can hold ONLY Dogs.
    Dog[] pets;
    // We assign a lenght cap of 3
    pets = new Dog[3];

    // Declare a reference variable, create a Dog Object and assign the Object to
    // the reference variable multiple times
    Dog doggieOne = new Dog();
    Dog doggieTwo = new Dog();
    Dog doggieThree = new Dog();

    // We se the characteristics of each doggie

    // Doggie 1
    doggieOne.doggieName = "Max";
    doggieOne.doggieAge = 7;

    // Doggie 2
    doggieTwo.doggieName = "Belky";
    doggieTwo.doggieAge = 4;

    doggieThree = null;

    // Store the values of all doggies on the list
    pets[0] = doggieOne;
    pets[1] = doggieTwo;
    pets[2] = doggieThree;

    for (int i = 0; i < pets.length; i++) {
      if (pets[i] == null) {
        System.out.println("Doggie non-registered");
      } else {
        System.out.println("Hi I am " + pets[i].doggieName + " and I have " + pets[i].doggieAge + " year(s)");
      }
    }

    for (Dog doggie : pets) {
      System.out.print(doggie.doggieName + " is ");
      doggie.chase();
    }
  }
}
