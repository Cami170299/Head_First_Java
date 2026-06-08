// All Java classes inherit from the"super-class"Object This"super-class"counts with a set of methods that will apply to ANY class in Java

import java.util.ArrayList;

public class TheObjectClass {
  public static void main(String[] args) {
    AnyObject o1 = new AnyObject();
    // Some Examples of those methods are.

    // We have already used a couple of them for example "equals()"
    System.out.println(o1.equals(o1));
    // We can get the class that was instantiated "getClass()"
    System.out.println(o1.getClass());
    // We can also get hte hash code of the objext itself "hashCode()"
    System.out.println(o1.hashCode());
    // We ca print the string message of the class "toString()"
    System.out.println(o1.toString());

    o1.createAnimalList();

  }
}

class Animal {
  public void exists() {
    // existing
  }
}

class Dog extends Canine implements Pet {

  // Set of Abstract methods that MUST be implemented
  @Override
  boolean extinct() {
    return false;
  };

  @Override
  public void beNice() {
    // Just be nice
  };

  @Override
  public Boolean pettable() {
    return true;
  };

  // do something else
  public void bark() {
    System.out.println("Wouff !!");
  }

  @Override
  public boolean equals(Object anObject) {
    if (this instanceof Dog) {
      return true;
    } else {
      return false;
    }
  }
}

class AnyObject {
  public void createAnimalList() {
    // Creating a ArrayList of type ANIMAL
    ArrayList<Animal> myAnimals = new ArrayList<Animal>();

    // This is a Dog which reference variable is declared as type Dog as well
    Dog scooby = new Dog();

    // For Clifford the reference variable is "Animal"
    Animal clifford = new Dog();
    // This means that clifford is only able to do what an "Animal" class can do.
    // And NOT what a Dog class can do (even tho the object is a Dog)

    myAnimals.add(scooby);
    myAnimals.add(clifford);
    // Now by adding the Dog reference variable inside a ArrayList type "Animal"
    // "scooby"
    // which was a Dog now is now a Animal whn you try to fet it
    // WHY ??
    // Cause the now reference to retrieve the object's address is assigned as an
    // "Animal" class
    // not a "Dog" class

    // WHOW CAN WE SOlVE THIS ??
    // by casting the correct class for the requested object

    Dog myDogInstance = (Dog) myAnimals.get(0);

    myDogInstance.bark();

  }
}
