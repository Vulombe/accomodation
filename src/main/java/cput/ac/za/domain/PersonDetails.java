package cput.ac.za.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by student on 2016/04/01.
 */
public class PersonDetails implements Serializable
{
    private String lName;
    private String fName;
    private String gender;
    private String levelOfStudy;
    private Date dob;



    private PersonDetails(){}
    public PersonDetails(Builder builder)
    {
        lName = builder.lName;
        fName = builder.fName;
        gender = builder.gender;
        levelOfStudy = builder.levelOfStudy;
        dob = builder.dob;
    }

    public String getlName() {
        return lName;
    }
    public String getfName() {
        return fName;
    }
    public String getGender() {
        return gender;
    }

    public String getLevelOfStudy() {
        return levelOfStudy;
    }
    public Date getDob() {
        return dob;
    }
    public static class Builder
    {
        private String lName;
        private String fName;
        private String gender;
        private String levelOfStudy;
        private Date dob;

        public Builder lName(String value){
            this.lName = value;
            return this;
        }
        public Builder fName(String value){
            this.fName = value;
            return this;
        }
        public Builder gender(String value){
            this.gender = value;
            return this;
        }
        public Builder levelOfStudy(String value){
            this.levelOfStudy = value;
            return this;
        }
        public Builder dob(Date value){
            this.dob = value;
            return this;
        }

        public Builder copy(PersonDetails value){
            this.fName = value.getfName();
            this.lName = value.getlName();
            this.gender = value.getGender();
            this.levelOfStudy = value.getLevelOfStudy();
            this.dob = value.getDob();
            return this;
        }
        public PersonDetails build(){
            return new PersonDetails(this);
        }
    }

}
