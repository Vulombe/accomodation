package cput.ac.za.conf.factory.Impl;

import cput.ac.za.conf.factory.RoomFactory;
import cput.ac.za.domain.Booking;
import cput.ac.za.domain.Room;
import cput.ac.za.domain.RoomType;

/**
 * Created by student on 2016/04/02.
 */
public class RoomFactoryImpl implements RoomFactory
{
    private static RoomFactoryImpl roomFactory = null;

    private RoomFactoryImpl() {
    }
    public static RoomFactoryImpl getInstance(){
        if(roomFactory ==null)
            roomFactory = new RoomFactoryImpl();
        return roomFactory;
    }

    @Override
    public Room createRoom(int floorNumber, Booking booking, RoomType roomType)
    {
        Room room = new Room.Builder().floorNumber(floorNumber)
                            .roomType(roomType)
                            .booking(booking).build();
        return room;
    }
}
