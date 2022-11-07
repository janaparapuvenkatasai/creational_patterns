package Prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry{

    private Map< String,Item > items = new HashMap<String, Item> ();


    // step 1
    public Registry() {
        // step 1.1
        loadData(); // load data method is called.
    }


    // step 2 createItem method is called
    public Item createItem(String type) {
        Item item = null;
        try {
            // step 2.1 items map already have Movie object will be returned.
            item = (Item)(items.get(type)).clone (); // here clone is calling Item class clone method and gives a new object
        } catch (CloneNotSupportedException e) {
            System.out.println (e.getMessage ());
        }

        return  item;
    }

    private void loadData ( ) {


        // step 1.2 here movie and book objects are created and added to items Map
        Movie movie = new Movie ();
        movie.setTitle ( "Bhahubali" );
        movie.setPrice ( 250 );
        movie.setRuntime ( "2h 45 min" );
        items.put("Movie", movie);

        Book book = new Book ();
        book.setPrice ( 200 );
        book.setTitle ( "The tale of gutsy ninja" );
        book.setNoOfPages ( 300 );
        items.put ( "Book", book );
    }
}
