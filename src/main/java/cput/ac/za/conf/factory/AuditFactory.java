package cput.ac.za.conf.factory;

import cput.ac.za.domain.Audit;

import java.util.Date;

/**
 * Created by student on 2016/04/02.
 */
public interface AuditFactory
{
    public Audit createAudit(String action, String lastUser, Date date);
}
