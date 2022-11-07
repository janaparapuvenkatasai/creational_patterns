package AbstractFactory.Amex;

import AbstractFactory.CreditCard;
import AbstractFactory.CreditCardFactory;
import AbstractFactory.CreditCardType;
import AbstractFactory.Validators;

public class AmexFactory extends CreditCardFactory{

    @Override
    protected CreditCard getCreditCard ( CreditCardType creditCardType ) {
        switch (creditCardType) {
            case GOLD:
                return new AmexGoldCreditCard ();
            case PLATINUM:
                return new AmexPlatinumCreditCard ();
            default:
                return null;
        }
    }

    @Override
    protected Validators getValidator ( CreditCardType creditCardType ) {
        switch (creditCardType) {
            case GOLD:
                return new AmexGoldValidator ();
            case PLATINUM:
                return new AmexPlatinumValidator ();
            default:
                return null;
        }
    }
}
