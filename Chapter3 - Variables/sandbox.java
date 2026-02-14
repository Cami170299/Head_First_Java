public class sandbox {

  public static void main(String[] args) {
    // this is lage comment
    // you can make multiple line
    // one after another

    Dog max = new Dog();
    Dog belky = null;

    belky = max;
    max = belky;

    max.barkName("Max");
    belky.barkName("Belky");
  }

}

class Dog {
  public void barkName(String doggyName) {
    System.out.println(doggyName + " Ouuff!!");
  }
}
