package cput.ac.za.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by student on 2016/04/01.
 */
public class Student implements Serializable
{

    private Long studentID;
    private PersonDetails personDetails;
    private String levelOfStudy;
    private Contacts contacts;
    private Address address;
    private String validate;
    private List<Payment> payments;
    private Room room;

    private Student(){}
    public Student(Builder builder)
    {
        studentID = builder.studentID;
        contacts = builder.contacts;
        levelOfStudy = builder.levelOfStudy;
        address = builder.address;
        payments = builder.payments;
        validate = builder.validate;
        room = builder.room;

    }
    public Long getStudentID() {
        return studentID;
    }

    public Contacts getContacts() {
        return contacts;
    }
    public String getLevelOfStudy() {
        return levelOfStudy;
    }
    public Address getAddress() {
        return address;
    }
    public List<Payment> getPayments() {
        return payments;
    }
    public Room getRoom() {
        return room;
    }
    public String getValidate() {
        return validate;
    }


    public PersonDetails getPersonDetails() {
        return personDetails;
    }

    public static class Builder
    {
        private Long studentID;
        private PersonDetails personDetails;
        private String levelOfStudy;
        private Address address;
        private Contacts contacts;
        private List<Payment> payments;
        private Room room;
        private String validate;

        public Builder studentID(Long value){
            this.studentID = value;
            return this;
        }

        public Builder personDetails(PersonDetails value){
            this.personDetails = value;
            return this;
        }
        public Builder levelOfStudy(String value){
            this.levelOfStudy = value;
            return this;
        }
        public Builder address(Address value)
        {
            this.address = value;
            return this;
        }
        public Builder contacts(Contacts value)
        {
            this.contacts = value;
            return this;
        }
        public Builder payments(List<Payment> value)
        {
            this.payments = value;
            return this;
        }
        public Builder validate(String value)
        {
            this.validate = value;
            return this;
        }
        public Builder room(Room value)
        {
            this.room = value;
            return this;
        }

        public Builder copy(Student value){

            this.studentID = value.getStudentID();
            this.personDetails = value.getPersonDetails();
            this.levelOfStudy = value.getLevelOfStudy();
            this.address = value.getAddress();
            this.contacts = value.getContacts();
            this.payments = value.getPayments();
            this.room = value.getRoom();
            this.validate = value.getValidate();

            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        if (!studentID.equals(student.studentID)) return false;
        return true;
    }

}
