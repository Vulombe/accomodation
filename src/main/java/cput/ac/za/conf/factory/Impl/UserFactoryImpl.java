package cput.ac.za.conf.factory.Impl;

import cput.ac.za.conf.factory.UserFactory;
import cput.ac.za.conf.factory.UserTypeFactory;
import cput.ac.za.domain.User;
import cput.ac.za.domain.UserAsAdministrator;
import cput.ac.za.domain.UserAsStudent;


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

    public UserTypeFactory getUserType(String user) {
        if ("Administrator".equalsIgnoreCase(user)) {
            return new UserAsAdministrator();
        } else {
            return new UserAsStudent();
        }
    }

    @Override
    public User createUser(String screenName, String password)
    {
        User user = new User.Builder().screenName(screenName)
                            .password(password).build();
        return user;
    }
}
