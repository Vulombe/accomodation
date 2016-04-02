package cput.ac.za.conf.factory;

import cput.ac.za.domain.PaymentMethod;

/**
 * Created by student on 2016/04/02.
 */
public interface PaymentMethodFactory
{
    public PaymentMethod createPaymentMethod(String paymentMethod);
}
