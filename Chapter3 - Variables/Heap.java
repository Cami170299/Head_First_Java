class Heap {
  int id;

  public static void main(String[] args) {
    int x = 0;
    Heap[] hp = new Heap[5];
    while (x < 3) {
      hp[x] = new Heap();
      hp[x].id = x;
      x = x + 1;
    }
    hp[3] = null;
    hp[4] = hp[0];
    hp[0] = hp[4];

    System.out.println(hp[4]);

  }
}
