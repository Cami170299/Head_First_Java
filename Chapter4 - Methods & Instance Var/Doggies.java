class Doggies {
  public static void main(String[] args) {

    Dog Max = new Dog();
    Max.getWeight(30);
    Max.bark(3);
    Max.eat(9);
    Max.bark(3);

  }
}

class Dog {
  // Setters and getter are a way to protect the ointegrity of the object being
  // created
  //
  //
  // In here we are setting this value as private so our getter and setter can add
  // the value securely having to do a check.
  private int size;

  public void getWeight(int weight) {

    if (weight > 9) {
      size = weight;
    } else {
      System.out.println("The doggies weight should be greater than 9.");
    }

  }

  String barkType() {

    if (size >= 40) {
      return "Wouf Wouf !!";
    } else if (size >= 20) {
      return "Bark Bark !!";
    } else {
      return "Yipp Yipp !!";
    }

  }

  void bark(int numberOfBarks) {
    for (int i = 0; i < numberOfBarks; i++) {

      System.out.println(barkType());

    }
  }

  void eat(int howMuchOneToTen) {
    if (howMuchOneToTen > 8) {
      size = size += 10;
    } else if (howMuchOneToTen > 4) {
      size = size += 6;
    } else {
      size = size += 3;
    }
  }
}
