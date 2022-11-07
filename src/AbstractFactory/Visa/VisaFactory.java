package AbstractFactory.Visa;

import AbstractFactory.CreditCard;
import AbstractFactory.CreditCardFactory;
import AbstractFactory.CreditCardType;
import AbstractFactory.Validators;

public class VisaFactory extends CreditCardFactory{

    @Override
    protected CreditCard getCreditCard ( CreditCardType creditCardType ) {
        switch (creditCardType) {
            case GOLD:
                return new VisaGoldCreditCard ();
            case PLATINUM:
                return new VisaBlackCreditCard ();
            default:
                return null;
        }
    }

    @Override
    protected Validators getValidator ( CreditCardType creditCardType ) {
        switch (creditCardType) {
            case GOLD:
                return new VisaGoldValidator ();
            case PLATINUM:
                return new VisaBlackValidator ();
            default:
                return null;
        }
    }
}
