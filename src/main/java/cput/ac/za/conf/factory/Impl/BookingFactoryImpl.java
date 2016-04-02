package cput.ac.za.conf.factory.Impl;

import cput.ac.za.conf.factory.BookingFactory;
import cput.ac.za.domain.Booking;

/**
 * Created by student on 2016/04/02.
 */
public class BookingFactoryImpl implements BookingFactory
{
    private static BookingFactoryImpl bookingFactory = null;

    private BookingFactoryImpl() {
    }
    public static BookingFactoryImpl getInstance(){
        if(bookingFactory ==null)
            bookingFactory = new BookingFactoryImpl();
        return bookingFactory;
    }
    @Override
    public  Booking createBooking(String date, String numOfDays)
    {
        Booking booking = new Booking.Builder()
                .date(date)
                .numOfDays(numOfDays)
                .build();
        return booking;
    }

}
