
public class Road {
  public static void main(String[] args) {
    KawasakiZ1000 kawasaki1000 = new KawasakiZ1000();
    kawasaki1000.setBrand("Kawasaki");
    kawasaki1000.setNumberOfWheels(2);
  }
}

interface Vehicle {
  void accelatation();

  void deceleration();

  void setNumberOfWheels(int numOfPossibleWheels);

  void setNumberOfWindows(int numOfPossibleWindows);
}

// Note here we are creating an abstract class that CAN implement all methods
// from "Vehicle" whichout having to declare them.
abstract class Motorcycle implements Vehicle {
  private String brandName;

  private int topSpeed;

  public String setBrand(String potentialBrand) {
    if (potentialBrand != "") {
      brandName = potentialBrand;
      return "The Motorcycle's brand is " + potentialBrand + ".";
    } else {
      brandName = null;
      return "The Brand " + potentialBrand + " is invalid, please review it.";
    }
  }
}

// now lets create a Motorcycle
class KawasakiZ1000 extends Motorcycle {

  private int numberOfWheels;
  private int numOfWindows = 0;

  public void accelatation() {
    System.out.println("0-100 km/h in 5 seconds.");
  }

  public void deceleration() {
    System.out.println("100-0 km/h in 10 seconds.");
  }

  public void setNumberOfWheels(int numOfPossibleWheels) {
    numberOfWheels = numOfPossibleWheels;
  }

  public void setNumberOfWindows(int numOfPossibleWindows) {
    numOfWindows = numOfPossibleWindows;
  }

}
