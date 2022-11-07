package Factory;

import Factory.Pages.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected List< Page > pages = new ArrayList<> ();


    // step 2.1 when get pages is called it will give the blog pages
    public List< Page > getPages ( ) {
        return pages;
    }


    // step 1.3 when new Blog() is initialized it initializes parent constructor
    public Website() {
        this.createWebsite();
    }

    protected abstract void createWebsite ( );
}
