package cput.ac.za.conf.factory.Impl;

import cput.ac.za.conf.factory.PaymentFactory;
import cput.ac.za.domain.Payment;
import cput.ac.za.domain.PaymentMethod;

/**
 * Created by student on 2016/04/02.
 */
public class PaymentFactoryImpl implements PaymentFactory
{
    private static PaymentFactoryImpl paymentFactory = null;

    private PaymentFactoryImpl() {
    }
    public static PaymentFactoryImpl getInstance(){
        if(paymentFactory ==null)
            paymentFactory = new PaymentFactoryImpl();
        return paymentFactory;
    }

    @Override
    public Payment createPayment(double amountPaid, PaymentMethod paymentMethod)
    {
        Payment payment = new Payment.Builder().paymentMethod(paymentMethod)
                                     .amountPaid(amountPaid).build();
        return payment;
    }
}
