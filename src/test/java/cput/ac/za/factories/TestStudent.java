package cput.ac.za.factories;

import cput.ac.za.conf.factory.*;
import cput.ac.za.conf.factory.Impl.*;
import cput.ac.za.domain.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.*;

/**
 * Created by student on 2016/04/02.
 */
public class TestStudent
{
    private ContactsFactory contactsFactory;
    private PersonDetailsFactory personDetailsFactory;
    private AddressFactory addressFactory;
    private StudentFactory studentFactory;
    private Contacts contacts;
    private Room room;
    private List<Payment> payments;
    private PersonDetails personDetails;
    private Address address;
    private Student student;
    private String validate;

    @BeforeMethod
    public void setUpStudent() throws Exception {
        contactsFactory = ContactsFactoryImpl.getInstance();
        personDetailsFactory = PersonDetailsFactoryImpl.getInstance();
        addressFactory = AddressFactoryImpl.getInstance();
        studentFactory = StudentFactoryImpl.getInstance();
    }

    @Test
    public void testCreateStudent() throws Exception {
        Map<String,String> names = new HashMap<String, String>();
        Map<String,String> addressDetails = new HashMap<String, String>();
        names.put("Themba","Makhubele");
        String gender = "Male";
        addressDetails.put("Limpopo","Elim");
        validate = ValidationFactory.getAverage(200,6);
        System.out.println(validate);

        address = addressFactory.createAddress(addressDetails, "Denver", "0826");
        contacts = contactsFactory.createContacts("Thembani@gem.com", "0821147");
        personDetails = personDetailsFactory.createPersonDetails(names,gender,new Date());
        student = studentFactory.createStudent("3rd year",personDetails, contacts,address,payments,room,validate);

        Assert.assertEquals(student.getLevelOfStudy(),"3rd year");
    }

    @Test
    public void testUpdateStudent() throws Exception {
        Student updateStudent = new Student.Builder().copy(student).levelOfStudy("B-Tech").build();
        Assert.assertEquals(updateStudent.getLevelOfStudy(),"B-Tech");
    }
}
