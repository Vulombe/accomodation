package cput.ac.za.conf.factory;

import cput.ac.za.domain.User;
import cput.ac.za.domain.UserAsAdministrator;
import cput.ac.za.domain.UserAsStudent;

/**
 * Created by student on 2016/04/06.
 */
public class UserTypeFactory {
    private static UserTypeFactory userTypeFactory = null;

    private UserTypeFactory() {
    }

    public static UserTypeFactory getUserTypeFactoryinstance() {
        if (userTypeFactory == null)
            return new UserTypeFactory();
        return userTypeFactory;
    }

    public User userType(String userType) {
        if ("Administrator".equalsIgnoreCase(userType)) {
            return new UserAsAdministrator();
        } else {
            return new UserAsStudent();
        }
    }
}