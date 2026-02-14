class InstanceVariablesVSLocal {
  public static void main(String[] args) {

    InstantVariables values = new InstantVariables();

    // This are all the instant variables that have a default value you can actually
    // use them.
    values.getName();
    values.getHeight();
    values.getAge();
    values.getWeight();

  }
}

class InstantVariables {
  private int age;
  private String name;
  private float height;
  private double weight;

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public float getHeight() {
    return height;
  }

  public double getWeight() {
    return weight;
  }

}
