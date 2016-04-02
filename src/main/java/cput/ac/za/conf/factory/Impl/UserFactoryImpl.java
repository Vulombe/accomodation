package cput.ac.za.conf.factory.Impl;

import cput.ac.za.conf.factory.UserFactory;
import cput.ac.za.domain.User;



/**
 * Created by student on 2016/04/02.
 */
public class UserFactoryImpl implements UserFactory
{
    private static UserFactoryImpl userFactory = null;

    private UserFactoryImpl() {
    }
    public static UserFactoryImpl getInstance(){
        if(userFactory ==null)
            userFactory = new UserFactoryImpl();
        return userFactory;
    }

    @Override
    public User createUser(String screenName, String password)
    {
        User user = new User.Builder().screenName(screenName)
                            .password(password).build();
        return user;
    }
}
