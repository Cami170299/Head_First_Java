public class Zoo {
  // Gethering the Animals
  public static Animal[] myAnimals = new Animal[1];

  public static void main(String[] args) {

    Lion myLion = new Lion("Simba", 7, "Sabana");
    Wolf myWolf = new Wolf();

    myAnimals[0] = myLion;
    myAnimals[1] = myWolf;

    for (Animal animal : myAnimals) {
      animal.getName();
      animal.makeSound();
    }
  }
}

class Lion extends Animal {

  private double lionsAge;

  // Lion Cunstructor
  public Lion(String lionsName, double lionsAgeInHumanYears, String lionsEnv) {

    // We can use the Animal "super class" Cunstructor to set the initial work of
    // creating a new Lion

    super(lionsName, lionsAgeInHumanYears);

    // We can use "this" to finish the cunstructor set-up
    this.lionsAge = lionsAgeInHumanYears * 4.7;
  }

  public double getAgeInLionYears() {
    return lionsAge;
  }

}

class Wolf extends Animal {

  @Override
  public void makeSound() {

    super.makeSound();
    System.out.println("Grrr !!");

  }

}
