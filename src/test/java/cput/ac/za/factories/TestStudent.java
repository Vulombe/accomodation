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
    private PersonDetailsFactory personDetailsFactory;
    private AddressFactory addressFactory;
    private StudentFactory studentFactory;
    private Room room;
    private List<Payment> payments;
    private PersonDetails personDetails;
    private Address address;
    private Student student;
    private String validate;

    @BeforeMethod
    public void setUpStudent() throws Exception {
        personDetailsFactory = PersonDetailsFactoryImpl.getInstance();
        addressFactory = AddressFactoryImpl.getInstance();
        studentFactory = StudentFactoryImpl.getInstance();
    }

    @Test
    public void testCreateStudent() throws Exception {
        Map<String,String> names = new HashMap<String, String>();
        Map<String,String> addressDetails = new HashMap<String, String>();
        Map<String,String> details = new HashMap<String, String>();
        details.put("Male","tMakhubele@gmai.com");
        names.put("Themba","Makhubele");
        addressDetails.put("Limpopo","Elim");
        validate = ValidationFactory.getAverage(200,6);

        address = addressFactory.createAddress(addressDetails, "Denver", "0826");
        personDetails = personDetailsFactory.createPersonDetails(names,details,new Date());
        student = studentFactory.createStudent(validate,personDetails,address,payments,room);

        Assert.assertEquals(address.getStreet(),"Denver");
    }

    @Test
    public void testUpdateStudent() throws Exception {
        Address updateAddress = new Address.Builder().copy(address).street("Dorset").build();
        Student updateStudent = new Student.Builder().copy(student).address(updateAddress).build();
        Assert.assertEquals(updateAddress.getStreet(),"Dorset");
    }
}
