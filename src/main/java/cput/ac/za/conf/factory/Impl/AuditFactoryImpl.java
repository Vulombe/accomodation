package cput.ac.za.conf.factory.Impl;

import cput.ac.za.conf.factory.AuditFactory;
import cput.ac.za.domain.Audit;

import java.util.Date;

/**
 * Created by student on 2016/04/02.
 */
public class AuditFactoryImpl implements AuditFactory
{
    public static AuditFactoryImpl auditFactory = null;

    private AuditFactoryImpl() {
    }
    public static AuditFactoryImpl getInstance(){
        if(auditFactory ==null)
            auditFactory = new AuditFactoryImpl();
        return auditFactory;
    }
    @Override
    public Audit createAudit(String action, String lastUser, Date date)
    {
        Audit audit = new Audit.Builder().action(action).lastUser(lastUser)
                                .actionDate(date).build();
        return audit;
    }
}
