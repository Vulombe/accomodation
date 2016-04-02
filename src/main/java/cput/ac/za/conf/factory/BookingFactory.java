package cput.ac.za.conf.factory;

import cput.ac.za.domain.Booking;

/**
 * Created by student on 2016/04/02.
 */
public interface BookingFactory
{
    public Booking createBooking(String date, String numOfDays);
}
