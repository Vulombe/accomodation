package cput.ac.za.conf.factory.Impl;

import cput.ac.za.conf.factory.StudentFactory;
import cput.ac.za.domain.*;

import java.util.List;
import java.util.Map;

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
    public  Student createStudent( String validate, PersonDetails personDetails, Address address,
                                  List<Payment> payments, Room room)
    {
        Student student = new Student.Builder().personDetails(personDetails)
                                    .address(address)
                                    .room(room)
                                    .payments(payments)
                                    .validate(validate)
                                    .build();
        return student;
    }
}
