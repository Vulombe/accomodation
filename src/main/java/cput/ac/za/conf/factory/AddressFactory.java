package cput.ac.za.conf.factory;

import cput.ac.za.domain.Address;

import java.util.Map;

/**
 * Created by student on 2016/04/02.
 */
public interface AddressFactory
{
    public Address createAddress(Map<String, String> values,
                                 String street, String cityCode);
}
