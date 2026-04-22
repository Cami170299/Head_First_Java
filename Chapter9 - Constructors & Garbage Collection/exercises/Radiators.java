import java.util.ArrayList;

class V2radiator {
  V2radiator(ArrayList<SimUnti> list) {
    for (int x = 0; x < 5; x++) {
      list.add(new SimUnti("Regular"));
    }
  }
}

class V3radiator extends V2radiator {
  V3radiator(ArrayList<SimUnti> v3list) {
    super(v3list);
    for (int x = 0; x < 5; x++) {
      v3list.add(new SimUnti("V3radiator"));
    }
  }
}

class SimUnti {
  private String rType;

  SimUnti(String inputType) {
    rType = inputType;
  }

  public String getType() {
    return rType;
  }
}

public class Radiators {
  public static void main(String[] args) {
    ArrayList<SimUnti> aList = new ArrayList<SimUnti>();
    V3radiator v3 = new V3radiator(aList);
    for (SimUnti s : aList) {
      System.out.println(s.getClass() + " is equal to " + s.getType());
    }
  }
}
