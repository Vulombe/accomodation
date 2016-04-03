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
    public Validation createValidation(double avg,int sum, int numOfSubjects)
    {
        Validation validation = new Validation.Builder()
                                              .subjectNumber(numOfSubjects)
                                              .sumOfSubjects(sum)
                                              .avgPerc(avg).build();
        return validation;
    }
}
