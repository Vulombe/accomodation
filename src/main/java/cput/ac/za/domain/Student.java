package cput.ac.za.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by student on 2016/04/01.
 */
public class Student implements Serializable
{

    private Long studentID;
    private String levelOfStudy;
    private Contacts contacts;
    private Address address;
    private StudyPlace studyPlace;
    private List<Payment> payments;
    private List<Room> rooms;

    private Student(){}
    public Student(Builder builder)
    {
        studentID = builder.studentID;
        contacts = builder.contacts;
        levelOfStudy = builder.levelOfStudy;
        address = builder.address;
        payments = builder.payments;
        rooms = builder.rooms;
        studyPlace = builder.studyPlace;
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
    public List<Room> getRooms() {
        return rooms;
    }

    public StudyPlace getStudyPlace() {
        return studyPlace;
    }

    public static class Builder
    {
        private Long studentID;
        private String levelOfStudy;
        private Address address;
        private Contacts contacts;
        private StudyPlace studyPlace;
        private List<Payment> payments;
        private List<Room> rooms;

        public Builder studentID(Long value){
            this.studentID = value;
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
        public Builder rooms(List<Room> value)
        {
            this.rooms = value;
            return this;
        }
        public Builder studyPlace(StudyPlace value)
        {
            this.studyPlace = value;
            return this;
        }
        public Builder copy(Student value){

            this.studentID = value.getStudentID();
            this.levelOfStudy = value.getLevelOfStudy();
            this.address = value.getAddress();
            this.contacts = value.getContacts();
            this.studyPlace = value.getStudyPlace();
            this.payments = value.getPayments();
            this.rooms = value.getRooms();
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
