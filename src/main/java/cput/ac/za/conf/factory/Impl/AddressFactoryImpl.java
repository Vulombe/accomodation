package cput.ac.za.conf.factory.Impl;

import cput.ac.za.conf.factory.AddressFactory;
import cput.ac.za.domain.Address;

import java.util.Map;

/**
 * Created by student on 2016/04/02.
 */
public class AddressFactoryImpl implements AddressFactory
{
    private static AddressFactoryImpl addressFactory = null;

    private AddressFactoryImpl() {
    }
    public static AddressFactoryImpl getInstance(){
        if(addressFactory ==null)
            addressFactory = new AddressFactoryImpl();
        return addressFactory;
    }

    @Override
    public Address createAddress(
            Map<String, String> values,
            String street, String cityCode)
    {
        Address address = new Address
                .Builder()
                .province(values.get("province"))
                .city(values.get("city"))
                .street(street)
                .cityCode(cityCode)
                .build();
        return address;
    }
}
