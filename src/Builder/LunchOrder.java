package Builder;

public class LunchOrder{

    public static class Builder {

        private String bread;
        private String condiments;
        private String dressing;

        public void setMeat ( String meat ) {
            this.meat=meat;
        }

        private String meat;


        // step 1
        public Builder() {

        }


        // step 3.1
        public LunchOrder build() {

            //step 3.2 here this is builder object and calls private Lunch order constructor
            return new LunchOrder ( this );
        }

        // step 2.1 bread method inside Builder class is assigning Builder bread variable with italian
        public Builder bread( String bread) {
            this.bread = bread;
            return this;
        }

        // step 2.3
        public Builder condiments( String condiments) {
            this.condiments = condiments;
            return this;
        }

        // ste 2.2 dressing method inside Builder class is assigning Builder dress variable with dress
        public Builder dressing( String dressing) {
            this.dressing = dressing;
            return this;
        }

        //step 2.4
        public Builder meat( String meat) {
            this.meat = meat;
            return this;
        }

    }

    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;


    // step 3.3 setting lunch order values from builder object.
    private LunchOrder(Builder builder){
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;

    }

    public String getBread ( ) {
        return bread;
    }

    public String getCondiments ( ) {
        return condiments;
    }

    public String getDressing ( ) {
        return dressing;
    }

    public String getMeat ( ) {
        return meat;
    }

}
