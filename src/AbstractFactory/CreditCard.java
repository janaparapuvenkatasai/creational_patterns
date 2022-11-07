package AbstractFactory;

public class CreditCard{

    private int cardNoLength;
    private int cscNumber;

    public int getCardNoLength ( ) {
        return cardNoLength;
    }

    public void setCardNoLength ( int cardNoLength ) {
        this.cardNoLength=cardNoLength;
    }

    public int getCscNumber ( ) {
        return cscNumber;
    }

    public void setCscNumber ( int cscNumber ) {
        this.cscNumber=cscNumber;
    }
}
