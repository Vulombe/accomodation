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
public class TestAdministrator
{
    private ContactsFactory contactsFactory;
    private PersonDetailsFactory personDetailsFactory;
    private AdministratorFactory administratorFactory;
    private Contacts contacts;
    private PersonDetails personDetails;
    private Administrator administrator;
    private List<Location> location;

    @BeforeMethod
    public void setUpAdministrator() throws Exception
    {
        contactsFactory = ContactsFactoryImpl.getInstance();
        personDetailsFactory = PersonDetailsFactoryImpl.getInstance();
        administratorFactory = AdministratorFactoryImpl.getInstance();
    }

    @Test
    public void testCreateAdministrator() throws Exception
    {
        Map<String,String> names = new HashMap<String, String>();
        String gender = "Male";
        names.put("Vulombe","Makhubele");

        contacts = contactsFactory.createContacts("vma@gg.com","05422147");
        personDetails = personDetailsFactory.createPersonDetails(names,gender,new Date());
        administrator = administratorFactory.createAdmin(personDetails,location,contacts);

        Assert.assertEquals(contacts.getCellNumber(),"05422147");
    }

    @Test
    public void testUpdateAdministrator() throws Exception {
        Contacts contactsUpdate = new Contacts.Builder().copy(contacts).cellNumber("087444").build();
        Administrator updateAdministrator = new Administrator.Builder().copy(administrator)
                                                .contacts(contactsUpdate).build();
        Assert.assertEquals(contactsUpdate.getCellNumber(),"087444");
    }
}
