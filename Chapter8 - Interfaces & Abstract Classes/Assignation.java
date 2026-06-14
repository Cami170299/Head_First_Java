public class Assignation {
  public static void main(String[] args) {
    Feline mycat = new Cat();
    mycat.drink("milk");
    // This will not compile as we assigned "Feline" to out Cat instance. So we can
    // only do what a Felina does not what a Cat does.
    // mycat.eat("Tuna");
  }
}

class Feline {
  void drink(String liquid) {
    if (liquid != "") {
      System.out.println("Dringking " + liquid);
    } else {
      System.out.println("Drinking something");
    }
  }
}

class Cat extends Feline {
  void eat(String solid) {
    if (solid != "") {
      System.out.println("Eating " + solid);
    } else {
      System.out.println("Eating something.");
    }
  }
}
