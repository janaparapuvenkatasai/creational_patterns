package AbstractFactory;

import AbstractFactory.Amex.AmexFactory;
import AbstractFactory.Visa.VisaFactory;

public abstract class CreditCardFactory{

    public static CreditCardFactory getCreditCardFactory(int creditScore) {

        if(creditScore > 650 ){
            return new AmexFactory ();
        }else {
            return new VisaFactory ();
        }

    }

    protected abstract CreditCard getCreditCard(CreditCardType creditCardType);
    protected abstract Validators getValidator( CreditCardType c);
}
