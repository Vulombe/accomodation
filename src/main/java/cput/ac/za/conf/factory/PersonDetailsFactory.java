package cput.ac.za.conf.factory;

import cput.ac.za.domain.PersonDetails;

import java.util.Date;
import java.util.Map;

/**
 * Created by student on 2016/04/02.
 */
public interface PersonDetailsFactory
{
    public PersonDetails createPersonDetails(Map<String,String> names,Map<String,String> details,
                                             Date dob);
}
