package cput.ac.za.conf.factory;

import cput.ac.za.domain.User;

/**
 * Created by student on 2016/04/02.
 */
public interface UserFactory
{
    public User createUser(String screenName, String password);
}
