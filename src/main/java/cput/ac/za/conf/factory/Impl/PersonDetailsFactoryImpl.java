package cput.ac.za.conf.factory.Impl;

import cput.ac.za.conf.factory.PersonDetailsFactory;
import cput.ac.za.domain.PersonDetails;

import java.util.Date;
import java.util.Map;

/**
 * Created by student on 2016/04/02.
 */
public class PersonDetailsFactoryImpl implements PersonDetailsFactory
{
    private static PersonDetailsFactoryImpl personDetailsFactory = null;

    private PersonDetailsFactoryImpl() {
    }
    private PersonDetailsFactoryImpl getInstance(){
        if(personDetailsFactory ==null)
            personDetailsFactory = new PersonDetailsFactoryImpl();
        return personDetailsFactory;
    }
    @Override
    public PersonDetails createPersonDetails(Map<String,String> names,Map<String,String> details,
                                                    Date dob)
    {
        PersonDetails personDetails = new PersonDetails.Builder()
                .fName(names.get("fName"))
                .lName(names.get("lName"))
                .gender(details.get("gender"))
                .dob(dob)
                .levelOfStudy(details.get("levelOfStudy"))
                .build();
        return personDetails;

    }
}
