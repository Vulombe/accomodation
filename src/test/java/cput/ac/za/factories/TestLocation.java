package cput.ac.za.factories;

import cput.ac.za.conf.factory.AddressFactory;
import cput.ac.za.conf.factory.Impl.AddressFactoryImpl;
import cput.ac.za.conf.factory.Impl.LocationFactoryImpl;
import cput.ac.za.conf.factory.LocationFactory;
import cput.ac.za.domain.Address;
import cput.ac.za.domain.Location;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2016/04/02.
 */
public class TestLocation
{
    private AddressFactory addressFactory;
    private LocationFactory locationFactory;
    private Address address;
    private Location location;

    @BeforeMethod
    public void setUpLocation() throws Exception
    {
        addressFactory = AddressFactoryImpl.getInstance();
        locationFactory = LocationFactoryImpl.getInstance();
    }

    @Test
    public void testLocation() throws Exception
    {
        Map<String,String> addressDetails = new HashMap<String, String>();
        String buildingName = "NMJ";
        addressDetails.put("Western Cape","Cape Town");
        address = addressFactory.createAddress(addressDetails,"Dorset","8001");
        location = locationFactory.createLocation(buildingName,address);

        Assert.assertEquals(location.getBuildingName(),"NMJ");
    }

    @Test
    public void testUpdateLocation() throws Exception {
        Location updateLocation = new Location.Builder().copy(location).buildingName("NMJ2").build();
        Assert.assertEquals(updateLocation.getBuildingName(),"NMJ2");
    }
}
