public class Assignation {
  public static void main(String[] args) {
    Feline mycat = new Cat();
    mycat.drink("");
    mycat.eat("");
  }
}

class Feline {
  void drink(String liquid) {
    if (liquid != "") {
      System.out.println("Dringking " + liquid);
    } else {
      System.out.println("Drinking");
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
