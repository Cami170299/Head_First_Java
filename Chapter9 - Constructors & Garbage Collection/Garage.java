import java.util.ArrayList;

public class Garage {
  public static void main(String[] args) {
    Bike myBike = new Bike();
    System.out.println(myBike.getWheelSyle());

  }
}

class ParkSpot {
  public ArrayList<Vehicle> spotNumber = new ArrayList<Vehicle>();
}

class Bike extends Vehicle {

}
