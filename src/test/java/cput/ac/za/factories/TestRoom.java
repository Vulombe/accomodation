package cput.ac.za.factories;


import cput.ac.za.conf.factory.BookingFactory;
import cput.ac.za.conf.factory.Impl.BookingFactoryImpl;
import cput.ac.za.conf.factory.Impl.RoomFactoryImpl;
import cput.ac.za.conf.factory.Impl.RoomTypeFactoryImpl;
import cput.ac.za.conf.factory.RoomFactory;
import cput.ac.za.conf.factory.RoomTypeFactory;
import cput.ac.za.domain.Booking;
import cput.ac.za.domain.Room;
import cput.ac.za.domain.RoomType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by student on 2016/04/02.
 */
public class TestRoom
{
    private RoomFactory roomFactory;
    private BookingFactory bookingFactory;
    private RoomTypeFactory roomTypeFactory;
    private Room room;
    private Booking booking;
    private RoomType roomType;

    @BeforeMethod
    public void setUpRoom() throws Exception {
        roomFactory = RoomFactoryImpl.getInstance();
        bookingFactory = BookingFactoryImpl.getInstance();
        roomTypeFactory = RoomTypeFactoryImpl.getInstance();
    }

    @Test
    public void testCreateRoom() throws Exception {
        booking = bookingFactory.createBooking("Monday","15");
        roomType = roomTypeFactory.createRoomType("available", "Single");

        room = roomFactory.createRoom(2,booking,roomType);
        Assert.assertEquals(room.getFloorNumber(),2);
    }

    @Test
    public void testUpdateRoom() throws Exception
    {
        Room updateRoom = new Room.Builder().copy(room)
                                  .floorNumber(3).build();
        Assert.assertEquals(updateRoom.getFloorNumber(),3);
        Assert.assertEquals(booking.getDate(),"Monday");
    }
}
