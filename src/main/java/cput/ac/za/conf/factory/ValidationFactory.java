package cput.ac.za.conf.factory;

import cput.ac.za.domain.Validation;

import java.util.Map;

/**
 * Created by student on 2016/04/02.
 */
public interface ValidationFactory
{
    public Validation createValidation(String studentNumber, double avg,
                                       Map<Integer,Integer> addition);
}
