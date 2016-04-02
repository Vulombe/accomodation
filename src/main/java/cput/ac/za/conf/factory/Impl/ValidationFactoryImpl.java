package cput.ac.za.conf.factory.Impl;

import cput.ac.za.conf.factory.ValidationFactory;
import cput.ac.za.domain.Validation;

import java.util.Map;

/**
 * Created by student on 2016/04/02.
 */
public class ValidationFactoryImpl implements ValidationFactory
{
    private static ValidationFactoryImpl validationFactory = null;

    private ValidationFactoryImpl() {
    }
    public static ValidationFactoryImpl getInstance(){
        if(validationFactory ==null)
            validationFactory = new ValidationFactoryImpl();
        return validationFactory;
    }

    @Override
    public Validation createValidation(String studentNumber, double avg,
                                       Map<Integer,Integer> addition)
    {
        Validation validation = new Validation.Builder()
                                              .studentID(studentNumber)
                                              .subjectNumber(addition.get("subjectNumber"))
                                              .sumOfSubjects(addition.get("SumOfSubjects"))
                                              .avgPerc(avg).build();
        return validation;
    }
}
