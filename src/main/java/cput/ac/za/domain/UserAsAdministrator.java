package cput.ac.za.domain;


import cput.ac.za.conf.factory.UserTypeFactory;

/**
 * Created by student on 2016/04/02.
 */
public class UserAsAdministrator implements User
{
    public String userType()
    {
        return "User As Administrator";
    }
}
