package cput.ac.za.factories;

import cput.ac.za.conf.factory.Impl.PaymentFactoryImpl;
import cput.ac.za.conf.factory.Impl.PaymentMethodFactoryImpl;
import cput.ac.za.conf.factory.PaymentFactory;
import cput.ac.za.conf.factory.PaymentMethodFactory;
import cput.ac.za.domain.Payment;
import cput.ac.za.domain.PaymentMethod;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by student on 2016/04/02.
 */
public class TestPayment
{
    private PaymentFactory paymentFactory;
    private Payment payment;
    private PaymentMethodFactory paymentMethodFactory;
    private PaymentMethod paymentMethod;

    @BeforeMethod
    public void setUpPayment() throws Exception
    {
        paymentFactory = PaymentFactoryImpl.getInstance();
        paymentMethodFactory = PaymentMethodFactoryImpl.getInstance();
    }

    @Test
    public void testCreatePayment() throws Exception
    {
        paymentMethod = paymentMethodFactory.createPaymentMethod("Cheque");
        payment = paymentFactory.createPayment(2000.00,paymentMethod);

        Assert.assertEquals(payment.getAmountPaid(),2000.00,.00);
    }

    @Test
    public void testUpdatePayment() throws Exception
    {
        Payment updatePayment = new Payment.Builder().copy(payment).amountPaid(3000.00).build();
        Assert.assertEquals(updatePayment.getAmountPaid(),3000.00,.00);
    }
}
