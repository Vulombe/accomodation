package cput.ac.za.conf.factory;

import cput.ac.za.domain.*;

import java.util.List;
import java.util.Map;

/**
 * Created by student on 2016/04/02.
 */
public interface StudentFactory
{
    public Student createStudent(Map<Contacts,Address> AddressDetails,
                                 Map<String,StudyPlace> studyDetails,
                                 List<Payment> payments,
                                 List<Room> rooms);
}
