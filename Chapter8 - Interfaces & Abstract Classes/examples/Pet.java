// All interfaces are publi and abstract
interface Pet {

  void beNice();

  Boolean pettable();

}

abstract class Canine extends Animal {
  public boolean isItWild(Integer weight) {
    if (weight >= 100) {
      return false;
    } else {
      return true;
    }
  }

  abstract boolean extinct();

  public void isItFat(Integer weight, Integer height) {

  }
}
