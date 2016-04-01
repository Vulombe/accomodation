package cput.ac.za.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by student on 2016/04/01.
 */
public class Administrator implements Serializable
{
    private Long empID;
    private Contacts contacts;
    private List<Location> locations;
    private User user;
    private Validation validate;

    private Administrator(){}
    public Administrator(Builder builder)
    {
        empID = builder.empID;
        contacts = builder.contacts;
        locations = builder.locations;
        user = builder.user;
        validate = builder.validate;
    }
    public Long getEmpID() {
        return empID;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public User getUser() {
        return user;
    }

    public Validation getValidate() {
        return validate;
    }

    public static class Builder
    {
        private Long empID;
        private Contacts contacts;
        private List<Location> locations;
        private User user;
        private Validation validate;

        public Builder empID(Long value)
        {
            this.empID = value;
            return this;
        }
        public Builder contacts(Contacts value)
        {
            this.contacts = value;
            return this;
        }
        public Builder locations(List<Location>  value)
        {
            this.locations = value;
            return this;
        }
        public Builder user(User value)
        {
            this.user = value;
            return this;
        }
        public Builder validate(Validation value)
        {
            this.validate = value;
            return this;
        }
        public Builder copy(Administrator value)
        {
            this.empID = value.getEmpID();
            this.contacts = value.getContacts();
            this.locations = value.getLocations();
            this.user = value.getUser();
            this.validate = value.getValidate();
            return this;
        }
        public Administrator build(){return new Administrator(this);}
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Administrator)) return false;
        Administrator resAdmin = (Administrator) o;
        if (!empID.equals(resAdmin.empID)) return false;
        return true;
    }
    @Override
    public int hashCode() {
        return empID.hashCode();
    }
}
