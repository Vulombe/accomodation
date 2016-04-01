package cput.ac.za.domain;

import java.io.Serializable;

/**
 * Created by student on 2016/04/01.
 */
public class Booking implements Serializable
{
    private String date;
    private String numOfDays;
    private Booking(){}
    public Booking(Builder builder)
    {
        date = builder.date;
        numOfDays = builder.numOfDays;
    }
    public String getNumOfDays() {
        return numOfDays;
    }
    public String getDate() {
        return date;
    }
    public static class Builder
    {
        private String date;
        private String numOfDays;
        public Builder date(String value)
        {
            this.date = value;
            return this;
        }
        public Builder numOfDays(String value)
        {
            this.numOfDays = value;
            return this;
        }
        public Builder copy(Booking value)
        {
            this.numOfDays = value.getNumOfDays();
            this.date = value.getDate();
            return this;
        }
        public Booking build(){return new Booking(this);}
    }
}
