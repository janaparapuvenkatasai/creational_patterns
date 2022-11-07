package Prototype;

public abstract class Item implements Cloneable{

    private String title;
    private double price;
    private String url;


    //step 2.3
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone(); // every time an object is created when clone method is called,
                              // to achieve this class should implement Cloneable and should be an abstract class
    }

    public String getTitle ( ) {
        return title;
    }

    public void setTitle ( String title ) {
        this.title = title;
    }

    public double getPrice ( ) {
        return price;
    }

    public void setPrice ( double price ) {
        this.price = price;
    }

    public String getUrl ( ) {
        return url;
    }

    public void setUrl ( String url ) {
        this.url = url;
    }


}
