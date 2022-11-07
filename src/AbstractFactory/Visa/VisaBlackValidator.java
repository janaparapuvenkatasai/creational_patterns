package AbstractFactory.Visa;

import AbstractFactory.CreditCard;
import AbstractFactory.Validators;

public class VisaBlackValidator implements Validators{


    @Override
    public boolean isValid ( CreditCard creditCard ) {
        return false;
    }
}
