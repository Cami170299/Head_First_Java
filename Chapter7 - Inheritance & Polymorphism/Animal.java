public class Animal {

  // INSTACE VARIABLES

  private String name;
  public double age;

  // ENCAPSULATIONS

  public void setName(String inputName) {
    name = inputName;
  }

  public void getName() {
    System.out.println(name);
  }

  // METHODS

  public void makeSound() {
    System.out.println("Making random sound...");
  }

  public void roam() {
    System.out.println("Roamming around...");
  }

  public void eat() {
    System.out.print("Eating something...");
  }

  // CONSTRUCTORS

  public Animal(String animalName, double animalAgeInHumanYears) {
    this.setName(animalName);
    this.age = animalAgeInHumanYears;
  }

  public Animal() {
    // Empty contructor
  };
}
