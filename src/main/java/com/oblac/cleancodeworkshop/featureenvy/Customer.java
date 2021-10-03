package com.oblac.cleancodeworkshop.featureenvy;

/**
 * Example of feature envy class!
 * Customer reads too much data from the address.
 */
public class Customer {
    private String name;
    private Address currentAddress;

    public Customer(String name, Address address) {
        this.name = name;
        this.currentAddress = address;
    }

    public void printAddress() {
        System.out.println(
            currentAddress.getAddressLine1() + "\n" + currentAddress.getAddressLine2() + "\n" +
                currentAddress.getCity() + ", " + currentAddress.getState() + "\n" +
                currentAddress.getPostalCode());
    }

    // other methods related to customer class.....

}
