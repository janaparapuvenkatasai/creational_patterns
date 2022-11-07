package Factory;

public class WebsiteFactory{


    // step 1.1
    public static Website getWebsites( WebsiteType websiteType) { //

        switch (websiteType) {
            case BLOG:
                //step 1.2 website type matches with blog
                return new Blog ();
            case SHOP:
                return new Shop ();
            default:
                return null;
        }
    }
}
