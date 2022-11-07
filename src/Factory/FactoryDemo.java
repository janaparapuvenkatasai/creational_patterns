package Factory;

public class FactoryDemo{

    public static void main ( String[] args ) {


        // step 1
        Website website = WebsiteFactory
                .getWebsites ( WebsiteType.BLOG ); // method returns new object of Blog or Shop class.
                                                   // Both Blog and Shop classes are extending Website class.
                                                   // In order to get website pages we need to create them first.
                                                   // In Both Blog and Shop classes we have create site method which is
                                                   // overridden from abstract website class.


        // step 2
        System.out.println (website.getPages ()); // gives blog web pages.

        // step 3 follows step 1 and creates new flow
        website = WebsiteFactory.getWebsites ( WebsiteType.SHOP );

        System.out.println (website.getPages ()); // gives shop web pages.
    }
}
