package AbstractFactory.Visa;

import AbstractFactory.CreditCard;
import AbstractFactory.Validators;

public class VisaGoldValidator implements Validators{
    @Override
    public boolean isValid ( CreditCard creditCard ) {
        return false;
    }
}
