package cput.ac.za.conf.factory.Impl;

import cput.ac.za.conf.factory.StudentFactory;
import cput.ac.za.domain.*;

import java.util.List;

/**
 * Created by student on 2016/04/02.
 */
public class StudentFactoryImpl implements StudentFactory
{
    private static StudentFactoryImpl studentFactory = null;

    private StudentFactoryImpl() {
    }
    public static StudentFactoryImpl getInstance(){
        if(studentFactory ==null)
            studentFactory = new StudentFactoryImpl();
        return studentFactory;
    }

    @Override
    public  Student createStudent(String level, StudyPlace studyPlace,PersonDetails personDetails,
                                  Contacts contacts, Address address, List<Payment> payments,
                                  Room room)
    {
        Student student = new Student.Builder().personDetails(personDetails)
                                    .studyPlace(studyPlace)
                                    .levelOfStudy(level)
                                    .contacts(contacts)
                                    .address(address)
                                    .room(room)
                                    .payments(payments)
                                    .build();
        return student;
    }
}
