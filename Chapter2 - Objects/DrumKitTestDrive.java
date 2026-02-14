class DrumKit {
  // Cret the intances of the method.

  boolean snare = true;
  boolean topHat = true;

  // Crathe the methods of the Class
  void playSnare() {
    System.out.println("Playing the Snare!!");
  }

  void playtopHat() {
    System.out.println("Playing the Top Hat!!");
  }

}

class DrumKitTestDrive {
  public static void main(String[] args) {

    // Create the object itself
    DrumKit d = new DrumKit();

    d.playSnare();
    d.snare = false;
    d.playtopHat();

    if (d.snare == true) {
      d.playSnare();
    }

  }
}
