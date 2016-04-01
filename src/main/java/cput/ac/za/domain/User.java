package cput.ac.za.domain;

import java.io.Serializable;

/**
 * Created by student on 2016/04/01.
 */
public class User implements Serializable
{
    private Long userID;
    private String screenName;
    private String password;

    private User(){}

    public User(Builder builder)
    {
        userID = builder.userID;
        screenName = builder.screenName;
        password = builder.password;
    }

    public Long getUserID() {
        return userID;
    }

    public String getScreenName() {
        return screenName;
    }

    public String getPassword() {
        return password;
    }

    public static class Builder
    {
        private Long userID;
        private String screenName;
        private String password;

        public Builder userID(Long value)
        {
            this.userID = value;
            return this;
        }
        public Builder screenName(String value)
        {
            this.screenName = value;
            return this;
        }
        public Builder password(String value)
        {
            this.password = value;
            return this;
        }

        public Builder copy(User value)
        {
            this.userID = value.getUserID();
            this.password = value.getPassword();
            this.screenName = value.getScreenName();
            return this;
        }

        public User build(){return new User(this);}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!userID.equals(user.userID)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return userID.hashCode();
    }
}
