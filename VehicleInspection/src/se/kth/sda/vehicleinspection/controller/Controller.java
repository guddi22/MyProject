/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.controller;

import se.kth.sda.vehicleinspection.integration.*;
import se.kth.sda.vehicleinspection.model.*;
import se.kth.sda.vehicleinspection.DTO.*;

/**
 *
 * @author - Shubha , Payal , Vimala
 * The Controller class calls the method from View(UI)
 * like moving vehicle to garage , Check if Vehicle exist in Registry
 * Getting Recommended Inspection Details, Inspection Cost computation,
 * Pay the Inspection Cost , Print Payment Receipt, Inspect Vehicle,
 * Print Inspected Result , Moving Vehicle out of garage after Inspection.
 */
public class Controller {

    private Garage garage;
    
    /**
     * Controller Constructor 
     * Object of Garage class created.
     */
    public Controller() {
        garage = new Garage();
        System.out.println("Open garage door");
    }

    /**
     * This method helps us to move Vehicle to Garage 
     * @return Garage details
     */
    public Garage moveVehicleToGarage() {
        int id = garage.nextCustomer();
        System.out.println("Now serving customer " + id);
        garage.closeDoor();
        System.out.println("Customer inside the garage. Door closes.");
        return garage;
    }

    /**
     * This method is Check if the Vehicle Number exist in Registry
     * @param vehicleDTO - Contain Vehicle information received from customer
     * @param customerDTO - Contain Customer information received.
     * @exception e - throws exception vehicle not found.
     */
    public void ensureVehicleExistsInRegistry(VehicleDTO vehicleDTO,CustomerDTO customerDTO) throws Exception {
        try{
            VehicleRegistry.ensureVehicleExistsInRegistry(vehicleDTO, customerDTO);
        }
        catch( Exception e)
        {
            throw e;
        }
    }

    /**
     * This method call Recommendation Inspection class to fetch Recommended Inspection
     * for given Vehicle Details
     * @param vehicleDTO - Contains Vehicle information
     * @return - Returns RecommendedInspection details.
     */
    public RecommendedInspection getRecommendedInspection(VehicleDTO vehicleDTO) {
        RecommendedInspection r = RecommendedInspection.getRecommendedInspections(vehicleDTO);
        r.print();
        return r;
    }

    /**
     * This method computes Inspection Cost for the given Recommended Inspection
     * @param recommendedInspection - Contains RecommendedInspection Details
     * @return - Returns Cost of Inspection in Float.
     */
    public Float computeInspectionCost(RecommendedInspection recommendedInspection) {
        InspectionDTO inspection = new InspectionDTO();
        Float totalCost = 0f;
        for (InspectionParts part : recommendedInspection.getRecommendedInspectionParts()) {
            totalCost += inspection.getInspectionCost(part);
        }
        System.out.println("Total inspection cost: " + totalCost);
        return totalCost;
    }

    /**
     * This method Performs the Payment of the Inspection Cost
     * @param p - Contains Payment details
     */
    public void pay(Payment p) {
        p.performTransaction();
    }

    /**
     * This method Prints the Payment Receipt
     * @param p - Contains Payment Details
     * @param vehicleDTO - Contains Vehicle Details
     * @param customerDTO - Contains Customer Details
     */
    public void printPaymentReceipt(Payment p, VehicleDTO vehicleDTO, CustomerDTO customerDTO) {
        System.out.println("Printing payment receipt");
        PaymentReceipt paymentReceipt = new PaymentReceipt(p, vehicleDTO, customerDTO);
        System.out.println(paymentReceipt.generatePaymentReceipt());
    }

    /**
     *  This method performs the Inspection based on Recommended Inspection
     * @param vehicleDTO - Contains Vehicle Details
     * @param recommendedInspection - Contains Recommended Inspection
     * @return - Return the Inspected Result of the Inspection.
     */
    public InspectionResult inspectVehicle(VehicleDTO vehicleDTO, RecommendedInspection recommendedInspection) {
        System.out.println("Performing Inspection");
        VehicleInspection vehicleInspection = new VehicleInspection(vehicleDTO, recommendedInspection);
        InspectionResult res = vehicleInspection.performInspection();
        return res;
    }
    
    /**
     * This method Prints the Inspection Receipt or Results.
     * @param result - Contain the Inspection Results.
     * @param customer - Contains the Customer Details.
     */
    public void printInspectionReceipt(InspectionResult result, CustomerDTO customer){
        InspectionReceipt receipt = new InspectionReceipt(result, customer);
        receipt.generateReceipt();
    }

    /**
     *  This is to move the Inspected Vehicle Out of Garage after Completion of 
     * Inspection.
     */
    public void moveVehicleOutOfGarage() {
        System.out.println("Inspection process completed. Garage door closed.");
        garage.openDoor();
    }
}
