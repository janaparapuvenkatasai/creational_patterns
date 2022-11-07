package AbstractFactory.Amex;

import AbstractFactory.CreditCard;
import AbstractFactory.Validators;

public class AmexGoldValidator implements Validators{
    @Override
    public boolean isValid ( CreditCard creditCard ) {
        return false;
    }
}
