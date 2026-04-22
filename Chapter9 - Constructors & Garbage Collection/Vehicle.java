public class Vehicle {
  private Wheel wheel_style;
  private Light light_style;

  public Vehicle() {
    this.wheel_style = new Wheel();
  }

  public Vehicle(Wheel wheel_style) {
    this.wheel_style = wheel_style;
  }

  public Vehicle(Wheel wheel_style, Light light_style) {
    this.wheel_style = wheel_style;
    this.light_style = light_style;
  }

  public Wheel getWheelSyle() {
    return wheel_style;
  }

  public Light getLightStyle() {
    return light_style;
  }
}

class Wheel {
  private int size;
  private int number;

  public Wheel() {
    this.size = 10;
    this.number = 4;
  }

  public Wheel(int size) {
    this.size = size;
  }

  public int getWheelSize() {
    return this.size;
  }

  public int getWheelNumber() {
    return this.number;

  }
}

class Light {
  private int size;

  public Light() {
    this.size = 5;
  }

  public Light(int size) {
    this.size = size;
  }

  public int getLightSize() {
    return this.size;
  }
}
