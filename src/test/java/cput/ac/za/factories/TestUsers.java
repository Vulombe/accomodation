package cput.ac.za.factories;

import cput.ac.za.conf.factory.UserTypeFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by student on 2016/04/06.
 */
public class TestUsers
{
    private UserTypeFactory userTypeFactory;

    @BeforeMethod
    public void setUpUserType() throws Exception {
        userTypeFactory = UserTypeFactory.getUserTypeFactoryinstance();
    }

    @Test
    public void testUserType() throws Exception
    {
        userTypeFactory.userType("Administrator");
    }
}
