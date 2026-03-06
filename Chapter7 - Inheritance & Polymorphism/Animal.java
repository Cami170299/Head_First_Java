public class Animal {

  private String name;

  public void setName(String inputName) {
    name = inputName;
  }

  public void getName() {
    System.out.println(name);
  }

  public void roam() {
    System.out.println("Roamming around...");
  }

  public void eat() {
    System.out.print("Eating something...");
  }

  public void makeSound() {
    System.out.println("Making random sound");
  }

  public static void main(String[] args) {

    Animal[] myPets = new Animal[2];

    myPets[0] = new Dog();
    myPets[1] = new Cat();

    myPets[0].name = "Jack";
    myPets[1].name = "Queso";

    for (Animal thePet : myPets) {
      thePet.getName();
      thePet.makeSound();
    }

  }
}

class Dog extends Animal {
  @Override
  public void makeSound() {
    System.out.println("Wouff Wouff");
  }
}

class Cat extends Animal {
}
