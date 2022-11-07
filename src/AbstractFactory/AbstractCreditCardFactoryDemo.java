package AbstractFactory;

public class AbstractCreditCardFactoryDemo{
    public static void main ( String[] args ) {

        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory ( 755 );
        CreditCard factory = abstractFactory.getCreditCard ( CreditCardType.GOLD );
        Validators validators= abstractFactory.getValidator ( CreditCardType.GOLD );

        System.out.println (factory.getClass ());
        System.out.println (validators.getClass ());

        abstractFactory = CreditCardFactory.getCreditCardFactory ( 600 );
        factory = abstractFactory.getCreditCard ( CreditCardType.PLATINUM );
        validators = abstractFactory.getValidator ( CreditCardType.PLATINUM );
        System.out.println (factory.getClass ());
        System.out.println (validators.getClass ());
    }


}
