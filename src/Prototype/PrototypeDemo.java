package Prototype;

public class PrototypeDemo{
    public static void main ( String[] args ) {

        // step 1
        Registry registry = new Registry (); // constructor will call load Data, which will add data and object to items Map


        // step 2
        Movie movie = (Movie) registry.createItem ( "Movie" ); // when createItem method is called it will
                                                                    // get the movie object using type Movie from the items map
        movie.setTitle ( "Bhahubali 2" );

        System.out.println (movie);
        System.out.println (movie.getTitle ());
        System.out.println (movie.getRuntime ());
        System.out.println (movie.getPrice ());
        System.out.println (movie.getUrl ());

        Movie anotherMovie = (Movie) registry.createItem ( "Movie" );

        anotherMovie.setTitle ( "Kantara" );


        System.out.println (anotherMovie);
        System.out.println (anotherMovie.getTitle ());
        System.out.println (anotherMovie.getRuntime ());
        System.out.println (anotherMovie.getPrice ());
        System.out.println (anotherMovie.getUrl ());

    }

}
