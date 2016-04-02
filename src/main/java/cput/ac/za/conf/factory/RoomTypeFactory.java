package cput.ac.za.conf.factory;

import cput.ac.za.domain.RoomType;

/**
 * Created by student on 2016/04/02.
 */
public interface RoomTypeFactory
{
    public RoomType createRoomType(String status, String type);
}
