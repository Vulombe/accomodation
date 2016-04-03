package cput.ac.za.factories;

import cput.ac.za.conf.factory.Impl.UserFactoryImpl;
import cput.ac.za.conf.factory.UserFactory;
import cput.ac.za.domain.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by student on 2016/04/02.
 */
public class TestUser
{
    private UserFactory userFactory;
    private User user;

    @BeforeMethod
    public void setUpUser() throws Exception
    {
        userFactory = UserFactoryImpl.getInstance();
    }

    @Test
    public void testCreateUser() throws Exception
    {
        user = userFactory.createUser("VeeBoi","makhubelev");
        Assert.assertEquals(user.getPassword(),"makhubelev");
    }

    @Test
    public void testUpdateUser() throws Exception
    {
        User updateUser = new User.Builder().copy(user).password("manythings").build();
        Assert.assertEquals(updateUser.getPassword(),"manythings");
    }
}
