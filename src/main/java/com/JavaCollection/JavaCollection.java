package com.JavaCollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

//Injecting collections
public class JavaCollection {
    List addressList;
    Set addressSet;
    Map addressMap;
    Properties addressProp;

    //a setter method to set List - dependency injection by setter
    public void setAddressList (List addressList) {
        this.addressList = addressList;
    }

    //Prints and returns all the elements of the list
    public List getAddressList() {
        System.out.println("List Elements: " + addressList);
        return addressList;
    }

    //a setter method to set Set
    public void setAddressSet (Set addressSet) {
        this.addressSet = addressSet;
    }

    //prints and returns all the elements of the Set.
    public Set getAddressSet() {
        System.out.println("Set Elements : " + addressSet);
        return addressSet;
    }

    //a setter method to set Map
    public void setAddressMap(Map addressMap) {
     this.addressMap =addressMap;
    }

    //prints and returns all the elements of the Map
    public Map getAddressMap() {
        System.out.println("Map Elements: " + addressMap);
        return addressMap;
    }

    public void setAddressProp(Properties addressProp) {
        this.addressProp = addressProp;
    }

    public Properties getAddressProp() {
        System.out.println("Property Elements :" + addressProp);
        return addressProp;
    }

}
