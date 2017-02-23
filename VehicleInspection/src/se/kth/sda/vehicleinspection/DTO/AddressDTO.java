/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.DTO;

/**
 *
 * @author - Shubha , Payal , Vimala
 * The class AddressDTO represent Detailed Address information .
 */
public final class AddressDTO {

    private String street;
    private String city;
    private String zipCode;
    private String state;
    private String country;

    /**
     * This is AddressDTO Constructor 
     * @param street - Street details of a Address
     * @param city - city details of a Address
     * @param zipcode - zipcode details of a Address
     * @param state - state details of a Address
     * @param country - country details of a Address
     */
    public AddressDTO(String street, String city, String zipcode, String state, String country) {
        setStreet(street);
        setCity(city);
        setZipCode(zipcode);
        setState(state);
        setCountry(country);
    }

    /**
     * This is a method to get Street Details of a Address
     * @return - Return street details in string format.
     */
    public String getStreet() {
        return street;
    }

    /**
     * This is a method to set Street Details in Address.
     * @param street - Contains street details.
     */
    public void setStreet(String street) {
        if (street == null || street.isEmpty()) {
            System.out.println("Invalid street name");
        } else {
            this.street = street;
        }
    }

    /**
     * This is a method to get city Details of a Address
     * @return - Return city details in string format.
     */
    public String getCity() {
        return city;
    }

    /**
     * This is a method to set City Details in Address.
     * @param city - Contains city details.
     */
    public void setCity(String city) {
        if (city == null || city.isEmpty()) {
            System.out.println("Invalid city name");
        } else {
            this.city = city;
        }
    }

    /**
     * This is a method to get zipcode Details of a Address
     * @return - Return zipcode details in string format.
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * This is a method to set ZipCode Details in Address.
     * @param zipCode - Contains zipcode details.
     */
    public void setZipCode(String zipCode) {
        if (zipCode == null || zipCode.isEmpty()) {
            System.out.println("Invalid zipCode name");
        } else {
            this.zipCode = zipCode;
        }
    }

    /**
     * This is a method to get State Details of a Address
     * @return - Return state details in string format.
     */
    public String getState() {
        return state;
    }

    /**
     * This is a method to set State Details in Address.
     * @param state - Contains state details.
     */
    public void setState(String state) {
        if (state == null || state.isEmpty()) {
            System.out.println("Invalid state name");
        } else {
            this.state = state;
        }
    }

    /**
     * This is a method to get country Details of a Address
     * @return - Return country details in string format.
     */
    public String getCountry() {
        return country;
    }

    /**
     * This is a method to set Country Details in Address.
     * @param country - Contains country details.
     */
    public void setCountry(String country) {
        if (country == null || country.isEmpty()) {
            System.out.println("Invalid country name");
        } else {
            this.country = country;
        }
    }
}
