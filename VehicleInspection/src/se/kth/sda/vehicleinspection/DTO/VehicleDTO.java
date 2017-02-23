/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.DTO;

/**
 *
 * @author - Shubha , Payal , Vimala
 *  This class VehicleDTO contain method get and set Vehicle Details.
 */
public class VehicleDTO {

    private String number;
    private String type;
    private String brand;
    private String model;
    private String color;

    /**
     * This method is VehicleDTO Constructor.
     * @param number - Contains Vehicle number.
     * @param type - Contains Vehicle type.
     * @param brand - Contains vehicle Brand details.
     * @param model - Contains vehicle model details.
     * @param color - Contains vehicle color.
     */
    public VehicleDTO(String number, String type, String brand, String model, String color) {
        this.brand = brand;
        this.type = type;
        this.number = number;
        this.model = model;
        this.color = color;
    }

    /**
     * This method gets the Vehicle number.
     * @return - Gives vehicle number.
     */
    public String getNumber() {
        return number;
    }

    /**
     * This method set value of Vehicle number.
     * @param number - contains the vehicle number.
     */
    public void setNumber(String number) {
        if (number == null || number.isEmpty()) {
            System.out.println("Invalid vehicle number");
        } else {
            this.number = number;
        }
    }

    /**
     * This is the method to get Vehicle Type
     * @return - Gives the vehicle type.
     */
    public String getType() {
        return type;
    }

    /**
     * This is method to Set the Vehicle Type
     * @param type - contains the Vehicle type.
     */
    public void setType(String type) {
        if (type == null || type.isEmpty()) {
            System.out.println("Invalid vehicle type");
        } else {
            this.type = type;
        }
    }

    /**
     * This method is to get the Brand details of Vehicle
     * @return - Gives the Vehicle Brand.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * This is the method to sets Vehicle Brand Detail.
     * @param brand - Contains the vehicle brand information
     */
    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            System.out.println("Invalid vehicle brand");
        } else {
            this.brand = brand;
        }
    }

    /**
     * This method gets the vehicle Model information.
     * @return - Gives the vehicle Model.
     */
    public String getModel() {
        return model;
    }

    /**
     * This is method to set the vehicle model
     * @param model - contains the vehicle model.
     */
    public void setModel(String model) {
        if (model == null || model.isEmpty()) {
            System.out.println("Invalid vehicle model");
        } else {
            this.model = model;
        }
    }

    /**
     * This method is to get the Vehicle color.
     * @return - Gives the vehicle color information.
     */
    public String getColor() {
        return color;
    }

    /**
     * This is method to set the vehicle color
     * @param color - Contains the vehicle color.
     */
    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            System.out.println("Invalid vehicle color");
        } else {
            this.color = color;
        }
    }
}
