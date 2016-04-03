package cput.ac.za.conf.factory;

import cput.ac.za.domain.*;

import java.util.List;
import java.util.Map;

/**
 * Created by student on 2016/04/02.
 */
public interface AdministratorFactory
{
    public Administrator createAdmin(PersonDetails personDetails,User user,Validation validate, List<Location> locations,
                                     Contacts contacts);

}
