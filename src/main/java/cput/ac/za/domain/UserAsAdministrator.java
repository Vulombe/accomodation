package cput.ac.za.domain;

import cput.ac.za.conf.factory.UserFactory;
import cput.ac.za.conf.factory.UserTypeFactory;

/**
 * Created by student on 2016/04/02.
 */
public class UserAsAdministrator implements UserTypeFactory
{
    public String userType()
    {
        return "User As Administrator";
    }
}
