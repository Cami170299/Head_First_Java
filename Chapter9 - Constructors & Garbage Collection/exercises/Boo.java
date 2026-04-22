public class Boo {
  public Boo(int i) {
  };

  public Boo(String s) {
  };

  public Boo(String s, int i) {
  };
}

class SonOfBoo extends Boo {
  public SonOfBoo() {
    super("boo");
  }

  public SonOfBoo(int i) {
    super("Fred");
  }

  public SonOfBoo(String s) {
    super(42);
  }

  // This does not compile die to the oerder of the parameter variables
  // public SonOfBoo(int i, String s) {
  //
  // }

}
