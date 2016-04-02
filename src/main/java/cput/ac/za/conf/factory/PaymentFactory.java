package cput.ac.za.conf.factory;

import cput.ac.za.domain.Payment;
import cput.ac.za.domain.PaymentMethod;

/**
 * Created by student on 2016/04/02.
 */
public interface PaymentFactory
{
    public Payment createPayment(double amountPaid, PaymentMethod paymentMethod);
}
