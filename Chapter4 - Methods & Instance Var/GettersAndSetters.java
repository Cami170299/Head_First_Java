class GettersAndSetters {
  public static void main(String[] arg) {

    Book book1 = new Book();
    Book book2 = new Book();
    Book book3 = new Book();

    book1.setName("Harry Potter");
    book2.setName("Tom Sawyer");
    book3.setName("The Illiad");

    Book[] library = { book1, book2, book3 };

    for (int i = 0; i < 3; i++) {
      System.out.println(library[i].getName());
    }

  }

}

class Book {

  // Declaring the instance variable private so it becomes encapsulated inside the
  // Book class.
  private String title;

  public void setName(String possibleTitle) {
    // Mutators (a.k.a Setter)
    if (possibleTitle.length() < 2) {
      System.out.println("The title is too short");
    } else if (possibleTitle.length() > 30) {
      System.out.println("The title is too long");
    } else {
      this.title = possibleTitle;
    }
  }

  public String getName() {
    // Accessor (a.k.a Getter)
    return this.title;
  }
}
