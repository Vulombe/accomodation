package cput.ac.za.domain;

import java.io.Serializable;

/**
 * Created by student on 2016/04/01.
 */
public class Validation implements Serializable
{
    private String studentID;
    private double avgPerc;
    private int subjectNumber;
    private int sumOfSubjects;
    private Validation(){}
    public Validation(Builder builder)
    {
        studentID = builder.studentID;
        avgPerc = builder.avgPerc;
        subjectNumber = builder.subjectNumber;
        sumOfSubjects = builder.sumOfSubjects;
    }
    public String getStudentID() {
        return studentID;
    }
    public double getAvgPerc() {
        return avgPerc;
    }
    public int getSubjectNumber() {
        return subjectNumber;
    }
    public int getSumOfSubjects() {
        return sumOfSubjects;
    }
    public static class Builder
    {
        private String studentID;
        private double avgPerc;
        private int subjectNumber;
        private int sumOfSubjects;
        public Builder studentID(String value)
        {
            this.studentID = value;
            return this;
        }
        public Builder avgPerc(double value){
            this.avgPerc = value;
            return this;
        }
        public Builder subjectNumber(int value)
        {
            this.subjectNumber = value;
            return this;
        }
        public Builder sumOfSubjects(int value)
        {
            this.sumOfSubjects = value;
            return this;
        }
        public Builder copy(Validation value)
        {
            this.studentID = value.getStudentID();
            this.avgPerc = value.getAvgPerc();
            this.subjectNumber = value.getSubjectNumber();
            this.sumOfSubjects = value.getSumOfSubjects();
            return this;
        }
        public Validation build(){return new Validation(this);}
    }
}
