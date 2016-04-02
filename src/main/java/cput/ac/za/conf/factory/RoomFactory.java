package cput.ac.za.conf.factory;

import cput.ac.za.domain.Booking;
import cput.ac.za.domain.Room;
import cput.ac.za.domain.RoomType;

/**
 * Created by student on 2016/04/02.
 */
public interface RoomFactory
{
    public Room createRoom(int floorNumber, Booking booking, RoomType roomType);
}
