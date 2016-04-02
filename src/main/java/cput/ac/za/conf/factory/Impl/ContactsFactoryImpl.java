package cput.ac.za.conf.factory.Impl;

import cput.ac.za.conf.factory.ContactsFactory;
import cput.ac.za.domain.Contacts;

/**
 * Created by student on 2016/04/02.
 */
public class ContactsFactoryImpl implements ContactsFactory
{
    private static ContactsFactoryImpl contactsFactory = null;

    private ContactsFactoryImpl() {
    }
    public static ContactsFactoryImpl getInstance(){
        if(contactsFactory ==null)
            contactsFactory = new ContactsFactoryImpl();
        return contactsFactory;
    }

    @Override
    public Contacts createContacts(String email, String cellNumber)
    {
        Contacts contacts = new Contacts.Builder().cellNumber(cellNumber).email(email)
                                        .build();
        return contacts;
    }
}
