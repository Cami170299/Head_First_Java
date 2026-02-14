
// Classes are just the blueprint for real object not objects themselfs

class Movie {

  // Instance variables below
  // Instances variables are mostly use to hold 'states' of the object.

  int movieReleaseDate;
  String movieTitle;
  double rating;

  // Now below we will see a method
  // Methods are the action that a class "object" can perform, with external
  // information or it's own Instance variables.

  void playTrailer() {
    System.out.println("Displaying " + movieReleaseDate + "'s " + movieTitle + " trailer now !!");
  }
}

public class MyFirstObject {

  // IN real life the main method is mostly useful for TESTING or LAUNCHING only.

  public static void main(String[] args) {

    // this is an object instance (acutally creating an objecc)

    Movie movie1 = new Movie();
    movie1.movieTitle = "se7en";
    movie1.movieReleaseDate = 2009;
    movie1.rating = 4.7;
    movie1.playTrailer();
  }
}
