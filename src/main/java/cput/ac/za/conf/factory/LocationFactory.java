package cput.ac.za.conf.factory;

import cput.ac.za.domain.Address;
import cput.ac.za.domain.Location;

/**
 * Created by student on 2016/04/02.
 */
public interface LocationFactory
{
    public Location createLocation(String buildingName, Address bAddress);
}
