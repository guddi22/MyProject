/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.DTO;

/**
 *
 * @author - Shubha , Payal , Vimala
 * This class CustomerDTO is Customer Details
 */
public class CustomerDTO {

    private String drivingLicense;
    private String name;
    private AddressDTO address;
    private String phone;
    private String emailID;

    /**
     * This is Customer DTO Constructor
     * @param drivingLicense - Customer driving license.
     * @param name - Customer name
     * @param address - Customer address which is type AddressDTO
     * @param phone - Customer phone
     * @param email - Customer email
     */
    public CustomerDTO(String drivingLicense, String name, AddressDTO address, String phone, String email) {
        this.drivingLicense = drivingLicense;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.emailID = email;
    }

    /**
     * This method is to get the Driving License
     * @return - Driving license in String Format.
     */
    public String getDrivingLicense() {
        return drivingLicense;
    }

    /**
     * This method is to set Driving License value
     * @param drivingLicense - Contain driving License detail.
     */
    public void setDrivingLicense(String drivingLicense) {
        if (drivingLicense == null || drivingLicense.isEmpty()) {
            System.out.println("Invalid driving license");
        } else {
            this.drivingLicense = drivingLicense;
        }
    }

    /**
     * This method is to get Customer name.
     * @return - Returns the Customer name in String Format.
     */
    public String getName() {
        return name;
    }

    /**
     * This is method is to set Customer Name
     * @param name - Contains Customer name
     */
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Invalid name");
        } else {
            this.name = name;
        }
    }

    /**
     * This method is to get Address Details.
     * @return - get AddressDTO with Address Details.
     */
    public AddressDTO getAddress() {
        return address;
    }

    /**
     * This method is to set Address Details
     * @param address - Contains Address details
     */
    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    /**
     * This method is to get Customer Phone number.
     * @return - Gives Phone number in string format.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method set the Customer phone number
     * @param phone - contains customer phone number
     */
    public void setPhone(String phone) {
        if (phone == null || phone.isEmpty() || !(isInteger(phone))) {
            System.out.println("Invalid phone number");
        } else {
            this.phone = phone;
        }
    }

    /**
     * This method gets Email ID of the Customer
     * @return - Gives customer emailID
     */
    public String getEmailID() {
        return emailID;
    }

    /**
     * This method sets the Email ID of the Customer
     * @param emailID - contains the emailID of customer.
     */
    public void setEmailID(String emailID) {
        if (emailID == null || emailID.isEmpty()) {
            System.out.println("Invalid emailID");
        } else {
            this.emailID = emailID;
        }
    }

     /**
     * This method validates whether the given string is Integer.
     * @param s - String containing the integer value.
     */
    private boolean isInteger(String s) {
        if (s.isEmpty()) {
            return false;
        }
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (!(Integer.parseInt(s.substring(i)) >= 0 && Integer.parseInt(s.substring(i)) <= 9)) {
                return false;
            }
        }
        return true;
    }
}
