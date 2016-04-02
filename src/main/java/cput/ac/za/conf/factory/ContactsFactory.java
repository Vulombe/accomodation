package cput.ac.za.conf.factory;

import cput.ac.za.domain.Contacts;

/**
 * Created by student on 2016/04/02.
 */
public interface ContactsFactory
{
    public Contacts createContacts(String email, String cellNumber);
}
