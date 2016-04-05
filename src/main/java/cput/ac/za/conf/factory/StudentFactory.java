package cput.ac.za.conf.factory;

import cput.ac.za.domain.*;

import java.util.List;
import java.util.Map;

/**
 * Created by student on 2016/04/02.
 */
public interface StudentFactory
{

    public  Student createStudent(String level, PersonDetails personDetails,
                                  Contacts contacts, Address address, List<Payment> payments,
                                        Room room,String validate);
}
