package cput.ac.za.conf.factory.Impl;

import cput.ac.za.conf.factory.AddressFactory;
import cput.ac.za.conf.factory.AdministratorFactory;
import cput.ac.za.domain.*;

import java.util.List;
import java.util.Map;

/**
 * Created by student on 2016/04/02.
 */
public class AdministratorFactoryImpl implements AdministratorFactory
{
    private static AdministratorFactoryImpl administratorFactory = null;

    private AdministratorFactoryImpl(){}
    public static AdministratorFactoryImpl getInstance(){
        if(administratorFactory ==null)
            administratorFactory = new AdministratorFactoryImpl();
        return administratorFactory;
    }
    @Override
    public Administrator createAdmin(PersonDetails personDetails,User user,Validation validate, List<Location> locations,
                                      Contacts contacts)
    {
        Administrator administrator = new Administrator.Builder().personDetails(personDetails)
                .contacts(contacts)
                                            .locations(locations)
                                            .user(user)
                                            .validate(validate)
                                            .build();
        return administrator;
    }
}
