package Builder;

public class LunchOrderDemo {

    public static void main ( String[] args ) {

        // step 1
        LunchOrder.Builder builder = new LunchOrder.Builder (); // when Builder method is called
                                                                // it is creating an instance for the Builder class

        // step 2 Telescopic constructors
        builder.bread ( "italian" ) // step 2.1 bread method inside Builder class is assigning Builder bread variable with italian
                .dressing ( "dress" ) // ste 2.2 dressing method inside Builder class is assigning Builder dress variable with dress
                .condiments ( "cond" ) // step 2.3
                .meat ( "meat" ); // step 2.4



        // step 3
        LunchOrder order = builder.build (); // build method inside Builder class
                                             // call new LunchOrder(this) here this is builder object
                                             // which internally calls the private constructor or LunchOrder and sets the values
                                             // which assigns Lunch order variables values from builder object


        // step 4
        builder.bread ( "french" ); // assigning a new value to the builder object
                                    // doesn't changes order object value as it is final
                                    // here we are getting immutability.

        System.out.println (order.getBread ());
        System.out.println (order.getCondiments ());
        System.out.println (order.getDressing ());
        System.out.println (order.getMeat ());
    }
}
