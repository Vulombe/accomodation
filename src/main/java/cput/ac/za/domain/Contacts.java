package cput.ac.za.domain;

import java.io.Serializable;

/**
 * Created by student on 2016/04/01.
 */
public class Contacts implements Serializable
{
    private String email;
    private String cellNumber;
    private Contacts()
    {}
    public Contacts(Builder builder) {
        email=builder.email;
        cellNumber = builder.cellNumber;
    }
    public String getEmail() {
        return email;
    }
    public String getCellNumber() {
        return cellNumber;
    }
    public static class Builder{
        private String email;
        private String cellNumber;
        public Builder email(String email) {
            this.email = email;
            return this;
        }
        public Builder cellNumber(String value){
            this.cellNumber=value;
            return this;
        }
        public Builder copy(Contacts value){
            this.cellNumber=value.getCellNumber();
            this.email=value.getEmail();
            return this;
        }
        public Contacts build(){
            return new Contacts(this);
        }
    }
}
