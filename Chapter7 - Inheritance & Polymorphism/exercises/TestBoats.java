class Boat {
  private int lenght;

  public void setLenght(int len) {
    lenght = len;
  }

  public int getLenght(int len) {
    return lenght;
  }

  public void move() {
    System.out.print("Drift");
  }
}

class Sailboat extends Boat {
  @Override
  public void move() {
    System.out.print("Hoist Sail !");
  }
}

class Rowboat extends Boat {
  public void rowTheBoat() {
    System.out.print("Stroke Natasha !");
  }
}

public class TestBoats {
  public static void main(String[] args) {
    Boat b1 = new Boat();
    Sailboat b2 = new Sailboat();
    Rowboat b3 = new Rowboat();

    b2.setLenght(32);
    b1.move();
    b3.move();
    b2.move();
  }
}
