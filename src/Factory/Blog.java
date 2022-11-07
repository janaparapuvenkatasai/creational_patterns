package Factory;

import Factory.Pages.AboutPage;
import Factory.Pages.ContactPage;

public class Blog extends Website{


    // Step 1.4 Website constructor calls createWebsite which is extended to Blog class
    @Override
    protected void createWebsite ( ) {
        // pages is an ArrayList in Website
        pages.add ( new AboutPage () );
        pages.add ( new ContactPage () );
    }
}
