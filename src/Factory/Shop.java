package Factory;

import Factory.Pages.ItemPage;
import Factory.Pages.SearchPage;

public class Shop extends Website{
    @Override
    protected void createWebsite ( ) {
        pages.add ( new ItemPage () );
        pages.add ( new SearchPage () );
    }
}
