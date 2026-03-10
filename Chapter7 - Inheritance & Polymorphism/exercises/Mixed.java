class A {
  int ivar = 7;

  void m1() {
    System.out.print("A's m1, ");
  }

  void m2() {
    System.out.print("A's m2, ");
  }

  void m3() {
    System.out.print("A's m3, ");
  }
}

class B extends A {
  @Override
  void m1() {
    System.out.print("B's m1, ");
  }
}

class C extends B {
  @Override
  void m3() {
    System.out.print("C's m3, " + (ivar + 6));
  }
}

public class Mixed {
  public static void main(String[] args) {
    A a = new A();
    A b = new B();
    A c = new C();
    A a2 = new C();

    b.m1();
    c.m2();
    a.m3();

    c.m1();
    c.m2();
    c.m3();

    a.m1();
    b.m2();
    c.m3();

    a2.m1();
    a2.m2();
    a2.m3();
  }
}
