package cput.ac.za.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by student on 2016/04/01.
 */
public class Audit implements Serializable
{
    private String action;
    private Date actionDate;
    private String lastUser;


    private Audit(){}
    public Audit(Builder builder)
    {
        action = builder.action;
        actionDate = builder.actionDate;
        lastUser = builder.lastUser;

    }
    public String getAction() {
        return action;
    }

    public Date getActionDate() {
        return actionDate;
    }

    public String getLastUser() {
        return lastUser;
    }
    public static class Builder
    {
        private String action;
        private Date actionDate;
        private String lastUser;

        public Builder action(String value){
            this.action = value;
            return this;
        }
        public Builder actionDate(Date value){
            this.actionDate = value;
            return this;
        }

        public Builder lastUser(String value){
            this.lastUser = value;
            return this;
        }
        public Builder copy(Audit value){

            this.action = value.getAction();
            this.actionDate = value.getActionDate();
            this.lastUser = value.getLastUser();
            return this;
        }
        public Audit build(){
            return new Audit(this);
        }
    }


}
